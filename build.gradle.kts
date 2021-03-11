// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {

    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath(Libs.androidToolsBuildGradle)
        classpath(Libs.kotlinGradlePlugin)
    }
}

allprojects {
    repositories {
        maven { url 'http://maven.aliyun.com/nexus/content/groups/public/' }
        maven { url 'http://maven.aliyun.com/nexus/content/repositories/jcenter' }
        maven { url 'http://maven.aliyun.com/nexus/content/repositories/google' }
        maven { url 'http://maven.aliyun.com/nexus/content/repositories/gradle-plugin' }

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