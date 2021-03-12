// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {

    val kotlin_version by extra("1.4.30")
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath(Libs.android_tools_build_gradle)
        classpath(Libs.kotlin_gradle_plugin)
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version")
    }
}

allprojects {
    repositories {
        maven("http://maven.aliyun.com/nexus/content/groups/public/")
        maven("http://maven.aliyun.com/nexus/content/repositories/jcenter")
        maven("http://maven.aliyun.com/nexus/content/repositories/google")
        maven("http://maven.aliyun.com/nexus/content/repositories/gradle-plugin")
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