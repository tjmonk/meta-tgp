# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# Unable to find any files that looked like license statements. Check the accompanying
# documentation and source headers and set LICENSE and LIC_FILES_CHKSUM accordingly.
#
# NOTE: LICENSE is being set to "CLOSED" to allow you to at least start building - if
# this is not accurate with respect to the licensing of the software being built (it
# will not be in most cases) you must specify the correct value before using this
# recipe for anything other than initial testing/development!
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""

SRC_URI = "git://git@bitbucket.org/monktj/iothub.git;protocol=ssh;branch=main"

# Modify these as desired
PV = "1.0+git${SRCPV}"
SRCREV = "9d24136486838ad1bc129c90a7a9d6114e0fd7e7"

S = "${WORKDIR}/git"

# NOTE: unable to map the following CMake package dependencies: azure_c_shared_utility
# NOTE: the following library dependencies are unknown, ignoring: REQUIRED serializer iothub_client_mqtt_transport iothub_client_amqp_ws_transport iothub_client_amqp_transport umock_c iothub_service_client iothub_client_http_transport iothub_client_mqtt_ws_transport
#       (this is based on recipes that have previously been built and packaged)
DEPENDS = "parson util-linux curl openssl azure-umqtt-c azure-iot-sdk-c libvarserver azure-uhttp-c azure-uamqp-c"

inherit cmake

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

