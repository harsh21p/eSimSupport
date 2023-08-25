# eSIM Eligibility Check Library

The eSIM Eligibility Check Library is a lightweight Android library written in Kotlin that allows you to determine whether eSIM (embedded SIM) is supported on a device. This library provides a simple `ESimSupport` class with a method `isESIMSupported` which takes an activity context as a parameter and returns a boolean value indicating whether the device supports eSIM.

## Installation

To integrate the eSIM Eligibility Check Library into your Android project, follow these steps:

1. Open your app-level `build.gradle` file.
2. Add the following dependency to your `dependencies` block:

```gradle
implementation  “com.esim.esimcheck:1.0.0”
```

3. Sync your project with the Gradle files.

## Usage

Using the eSIM Eligibility Check Library is straightforward. Here's how you can use it in your Android application:

1. Import the necessary classes:

```kotlin
import com.esim.esimcheck.ESimSupport
```

2. Inside your activity or fragment, you can call the `isESIMSupported` method to check eSIM eligibility:

```kotlin
val isESIMSupported = ESimSupport.isESIMSupported(this)
if (isESIMSupported) {
    // eSIM is supported on this device
} else {
    // eSIM is not supported on this device
}
```

## Compatibility

The eSIM Eligibility Check Library is compatible with Android API level 21 (Lollipop) and above.

## Contact

If you have any questions, suggestions, or feedback, please contact us at [pachoreharshad21@gmail.com].

---

By using the eSIM Eligibility Check Library, you can seamlessly determine whether eSIM is supported on a device and take appropriate actions within your Android application. Feel free to contribute to the library's development or report any issues on the [GitHub repository](https://github.com/harsh21p/eSimSupport).
