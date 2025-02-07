
# TorMatrix Android

TorMatrix Android is a fork of the [Element](https://element.io/) Matrix client. It has some privacy improvements, as well as a changed base URL to connect to the TorMatrix Onion server.

For more information about the original client's project, visit its [Github page](https://github.com/element-hq/element-android/).

# Compiling

For me, compiling the project on the latest Android Studio didn't work by default, I had to change the following in element-android/library/external/realmfieldnameshelper/build.gradle
- sourceCompatibility = JavaVersion.VERSION_21
- targetcompatibility = JavaVersion.VERSION_21

After that, it built without issues (apart from running out of memory a couple of times, but just keep pushing).

# TorMatrix Onion server

There is a Matrix server hosted behind TOR, running on an Onion service exclusively, intended to run in the long run and provide a free speech platform.

For more information about the server and to download a compiled APK, visit the Onion URL.

[http://qghpxemxapancgn5vg6hwcmhssxmq2pbjd6jcsxj7bzuv5az544ybhqd.onion](http://qghpxemxapancgn5vg6hwcmhssxmq2pbjd6jcsxj7bzuv5az544ybhqd.onion)

