plugins{
    alias(libs.plugins.android.library)
}

android{
    compileSdk = libs.versions.android.compileSdk.get().toInt()
    namespace = "com.zzhoujay.html"
    defaultConfig{
        minSdk = libs.versions.android.minSdk.get().toInt()
    }
    lint{
        abortOnError = false
        targetSdk = libs.versions.android.targetSdk.get().toInt()
    }
    compileOptions{
        sourceCompatibility = JavaVersion.toVersion(libs.versions.jvmTarget.get())
        targetCompatibility = JavaVersion.toVersion(libs.versions.jvmTarget.get())
    }
    buildTypes{
        getByName("release"){
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    publishing {
        singleVariant("release"){
            withSourcesJar()
            withJavadocJar()
        }
    }
    dependencies{
        implementation(libs.tagsoup)
    }
}