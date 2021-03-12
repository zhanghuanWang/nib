plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
    id("kotlin-kapt")
}

android {
    compileSdkVersion(Apps.compile_sdk_version)
    buildToolsVersion(Apps.build_tools_version)

    defaultConfig {
        applicationId(Module.appApplicationId)
        minSdkVersion(Apps.min_sdk_version)
        targetSdkVersion(Apps.target_sdk_version)
        versionCode(1)
        versionName("1.0.0.0")
        multiDexEnabled = true

        testInstrumentationRunner("androidx.test.runner.AndroidJUnitRunner")
    }


    compileOptions {
        sourceCompatibility(JavaVersion.VERSION_1_8)
        targetCompatibility(JavaVersion.VERSION_1_8)
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        dataBinding = true
    }

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
    implementation(
        kotlin(
            "stdlib-jdk7",
            org.jetbrains.kotlin.config.KotlinCompilerVersion.VERSION
        )
    )

    implementation(Libs.kotlin_std)
    implementation(Libs.Android.core_ktx)
    implementation(Libs.Android.appcompat)
    implementation(Libs.Android.material)
    implementation(Libs.Android.constraint_layout)

    testImplementation(Libs.Android.junit)
    androidTestImplementation(Libs.Android.test_junit)
    androidTestImplementation(Libs.Android.espresso_core)

}