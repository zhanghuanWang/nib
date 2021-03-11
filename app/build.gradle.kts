plugins {
    id ("com.android.application")
    id ("kotlin-android")
    id ("kotlin-android-extensions")
    id ("kotlin-kapt")
}

android {
    compileSdkVersion(Versions.compileSdkVersion)
    buildToolsVersion(Versions.buildToolsVersion)

    defaultConfig {
        applicationId(Module.appApplicationId)
        minSdkVersion(Versions.minSdkVersion)
        targetSdkVersion(Versions.targetSdkVersion)
        versionCode(Versions.versionCode)
        versionName(Versions.versionName)
        multiDexEnabled=true

        testInstrumentationRunner("androidx.test.runner.AndroidJUnitRunner")
    }


    compileOptions {
        sourceCompatibility(JavaVersion.VERSION_1_8)
        targetCompatibility(JavaVersion.VERSION_1_8)
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    databinding.isEnabled = true

    buildTypes {
        getByName("release") {
            minifyEnabled(false)
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"
            )
        }
    }
}

dependencies {

    implementation(
            fileTree(
                    mapOf(
                            "dir" to "libs",
                            "include" to listOf("*.jar")
                    )
            )
    )
    implementation (kotlin(
            "stdlib-jdk7",
            org.jetbrains.kotlin.config.KotlinCompilerVersion.VERSION
    ))

    implementation(Versions.kotlinStdLib)
    implementation(Android.coreKtx)
    implementation(Android.appcompat)
    implementation(Android.material)
    implementation(Android.constraintlayout)
    testImplementation("junit:junit:4.+")
    androidTestImplementation("androidx.test.ext:junit:1.1.2")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.3.0")


}