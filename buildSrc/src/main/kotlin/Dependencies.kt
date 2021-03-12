object Apps{
   //SDK版本
    const val compile_sdk_version = 30
    const val build_tools_version = "30.0.2"
    const val min_sdk_version = 21
    const val target_sdk_version = 30
}
object Versions {
    const val gradle = "4.1.2"
    const val kotlin = "1.5.0-M1"
    const val appcompat = "1.2.0"
    const val core_ktx = "1.3.1"
    const val constraint_layout = "2.0.4"
    const val material = "1.2.1"


    /* test */
    const val junit = "4.+"
    const val test_junit = "1.1.2"
    const val espresso_core = "3.3.0"
}

object Libs{
    const val android_tools_build_gradle = "com.android.tools.build:gradle:${Versions.gradle}"
    const val kotlin_gradle_plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"

    const val kotlin_std = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"


    object Android {

        const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
        const val core_ktx = "androidx.core:core-ktx:${Versions.core_ktx}"

        const val constraint_layout  = "androidx.constraintlayout:constraintlayout:${Versions.constraint_layout}"
        const val material          = "com.google.android.material:material:${Versions.material}"
        const val junit          = "junit:junit:${Versions.junit}"
        const val test_junit = "androidx.test.ext:junit:${Versions.test_junit}"
        const val espresso_core = "androidx.test.espresso:espresso-core:${Versions.espresso_core}"


        const val legacy            = "androidx.legacy:legacy-support-v4:1.0.0"
        const val paging            = "androidx.paging:paging-runtime:2.1.2"
        const val viewpager2        = "androidx.viewpager2:viewpager2:1.1.0-alpha01"
        const val multidex          = "com.android.support:multidex:1.0.3"
        val lifecycle = Lifecycle
        object Lifecycle {
            private const val lifecycle_version = "2.2.0"
            const val extensions    = "androidx.lifecycle:lifecycle-extensions:$lifecycle_version"
            const val liveDataKtx   = "androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version"
            const val commonJava8   = "androidx.lifecycle:lifecycle-common-java8:$lifecycle_version"
            const val viewModelKtx  = "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version"
        }


    }
}