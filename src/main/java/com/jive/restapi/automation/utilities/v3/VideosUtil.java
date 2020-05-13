package com.jive.restapi.automation.utilities.v3;

import com.aurea.automation.openapi.common.Options;
import com.jive.restapi.generated.person.api.VideosApi;

import io.restassured.response.Response;
import lombok.experimental.UtilityClass;

/**
 * Utility class for api calls in videos group.
 */

@UtilityClass
public class VideosUtil {
    private static VideosApi api() {
        return ApiUtils.apiClient().videos();
    }

        
    /**
     * uploadVideo.
     * 
     * Path   : "/videos"
     * Method : post
     * OpId   : uploadVideo
     * Upload a video as a multipart/form-data request body, pass it to the video provider, and return a 201 (Accepted) status.
     * @param file required parameter
     * @return Video 
     */ 
    @SafeVarargs
    public static Response uploadVideo(
                                    java.io.File file,
                                    Options.OptionsBuilder<VideosApi.UploadVideoOper>... options) {
        return Options.execute(api()
                .uploadVideo()
                .fileMultiPart(file), options);

    }
    
    
    /**
     * getDownloadOptions.
     * 
     * Path   : "/videos/downloadOptions/{videoID}"
     * Method : get
     * OpId   : getDownloadOptions
     * Return the Download options for this video.
     * @param videoID required parameter
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response getDownloadOptions(
                                    String videoID,
                                    Options.OptionsBuilder<VideosApi.GetDownloadOptionsOper>... options) {
        return Options.execute(api()
                .getDownloadOptions()
                .videoIDPath(videoID), options);

    }
    
    
    /**
     * getEmbeddedVideo.
     * 
     * Path   : "/videos/embedded/{videoID}/contentType/{contentType}/contentID/{contentID}"
     * Method : get
     * OpId   : getEmbeddedVideo
     * Return the specified inline video with the specified fields. The parameters contentType and contentID are usually obtained from the body of the content object that contains the inline video. In the body look for a macro named 'jive-content-video' and in particular for the attributes 'data-object-type', 'data-object-id' and 'data-video-ids'.
     * @param videoID required parameter
     * @param contentType required parameter
     * @param contentID required parameter
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response getEmbeddedVideo(
                                    String videoID,
                                    String contentType,
                                    String contentID,
                                    Options.OptionsBuilder<VideosApi.GetEmbeddedVideoOper>... options) {
        return Options.execute(api()
                .getEmbeddedVideo()
                .videoIDPath(videoID)
                .contentTypePath(contentType)
                .contentIDPath(contentID), options);

    }
    
    
    /**
     * getVideoImage.
     * 
     * Path   : "/videos/images/{videoID}"
     * Method : get
     * OpId   : getVideoImage
     * Return the still image of the specified video as binary content and scaled to the requested size.
     * @param videoID required parameter
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response getVideoImage(
                                    String videoID,
                                    Options.OptionsBuilder<VideosApi.GetVideoImageOper>... options) {
        return Options.execute(api()
                .getVideoImage()
                .videoIDPath(videoID), options);

    }
    
    
    /**
     * getUploadConfig.
     * 
     * Path   : "/videos/uploadConfig"
     * Method : post
     * OpId   : getUploadConfig
     * Return an upload configuration to use with the Perceptive uploader.
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response getUploadConfig(
                                    Options.OptionsBuilder<VideosApi.GetUploadConfigOper>... options) {
        return Options.execute(api()
                .getUploadConfig(), options);

    }
    
    
}
