package dependencies

const val COMPILE_SDK = 29
const val MIN_SDK = 14
const val TARGET_SDK = 29

const val VKOTLIN = "1.3.72"

const val ANDROID_PLUGIN = "com.android.tools.build:gradle:3.6.3"
const val KOTLIN_PLUGIN = "org.jetbrains.kotlin:kotlin-gradle-plugin:$VKOTLIN"
const val PUBLISH_PLUGIN = "com.vanniktech:gradle-maven-publish-plugin:0.11.1"

private const val VCOUROUTINE = "1.3.6"
const val KOTLIN = "org.jetbrains.kotlin:kotlin-stdlib:$VKOTLIN"
const val COROUTINE = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$VCOUROUTINE"
const val UI_COROUTINE = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$VCOUROUTINE"

const val KTX = "androidx.core:core-ktx:1.1.0"

const val APPCOMPAT = "androidx.appcompat:appcompat:1.1.0"
const val CONSTRAINTLAYOUT = "androidx.constraintlayout:constraintlayout:2.0.0-beta3"
const val RECYCLER_VIEW = "androidx.recyclerview:recyclerview:1.0.0"

const val ACTIVITYX = "androidx.activity:activity-ktx:1.1.0"
const val FRAGMENTX = "androidx.fragment:fragment-ktx:1.2.0"

const val VIEWMODEL = "androidx.lifecycle:lifecycle-viewmodel-ktx:2.0.0"
const val LIVEDATA = "androidx.lifecycle:lifecycle-livedata:2.0.0"
const val LIFECYCLE = "androidx.lifecycle:lifecycle-common:2.2.0"
const val LIFECYCLE_RUNTIME = "androidx.lifecycle:lifecycle-runtime-ktx:2.2.0"
const val LIFECYCLE_COMPILER = "androidx.lifecycle:lifecycle-compiler:2.0.0"
const val LIFECYCLE_EXTENSIONS = "androidx.lifecycle:lifecycle-extensions:2.0.0"

const val JUNIT = "junit:junit:4.12"
const val TRUTH = "com.google.truth:truth:1.0"
const val TEST_RULES = "androidx.test:rules:1.1.1"
const val TEST_RUNNER = "androidx.test:runner:1.1.1"
const val TEST_CORE = "androidx.test:core-ktx:1.1.0"
const val TEST_JUNIT_RULES = "androidx.test.ext:junit-ktx:1.1.0"
const val ESPRESSO = "androidx.test.espresso:espresso-core:3.1.1"
const val ROBOLECTRIC = "org.robolectric:robolectric:4.1"
