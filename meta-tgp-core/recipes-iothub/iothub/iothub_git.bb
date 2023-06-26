# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5dac46abad17db93b2a17020eeeabdca"

SRC_URI = "git://github.com/tjmonk/iothub;protocol=https;branch=main"

# Modify these as desired
PV = "v0.1+git${SRCPV}"
SRCREV = "798b9744514cb96d4291d23f62aacf6b27ff7824"

S = "${WORKDIR}/git"

# NOTE: unable to map the following CMake package dependencies: azure_c_shared_utility
# NOTE: the following library dependencies are unknown, ignoring: iothub_client_mqtt_ws_transport umock_c iothub_client_http_transport REQUIRED iothub_client_amqp_transport iothub_client_amqp_ws_transport serializer iothub_client_mqtt_transport
#       (this is based on recipes that have previously been built and packaged)
DEPENDS = "varserver azure-uhttp-c curl openssl parson azure-uamqp-c azure-iot-sdk-c azure-umqtt-c util-linux-libuuid"

inherit cmake

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

