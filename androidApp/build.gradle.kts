plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.kotlinAndroid)
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
    kotlin("plugin.serialization") version libs.versions.kotlin
}

android {
    namespace = "com.evanadwyer.translator_kmm.android"
    compileSdk = 34
    defaultConfig {
        applicationId = "com.evanadwyer.translator_kmm.android"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.compose.compiler.get()
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(projects.shared)
    implementation(libs.compose.ui)
    implementation(libs.compose.ui.tooling)
    implementation(libs.compose.ui.tooling.preview)
    implementation(libs.compose.foundation)
    implementation(libs.compose.material)
    implementation(libs.compose.material3)
    implementation(libs.androidx.activity.compose)
    implementation(libs.compose.icons.extended)
    implementation(libs.compose.navigation)
    implementation(libs.compose.coil)
    implementation(libs.hilt.android)
    kapt(libs.hilt.android.compiler)
    kapt(libs.hilt.compiler)
    implementation(libs.hilt.navigation.compose)
    implementation(libs.ktor.android)

    androidTestImplementation(libs.test.runner)
    androidTestImplementation(libs.junit)
    androidTestImplementation(libs.compose.testing)
    debugImplementation(libs.compose.test.manifest)
    debugImplementation(libs.compose.ui.tooling)

    kaptAndroidTest(libs.hilt.android.compiler)
    androidTestImplementation(libs.hilt.testing)
}