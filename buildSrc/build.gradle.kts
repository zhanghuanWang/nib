apply {
    plugin("kotlin")
}
buildscript {
    repositories {
        gradlePluginPortal()
    }
    dependencies { classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.21") }
}
dependencies {
    implementation(gradleKotlinDsl())
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.4.21")
}
repositories {
    gradlePluginPortal()
}