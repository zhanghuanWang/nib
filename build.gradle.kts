// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {

    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath(Versions.androidToolsBuildGradle)
        classpath(Versions.kotlinGradlePlugin)
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}

//重写clean任务，删除build文件夹
tasks {
    val clean by registering(Delete::class) {
        delete(buildDir)
    }
}