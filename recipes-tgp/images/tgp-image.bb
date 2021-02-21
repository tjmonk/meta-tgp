require recipes-core/images/core-image-minimal.bb

DESCRIPTION = "The Gateway Project Core Components" 

IMAGE_INSTALL += "libvarserver varserver getvar setvar tcc"

