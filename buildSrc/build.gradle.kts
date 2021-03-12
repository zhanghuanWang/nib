plugins {
    `kotlin-dsl`
}

repositories {

    maven("http://maven.aliyun.com/nexus/content/groups/public/")
    maven("http://maven.aliyun.com/nexus/content/repositories/jcenter")
    maven("http://maven.aliyun.com/nexus/content/repositories/google")
    maven("http://maven.aliyun.com/nexus/content/repositories/gradle-plugin")
    mavenCentral()
    jcenter()
    google()
}