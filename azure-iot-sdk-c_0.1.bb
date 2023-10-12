DESCRIPTION = "Azure IOT SDK C"
PRIORITY = "optional"
SECTION = "examples"
DEBUG_BUILD="1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
SRC_URI = "file://c-utility/ \
           file://certs/ \      
           file://CMakeLists.txt \           
           file://configs/ \              
           file://iothub_client/ \       
           file://iothub_service_client/ \    
           file://provisioning_client/ \    
           file://provisioning_service_client/ \    
           file://serializer/ \    
           file://umqtt/ \     
           file://uamqp/ \       
           file://deps/ \  
           file://samples/solutions/ \
           "

S = "${WORKDIR}"


inherit cmake pkgconfig 

PACKAGE_DEBUG_SPLIT_STYLE = "debug-without-src"

DEPENDS += " util-linux curl"


FILESEXTRAPATHS:prepend := "${THISDIR}:"
FILES:${PN} = "usr/cmake"