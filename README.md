# Coroutine AutoDispose

[![CircleCI](https://circleci.com/gh/satoshun/CoroutineAutoDispose.svg?style=svg)](https://circleci.com/gh/satoshun/CoroutineAutoDispose)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.github.satoshun.coroutine.autodispose/autodispose/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.github.satoshun.coroutine.autodispose/autodispose)
[![codecov](https://codecov.io/gh/satoshun/CoroutineAutoDispose/branch/master/graph/badge.svg)](https://codecov.io/gh/satoshun/CoroutineAutoDispose)
[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-CoroutineAutoDispose-green.svg?style=flat)](https://android-arsenal.com/details/1/7406)

Coroutine AutoDispose is an Kotlin Coroutine library for automatically disposal.

## Overview

Often, Coroutine subscriptions need to stop in response to some event (like a Activity#onStop()).
In order to support this common scenario in Coroutine.

### LifecycleAutoDisposeInterceptor(Lifecycle)

LifecycleAutoDisposeInterceptor can use with [CoroutineScope](https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines/-coroutine-scope/).
It create a CoroutineInterceptor for automatically disposal with AAC lifecycle events.

```kotlin
abstract class BaseActivity : AppCompatActivity(),
  CoroutineScope {

  override val coroutineContext get() = Dispatchers.Main +
      LifecycleAutoDisposeInterceptor(this) // or autoDisposeInterceptor()
}

class MainActivity : BaseActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    // automatically dispose when onDestroy
    launch {
      ...
    }
  }

  override fun onResume() {
    // automatically dispose when onPause
    launch {
      ...
    }
  }
}
```

### Lifecycle.autoDispose(Job)

This Job an automatically disposal with Android Lifecycle events.

```kotlin
val job = launch { ... }
lifecycle.autoDispose(job)
```

### ViewAutoDisposeInterceptor(Lifecycle)

ViewAutoDisposeInterceptor can use with [CoroutineScope](https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines/-coroutine-scope/).
It create a CoroutineInterceptor for automatically disposal with View attach/detach events.

```kotlin
class MainView(context: Context) : View(context), CoroutineScope {
  override val coroutineContext
    get() = Dispatchers.Main +
      ViewAutoDisposeInterceptor(this) // or autoDisposeInterceptor()
  ...
}
```

It can also be used from extension functions

```kotlin
val view = ...
view.autoDisposeScope.launch {
  ...
}
```

### Use with RecyclerView

CoroutineScope can be used from a itemView of RecyclerView.ViewHolder.

```kotlin
override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
  holder.itemView.autoDisposeScope.launch {
    ...
  }
}
```

## Download

```groovy
implementation 'com.github.satoshun.coroutine.autodispose:autodispose:${version}'
```

## etc

This library referred [uber/AutoDispose](https://github.com/uber/AutoDispose).
