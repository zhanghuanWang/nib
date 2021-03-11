
plugins {
    `kotlin-dsl`
}

repositories {
    maven { url 'http://maven.aliyun.com/nexus/content/groups/public/' }
    maven { url 'http://maven.aliyun.com/nexus/content/repositories/jcenter' }
    maven { url 'http://maven.aliyun.com/nexus/content/repositories/google' }
    maven { url 'http://maven.aliyun.com/nexus/content/repositories/gradle-plugin' }
    mavenCentral()
    jcenter()
    google()
}