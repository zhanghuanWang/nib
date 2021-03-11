object Apps{
   //SDK版本
    const val compileSdkVersion = 30
    const val buildToolsVersion = "30.0.2"
    const val minSdkVersion = 21
    const val targetSdkVersion = 30
}
object Versions {
    const val gradle = "4.1.2"
    const val kotlin = "1.5.0-M1"
    const val appcompat = "1.2.0"



    /* test */
    const val junit = "4.+"
}

object Libs{
    const val androidToolsBuildGradle = "com.android.tools.build:gradle:${Versions.gradle}"
    const val kotlin_gradle_plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"

    const val kotlin_std = "org.jetbrains.kotlin:kotlin-stdlib:$${kotlinVersion}"

}