@file:Suppress("FunctionName", "unused")

object Deps {
    const val compileSdkVersion = 30
    const val minSdkVersion = 21
    
    private const val kotlinVersion = "1.5.0"
    private const val coroutinesVersion = "1.5.0"
    private const val serializationVersion = "1.2.2"
    private const val nodejsExternalsVersion = "0.0.7"
    private const val ktorVersion = "1.6.0"
    private const val ktorOpenapiVersion = "0.2-beta.18"
    private const val exposedVersion = "0.32.1"
    private const val datetimeVersion = "0.2.1"

    private const val postgresqlVersion = "42.2.23"
    private const val slf4jJVersion = "1.7.31"
    private const val logbackVersion = "0.9.26"
    private const val sshVersion = "2.10.1"
    
    private const val materialVersion = "1.2.1"
    private const val recyclerViewVersion = "1.1.0"
    private const val swipeRefreshLayoutVersion = "1.1.0"
    private const val constraintLayoutVersion = "2.0.0"
    private const val lifecycleVersion = "2.2.0"
    private const val glideVersion = "4.12.0"
    private const val androidAppCompatVersion = "1.1.0"

    private const val androidGradlePluginVersion = "4.2.0"

    object Libs {
        object Kotlinx {
            const val Coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutinesVersion"
            const val Serialization = "org.jetbrains.kotlinx:kotlinx-serialization-json:$serializationVersion"
            const val Datetime = "org.jetbrains.kotlinx:kotlinx-datetime:$datetimeVersion"
            const val Nodejs = "org.jetbrains.kotlinx:kotlinx-nodejs:$nodejsExternalsVersion"
        }
        object Ktor {
            object Client {
                const val Core = "io.ktor:ktor-client-core:$ktorVersion"
                const val Cio = "io.ktor:ktor-client-cio:$ktorVersion"
                const val Serialization = "io.ktor:ktor-client-serialization:$ktorVersion"
            }
            object Server {
                const val Core = "io.ktor:ktor-server-core:$ktorVersion"
                const val Cio = "io.ktor:ktor-server-cio:$ktorVersion"
                const val Serialization = "io.ktor:ktor-serialization:$ktorVersion"
                const val Openapi = "com.github.papsign:Ktor-OpenAPI-Generator:$ktorOpenapiVersion"
            }
        }
        object Exposed {
            const val Core = "org.jetbrains.exposed:exposed-core:$exposedVersion"
            const val Jdbc = "org.jetbrains.exposed:exposed-jdbc:$exposedVersion"
            const val Time = "org.jetbrains.exposed:exposed-java-time:$exposedVersion"
        }
        object Postgres {
            const val Jdbc = "org.postgresql:postgresql:$postgresqlVersion"
        }
        object Logback {
            const val Classic = "ch.qos.logback:logback-classic:$logbackVersion"    
        }
        object Slf4j {
            const val Simple = "org.slf4j:slf4j-simple:$slf4jJVersion"
        }
        object Androidx {
            const val AppCompat =
                "androidx.appcompat:appcompat:$androidAppCompatVersion"
            const val Material =
                "com.google.android.material:material:$materialVersion"
            const val RecyclerView =
                "androidx.recyclerview:recyclerview:$recyclerViewVersion"
            const val SwipeRefreshLayout =
                "androidx.swiperefreshlayout:swiperefreshlayout:$swipeRefreshLayoutVersion"
            const val ConstraintLayout =
                "androidx.constraintlayout:constraintlayout:$constraintLayoutVersion"
            const val Lifecycle =
                "androidx.lifecycle:lifecycle-extensions:$lifecycleVersion"
            const val LifecycleKtx =
                "androidx.lifecycle:lifecycle-runtime-ktx:$lifecycleVersion"
        }
        object Bumtech {
            const val Glide =
                "com.github.bumptech.glide:glide:$glideVersion"
        }
    }
    object Kapt {
        object Bumtech {
            const val Glide = "com.github.bumptech.glide:compiler:$glideVersion"
        }
    }
    object Plugins {
        object Configuration {
            object Kotlin {
                const val Mpp = "k-mpp"
                const val Jvm = "k-jvm"
                const val Js = "k-js"
                object Android {
                    const val App = "k-android-app"
                    const val Library = "k-android-library"
                }
            }
        }
        object Dependencies {
            const val Id = "dependencies"
            const val Classpath = "dependencies:dependencies:SNAPSHOT"
        }
        object Kotlin {
            const val Multiplatform = "org.jetbrains.kotlin.multiplatform"
            const val Jvm = "org.jetbrains.kotlin.jvm"
            const val Js = "org.jetbrains.kotlin.js"
            const val Android = "org.jetbrains.kotlin.android"
            const val Classpath = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"
        }
        object Android {
            const val Application = "com.android.application"
            const val Library = "com.android.library"
            const val Classpath = "com.@file:Suppress("FunctionName", "unused")
2
​
3
object Deps {
4
    const val compileSdkVersion = 30
5
    const val minSdkVersion = 21
6
    
7
    private const val kotlinVersion = "1.5.0"
8
    private const val coroutinesVersion = "1.5.0"
9
    private const val serializationVersion = "1.2.2"
10
    private const val nodejsExternalsVersion = "0.0.7"
11
    private const val ktorVersion = "1.6.0"
12
    private const val ktorOpenapiVersion = "0.2-beta.18"
13
    private const val exposedVersion = "0.32.1"
14
    private const val datetimeVersion = "0.2.1"
15
​
16
    private const val postgresqlVersion = "42.2.23"
17
    private const val slf4jJVersion = "1.7.31"
18
    private const val logbackVersion = "0.9.26"
19
    private const val sshVersion = "2.10.1"
20
    
21
    private const val materialVersion = "1.2.1"
22
    private const val recyclerViewVersion = "1.1.0"
23
    private const val swipeRefreshLayoutVersion = "1.1.0"
24
    private const val constraintLayoutVersion = "2.0.0"
25
    private const val lifecycleVersion = "2.2.0"
26
    private const val glideVersion = "4.12.0"
27
    private const val androidAppCompatVersion = "1.1.0"
28
​
29
    private const val androidGradlePluginVersion = "4.2.0"
30
​
31
    object Libs {
32
        object Kotlinx {
33
            const val Coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutinesVersion"
34
            const val Serialization = "org.jetbrains.kotlinx:kotlinx-serialization-json:$serializationVersion"
35
            const val Datetime = "org.jetbrains.kotlinx:kotlinx-datetime:$datetimeVersion"
36
            const val Nodejs = "org.jetbrains.kotlinx:kotlinx-nodejs:$nodejsExternalsVersion"
37
        }
38
        object Ktor {
39
            object Client {
40
                const val Core = "io.ktor:ktor-client-core:$ktorVersion"
41
                const val Cio = "io.ktor:ktor-client-cio:$ktorVersion"
42
                const val Serialization = "io.ktor:ktor-client-serialization:$ktorVersion"
43
            }
44
            object Server {
45
                const val Core = "io.ktor:ktor-server-core:$ktorVersion"
46
                const val Cio = "io.ktor:ktor-server-cio:$ktorVersion"
47
                const val Serialization = "io.ktor:ktor-serialization:$ktorVersion"
48
                const val Openapi = "com.github.papsign:Ktor-OpenAPI-Generator:$ktorOpenapiVersion"
49
            }
50
        }
51
        object Exposed {
52
            const val Core = "org.jetbrains.exposed:exposed-core:$exposedVersion"
53
            const val Jdbc = "org.jetbrains.exposed:exposed-jdbc:$exposedVersion"
54
            const val Time = "org.jetbrains.exposed:exposed-java-time:$exposedVersion"
55
        }
56
        object Postgres {
57
            const val Jdbc = "org.postgresql:postgresql:$postgresqlVersion"
58
        }
59
        object Logback {
60
            const val Classic = "ch.qos.logback:logback-classic:$logbackVersion"    
61
        }
62
        object Slf4j {
63
            const val Simple = "org.slf4j:slf4j-simple:$slf4jJVersion"
64
        }
65
        object Androidx {
66
            const val AppCompat =
67
                "androidx.appcompat:appcompat:$androidAppCompatVersion"
68
            const val Material =
69
                "com.google.android.material:material:$materialVersion"
70
            const val RecyclerView =
71
                "androidx.recyclerview:recyclerview:$recyclerViewVersion"
72
            const val SwipeRefreshLayout =
73
                "androidx.swiperefreshlayout:swiperefreshlayout:$swipeRefreshLayoutVersion"
74
            const val ConstraintLayout =
75
                "androidx.constraintlayout:constraintlayout:$constraintLayoutVersion"
76
            const val Lifecycle =
77
                "androidx.lifecycle:lifecycle-extensions:$lifecycleVersion"
78
            const val LifecycleKtx =
79
                "androidx.lifecycle:lifecycle-runtime-ktx:$lifecycleVersion"
80
        }
81
        object Bumtech {
82
            const val Glide =
83
                "com.github.bumptech.glide:glide:$glideVersion"
84
        }
85
    }
86
    object Kapt {
87
        object Bumtech {
88
            const val Glide = "com.github.bumptech.glide:compiler:$glideVersion"
89
        }
90
    }
91
    object Plugins {
92
        object Dependencies {
93
            const val Id = "dependencies"
94
            const val Classpath = "dependencies:dependencies:SNAPSHOT"
95
        }
96
        object Kotlin {
97
            const val Multiplatform = "org.jetbrains.kotlin.multiplatform"
98
            const val Jvm = "org.jetbrains.kotlin.jvm"
99
            const val Js = "org.jetbrains.kotlin.js"
100
            const val Android = "org.jetbrains.kotlin.android"
101
            const val Classpath = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"
102
        }
103
        object Android {
104
            const val Application = "com.android.application"
105
            const val Library = "com.android.library"
106
            const val Classpath = "com.android.tools.build:gradle:$androidGradlePluginVersion"
107
        }
108
        object Serialization {
109
            const val Id = "org.jetbrains.kotlin.plugin.serialization"
110
            const val Classpath = "org.jetbrains.kotlin:kotlin-serialization:$kotlinVersion"
111
        }
112
        object Ssh {
113
            const val Id = "org.hidetake.ssh"
114
            const val Classpath = "org.hidetake:gradle-ssh-plugin:$sshVersion"
115
        }
116
        object Publish {
117
            const val Id = "publish"
118
            const val Classpath = "publish:publish:SNAPSHOT"
119
        }
120
        object MavenPublish {
121
            const val Id = "maven-publish"
122
        }
123
        object Application {
124
            const val Id = "application"
125
        }
126
    }
127
}
128
android.tools.build:gradle:$androidGradlePluginVersion"
        }
        object Serialization {
            const val Id = "org.jetbrains.kotlin.plugin.serialization"
            const val Classpath = "org.jetbrains.kotlin:kotlin-serialization:$kotlinVersion"
        }
        object Ssh {
            const val Id = "org.hidetake.ssh"
            const val Classpath = "org.hidetake:gradle-ssh-plugin:$sshVersion"
        }
        object Publish {
            const val Id = "publish"
            const val Classpath = "publish:publish:SNAPSHOT"
        }
        object MavenPublish {
            const val Id = "maven-publish"
        }
        object Application {
            const val Id = "application"
        }
    }
}
