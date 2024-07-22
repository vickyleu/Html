plugins{
    alias(libs.plugins.android.application)
}

android {
    compileSdk = libs.versions.android.compileSdk.get().toInt()
    namespace = "com.zzhoujay.htmldemo"
    defaultConfig {
        applicationId = "com.zzhoujay.htmldemo"
        minSdk = libs.versions.android.minSdk.get().toInt()
        versionCode =  1
        versionName = "1.0"
        targetSdk = libs.versions.android.targetSdk.get().toInt()
        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.toVersion(libs.versions.jvmTarget.get())
        targetCompatibility = JavaVersion.toVersion(libs.versions.jvmTarget.get())
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    dependencies{
        implementation(projects.htmlSpanner)
        implementation("com.android.support.constraint:constraint-layout:2.0.4")
        implementation("com.android.support:appcompat-v7:28.0.0")
        testImplementation("junit:junit:4.13.2")
        androidTestImplementation("com.android.support.test:runner:1.0.2")
        androidTestImplementation("com.android.support.test.espresso:espresso-core:3.0.2")

    }
}