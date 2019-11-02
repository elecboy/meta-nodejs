require nodejs_10.inc

INC_PR = "r1"

LIC_FILES_CHKSUM = "file://LICENSE;md5=be980eb7ccafe287cb438076a65e888c"

SRC_URI[src.md5sum] = "e3eda57036e7dc9d8bfc5fe9160666fa"
SRC_URI[src.sha256sum] = "db5a5e03a815b84a1266a4b48bb6a6d887175705f84fd2472f0d28e5e305a1f8"

PACKAGECONFIG_append = " openssl zlib"
