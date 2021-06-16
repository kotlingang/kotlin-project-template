plugins {
    // k-mpp, k-js or k-jvm
    id(`k-jvm`)
}

group = AppInfo.PACKAGE
version = AppInfo.VERSION

allprojects {
    repositories {
        mavenCentral()
    }
}
