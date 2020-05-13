package com.jive.restapi.automation.utilities.v3;

import com.aurea.automation.openapi.common.Options;
import com.jive.restapi.generated.person.api.ImagesApi;

import io.restassured.response.Response;
import lombok.experimental.UtilityClass;

/**
 * Utility class for api calls in images group.
 */

@UtilityClass
public class ImagesUtil {
    private static ImagesApi api() {
        return ApiUtils.apiClient().images();
    }

        
    /**
     * uploadImage.
     * 
     * Path   : "/images"
     * Method : post
     * OpId   : uploadImage
     * Upload an image as a multipart/form-data request body, store it as a temporary image, and return a 201 (Created) status with a Location header that specifies the absolute URL of this temporary image.
     * @param file required parameter
     * @return Image 
     */ 
    @SafeVarargs
    public static Response uploadImage(
                                    java.io.File file,
                                    Options.OptionsBuilder<ImagesApi.UploadImageOper>... options) {
        return Options.execute(api()
                .uploadImage()
                .fileMultiPart(file), options);

    }
    
    
    /**
     * deleteContentImage.
     * 
     * Path   : "/images/contents/images/{imageID}"
     * Method : delete
     * OpId   : deleteContentImage
     * Delete the specified image that belongs to an Update.
     * @param imageID required parameter
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response deleteContentImage(
                                    String imageID,
                                    Options.OptionsBuilder<ImagesApi.DeleteContentImageOper>... options) {
        return Options.execute(api()
                .deleteContentImage()
                .imageIDPath(imageID), options);

    }
    
    
    /**
     * getContentImages.
     * 
     * Path   : "/images/contents/{contentID}"
     * Method : get
     * OpId   : getContentImages
     * Return metadata about the images associated with an Update.
     * @param contentID required parameter
     * @return ImageEntities 
     */ 
    @SafeVarargs
    public static Response getContentImages(
                                    String contentID,
                                    Options.OptionsBuilder<ImagesApi.GetContentImagesOper>... options) {
        return Options.execute(api()
                .getContentImages()
                .contentIDPath(contentID), options);

    }
    
    
    /**
     * getCustomStatusLevelImage.
     * 
     * Path   : "/images/status/c/{name}"
     * Method : get
     * OpId   : getCustomStatusLevelImage
     * Return the binary image content of the custom status level image for the specified name.
     * @param name required parameter
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response getCustomStatusLevelImage(
                                    String name,
                                    Options.OptionsBuilder<ImagesApi.GetCustomStatusLevelImageOper>... options) {
        return Options.execute(api()
                .getCustomStatusLevelImage()
                .namePath(name), options);

    }
    
    
    /**
     * getDefaultStatusLevelImage.
     * 
     * Path   : "/images/status/{name}"
     * Method : get
     * OpId   : getDefaultStatusLevelImage
     * Return the binary image content of the default status level image for the specified name.
     * @param name required parameter
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response getDefaultStatusLevelImage(
                                    String name,
                                    Options.OptionsBuilder<ImagesApi.GetDefaultStatusLevelImageOper>... options) {
        return Options.execute(api()
                .getDefaultStatusLevelImage()
                .namePath(name), options);

    }
    
    
    /**
     * getImage.
     * 
     * Path   : "/images/{imageID}"
     * Method : get
     * OpId   : getImage
     * Return the specified image as binary content. If width is defined and height is not defined (or vice versa) then the returned size will depend on the value defined for aspect ratio. For instance, if the original image is 100 (W)x 600 (H) and 50 (W) is requested with preserveAspectRatio equals true, then the returned image will be 50 (W) x 300 (H). If preserveAspectRatio was false then the returned image will be 50 (W) x 600 (H). Remember that width and height are maximum possible values. This means that if you request 150 (W) then you will get 100 (W) since that is the size of the image.
     * @param imageID required parameter
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response getImage(
                                    String imageID,
                                    Options.OptionsBuilder<ImagesApi.GetImageOper>... options) {
        return Options.execute(api()
                .getImage()
                .imageIDPath(imageID), options);

    }
    
    
}
