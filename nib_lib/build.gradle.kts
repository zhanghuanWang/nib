import org.jetbrains.kotlin.cli.jvm.main

plugins {
    id(Module.libAppOrLib)
    id("kotlin-android")
    id("kotlin-android-extensions")
    id("kotlin-kapt")
}


android {
    compileSdkVersion(Apps.compile_sdk_version)
    buildToolsVersion(Apps.build_tools_version)

    defaultConfig {
        if (Module.libIsApp) {
            applicationId(Module.libApplicationId)
        }
        minSdkVersion(Apps.min_sdk_version)
        targetSdkVersion(Apps.target_sdk_version)
        versionCode(1)
        versionName("1.0.0.0")
        multiDexEnabled = true

        testInstrumentationRunner("androidx.test.runner.AndroidJUnitRunner")
        consumerProguardFiles("consumer-rules.pro")
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

    sourceSets["main"].manifest.srcFile(
        Module.selectManifest(Module.libIsApp)
    )
//    productFlavors{
//
//        register("app_test"){
//
//        }
//
//    }

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

    implementation(Libs.kotlin_std)
    implementation(Libs.Android.core_ktx)
    implementation(Libs.Android.appcompat)
    implementation(Libs.Android.material)
    implementation(Libs.Android.constraint_layout)
    implementation("org.jetbrains.kotlin:kotlin-stdlib:${rootProject.extra["kotlin_version"]}")
    implementation("androidx.appcompat:appcompat:1.2.0")
    implementation("androidx.constraintlayout:constraintlayout:2.0.4")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.2.0")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.2.0")

    testImplementation(Libs.Android.junit)
    androidTestImplementation(Libs.Android.test_junit)
    androidTestImplementation(Libs.Android.espresso_core)


}