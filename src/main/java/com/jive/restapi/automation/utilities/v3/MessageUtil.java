package com.jive.restapi.automation.utilities.v3;

import com.aurea.automation.openapi.common.Options;
import com.jive.restapi.generated.person.api.MessageApi;
import com.jive.restapi.generated.person.models.Message;
import com.jive.restapi.generated.person.models.OutcomeBase;
import io.restassured.response.Response;
import lombok.experimental.UtilityClass;

/**
 * Utility class for api calls in message group.
 */

@UtilityClass
public class MessageUtil {
    private static MessageApi api() {
        return ApiUtils.apiClient().message();
    }

    /**
     * createContentMessage.
     * <p>
     * Path   : "/messages/contents/{contentID}"
     * Method : post
     * OpId   : createContentMessage
     * Create a new message with the specified characteristics as a direct reply to the specified content object,
     * which must be a discussion. Uploaded files will be added to the message as attachments.
     *
     * @param contentID required parameter
     * @param body      required parameter
     * @return Generic response
     */
    @SafeVarargs
    public static Response createContentMessage(
            String contentID,
            Message body,
            Options.OptionsBuilder<MessageApi.CreateContentMessageOper>... options) {
        return Options.execute(api()
                        .createContentMessage()
                        .contentIDPath(contentID)
                        .body(body),
                options);
    }

    /**
     * getContentReplies.
     * <p>
     * Path   : "/messages/contents/{contentID}"
     * Method : get
     * OpId   : getContentReplies
     * Return a paginated list of messages for the specified content object, which must be a discussion, optionally
     * limiting the results to direct replies only.
     *
     * @param contentID required parameter
     * @return MessageEntities
     */
    @SafeVarargs
    public static Response getContentReplies(
            String contentID,
            Options.OptionsBuilder<MessageApi.GetContentRepliesOper>... options) {
        return Options.execute(api()
                        .getContentReplies()
                        .contentIDPath(contentID),
                options);
    }

    /**
     * createMessage.
     * <p>
     * Path   : "/messages"
     * Method : post
     * OpId   : createMessage
     * Create a new message with the specified characteristics.  The parent field must contain the URI of either a
     * discussion for which this is a direct reply, or the URI of a previous message to which this is a reply.
     * Uploaded files will be added to the message as attachments.
     *
     * @param body required parameter
     * @return Message
     */
    @SafeVarargs
    public static Response createMessage(
            Message body,
            Options.OptionsBuilder<MessageApi.CreateMessageOper>... options) {
        return Options.execute(api()
                        .createMessage()
                        .body(body),
                options);
    }

    /**
     * deleteMessage.
     * <p>
     * Path   : "/messages/{messageID}"
     * Method : delete
     * OpId   : deleteMessage
     * Delete the specified message.
     *
     * @param messageID required parameter
     * @return Generic response
     */
    @SafeVarargs
    public static Response deleteMessage(
            String messageID,
            Options.OptionsBuilder<MessageApi.DeleteMessageOper>... options) {
        return Options.execute(api()
                        .deleteMessage()
                        .messageIDPath(messageID),
                options);
    }

    /**
     * getMessage.
     * <p>
     * Path   : "/messages/{messageID}"
     * Method : get
     * OpId   : getMessage
     * Return the specified message with the specified fields.
     *
     * @param messageID required parameter
     * @return Message
     */
    @SafeVarargs
    public static Response getMessage(
            String messageID,
            Options.OptionsBuilder<MessageApi.GetMessageOper>... options) {
        return Options.execute(api()
                        .getMessage()
                        .messageIDPath(messageID),
                options);
    }

    /**
     * updateMessage.
     * <p>
     * Path   : "/messages/{messageID}"
     * Method : put
     * OpId   : updateMessage
     * Update the specified message with the specified characteristics including the option to replace existing
     * attachments with the ones uploaded in the request.
     *
     * @param messageID required parameter
     * @param body      required parameter
     * @return Message
     */
    @SafeVarargs
    public static Response updateMessage(
            String messageID,
            Message body,
            Options.OptionsBuilder<MessageApi.UpdateMessageOper>... options) {
        return Options.execute(api()
                        .updateMessage()
                        .messageIDPath(messageID)
                        .body(body),
                options);
    }

    /**
     * markCorrect.
     * <p>
     * Path   : "/messages/{messageID}/correctAnswer"
     * Method : put
     * OpId   : markCorrect
     * Mark the specified message correct.
     *
     * @param messageID required parameter
     * @return Generic response
     */
    @SafeVarargs
    public static Response markCorrect(
            String messageID,
            Options.OptionsBuilder<MessageApi.MarkCorrectOper>... options) {
        return Options.execute(api()
                        .markCorrect()
                        .messageIDPath(messageID),
                options);
    }

    /**
     * unmarkCorrect.
     * <p>
     * Path   : "/messages/{messageID}/correctAnswer"
     * Method : delete
     * OpId   : unmarkCorrect
     * Unmark the specified message correct.
     *
     * @return Generic response
     */
    @SafeVarargs
    public static Response unmarkCorrect(
            Options.OptionsBuilder<MessageApi.UnmarkCorrectOper>... options) {
        return Options.execute(api()
                        .unmarkCorrect(),
                options);
    }

    /**
     * getEditableMessage.
     * <p>
     * Path   : "/messages/{messageID}/editable"
     * Method : get
     * OpId   : getEditableMessage
     * Return the specified editable message with the specified fields.
     *
     * @param messageID required parameter
     * @return Message
     */
    @SafeVarargs
    public static Response getEditableMessage(
            String messageID,
            Options.OptionsBuilder<MessageApi.GetEditableMessageOper>... options) {
        return Options.execute(api()
                        .getEditableMessage()
                        .messageIDPath(messageID),
                options);
    }

    /**
     * lockEditableMessage.
     * <p>
     * Path   : "/messages/{messageID}/editable"
     * Method : post
     * OpId   : lockEditableMessage
     * Attempt to lock the specified message for editing.  This method will not fail if the message is already locked.
     * Check the 'editingBy' field in returned entity to see who owns the lock.
     *
     * @param messageID required parameter
     * @return Generic response
     */
    @SafeVarargs
    public static Response lockEditableMessage(
            String messageID,
            Options.OptionsBuilder<MessageApi.LockEditableMessageOper>... options) {
        return Options.execute(api()
                        .lockEditableMessage()
                        .messageIDPath(messageID),
                options);
    }


    /**
     * unlockEditableMessage.
     * <p>
     * Path   : "/messages/{messageID}/editable"
     * Method : delete
     * OpId   : unlockEditableMessage
     * Unlock the specified message.
     *
     * @param messageID required parameter
     * @return Generic response
     */
    @SafeVarargs
    public static Response unlockEditableMessage(
            String messageID,
            Options.OptionsBuilder<MessageApi.UnlockEditableMessageOper>... options) {
        return Options.execute(api()
                        .unlockEditableMessage()
                        .messageIDPath(messageID),
                options);
    }

    /**
     * updateEditableMessage.
     * <p>
     * Path   : "/messages/{messageID}/editable"
     * Method : put
     * OpId   : updateEditableMessage
     * Update the specified message with the specified characteristics including the option to replace existing
     * attachments with the ones uploaded in the request.
     *
     * @param messageID required parameter
     * @param body      required parameter
     * @return Message
     */
    @SafeVarargs
    public static Response updateEditableMessage(
            String messageID,
            Message body,
            Options.OptionsBuilder<MessageApi.UpdateEditableMessageOper>... options) {
        return Options.execute(api()
                        .updateEditableMessage()
                        .messageIDPath(messageID)
                        .body(body),
                options);
    }

    /**
     * createExtendedProperties.
     * <p>
     * Path   : "/messages/{messageID}/extprops"
     * Method : post
     * OpId   : createExtendedProperties
     * Save a new set of extended properties for a message, and return an entity representing the newly created
     * extended properties.  Any previous extended properties for this comment will be completely replaced.
     *
     * @param messageID required parameter
     * @return Generic response
     */
    @SafeVarargs
    public static Response createExtendedProperties(
            String messageID,
            Options.OptionsBuilder<MessageApi.CreateExtendedPropertiesOper>... options) {
        return Options.execute(api()
                        .createExtendedProperties()
                        .messageIDPath(messageID),
                options);
    }

    /**
     * deleteExtendedProperties.
     * <p>
     * Path   : "/messages/{messageID}/extprops"
     * Method : delete
     * OpId   : deleteExtendedProperties
     * Delete the existing extended properties for the specified message.
     *
     * @param messageID required parameter
     * @return Generic response
     */
    @SafeVarargs
    public static Response deleteExtendedProperties(
            String messageID,
            Options.OptionsBuilder<MessageApi.DeleteExtendedPropertiesOper>... options) {
        return Options.execute(api()
                        .deleteExtendedProperties()
                        .messageIDPath(messageID),
                options);
    }

    /**
     * getExtendedProperties.
     * <p>
     * Path   : "/messages/{messageID}/extprops"
     * Method : get
     * OpId   : getExtendedProperties
     * Return the extended properties for the specified message.
     *
     * @param messageID required parameter
     * @return Generic response
     */
    @SafeVarargs
    public static Response getExtendedProperties(
            String messageID,
            Options.OptionsBuilder<MessageApi.GetExtendedPropertiesOper>... options) {
        return Options.execute(api()
                        .getExtendedProperties()
                        .messageIDPath(messageID),
                options);
    }


    /**
     * createExtendedPropertiesForAddon.
     * <p>
     * Path   : "/messages/{messageID}/extprops/addOn/{addonUUID}"
     * Method : post
     * OpId   : createExtendedPropertiesForAddon
     * Save a new set of extended properties for a message, and return an entity representing the newly created
     * extended properties.  Any previous extended properties for this comment will be completely replaced.
     *
     * @param messageID required parameter
     * @param addonUUID required parameter
     * @return Generic response
     */
    @SafeVarargs
    public static Response createExtendedPropertiesForAddon(
            String messageID,
            String addonUUID,
            Options.OptionsBuilder<MessageApi.CreateExtendedPropertiesForAddonOper>... options) {
        return Options.execute(api()
                        .createExtendedPropertiesForAddon()
                        .messageIDPath(messageID)
                        .addonUUIDPath(addonUUID),
                options);
    }

    /**
     * deleteExtendedPropertiesForAddon.
     * <p>
     * Path   : "/messages/{messageID}/extprops/addOn/{addonUUID}"
     * Method : delete
     * OpId   : deleteExtendedPropertiesForAddon
     * Delete the existing extended properties for the specified message.
     *
     * @param addonUUID required parameter
     * @param messageID required parameter
     * @return Generic response
     */
    @SafeVarargs
    public static Response deleteExtendedPropertiesForAddon(
            String addonUUID,
            String messageID,
            Options.OptionsBuilder<MessageApi.DeleteExtendedPropertiesForAddonOper>... options) {
        return Options.execute(api()
                        .deleteExtendedPropertiesForAddon()
                        .addonUUIDPath(addonUUID)
                        .messageIDPath(messageID),
                options);
    }

    /**
     * getExtendedPropertiesForAddon.
     * <p>
     * Path   : "/messages/{messageID}/extprops/addOn/{addonUUID}"
     * Method : get
     * OpId   : getExtendedPropertiesForAddon
     * Return the extended properties for the specified message.
     *
     * @param messageID required parameter
     * @param addonUUID required parameter
     * @return Generic response
     */
    @SafeVarargs
    public static Response getExtendedPropertiesForAddon(
            String messageID,
            String addonUUID,
            Options.OptionsBuilder<MessageApi.GetExtendedPropertiesForAddonOper>... options) {
        return Options.execute(api()
                        .getExtendedPropertiesForAddon()
                        .messageIDPath(messageID)
                        .addonUUIDPath(addonUUID),
                options);
    }

    /**
     * createMessageHelpful.
     * <p>
     * Path   : "/messages/{messageID}/helpful"
     * Method : post
     * OpId   : createMessageHelpful
     * Register that the requesting person considers the specified message helpful.
     *
     * @param messageID required parameter
     * @return Generic response
     */
    @SafeVarargs
    public static Response createMessageHelpful(
            String messageID,
            Options.OptionsBuilder<MessageApi.CreateMessageHelpfulOper>... options) {
        return Options.execute(api()
                        .createMessageHelpful()
                        .messageIDPath(messageID),
                options);
    }

    /**
     * deleteMessageHelpful.
     * <p>
     * Path   : "/messages/{messageID}/helpful"
     * Method : delete
     * OpId   : deleteMessageHelpful
     * Delete the registration of the specified message as helpful by the requesting user.
     *
     * @param messageID required parameter
     * @return Generic response
     */
    @SafeVarargs
    public static Response deleteMessageHelpful(
            String messageID,
            Options.OptionsBuilder<MessageApi.DeleteMessageHelpfulOper>... options) {
        return Options.execute(api()
                        .deleteMessageHelpful()
                        .messageIDPath(messageID),
                options);
    }

    /**
     * getHaveMarkedHelpful.
     * <p>
     * Path   : "/messages/{messageID}/helpful"
     * Method : get
     * OpId   : getHaveMarkedHelpful
     * Return a paginated list of the people who consider this message helpful.
     *
     * @param messageID required parameter
     * @return Person
     */
    @SafeVarargs
    public static Response getHaveMarkedHelpful(
            String messageID,
            Options.OptionsBuilder<MessageApi.GetHaveMarkedHelpfulOper>... options) {
        return Options.execute(api()
                        .getHaveMarkedHelpful()
                        .messageIDPath(messageID),
                options);
    }

    /**
     * createMessageLike.
     * <p>
     * Path   : "/messages/{messageID}/likes"
     * Method : post
     * OpId   : createMessageLike
     * Register that the requesting person likes the specified message.
     *
     * @param messageID required parameter
     * @return Generic response
     */
    @SafeVarargs
    public static Response createMessageLike(
            String messageID,
            Options.OptionsBuilder<MessageApi.CreateMessageLikeOper>... options) {
        return Options.execute(api()
                        .createMessageLike()
                        .messageIDPath(messageID),
                options);
    }

    /**
     * deleteMessageLike.
     * <p>
     * Path   : "/messages/{messageID}/likes"
     * Method : delete
     * OpId   : deleteMessageLike
     * Delete the like of the specified message by the requesting user.
     *
     * @param messageID required parameter
     * @return Generic response
     */
    @SafeVarargs
    public static Response deleteMessageLike(
            String messageID,
            Options.OptionsBuilder<MessageApi.DeleteMessageLikeOper>... options) {
        return Options.execute(api()
                        .deleteMessageLike()
                        .messageIDPath(messageID),
                options);
    }

    /**
     * getMessageLikes.
     * <p>
     * Path   : "/messages/{messageID}/likes"
     * Method : get
     * OpId   : getMessageLikes
     * Return a paginated list of the people who like the specified message.
     *
     * @param messageID required parameter
     * @return Person
     */
    @SafeVarargs
    public static Response getMessageLikes(
            String messageID,
            Options.OptionsBuilder<MessageApi.GetMessageLikesOper>... options) {
        return Options.execute(api()
                        .getMessageLikes()
                        .messageIDPath(messageID),
                options);
    }

    /**
     * createReply.
     * <p>
     * Path   : "/messages/{messageID}/messages"
     * Method : post
     * OpId   : createReply
     * Create a new message as a reply to an existing message with the specified characteristics.
     * Uploaded files will be added to the message as attachments.
     *
     * @param messageID required parameter
     * @param body      required parameter
     * @return Message
     */
    @SafeVarargs
    public static Response createReply(
            String messageID,
            Message body,
            Options.OptionsBuilder<MessageApi.CreateReplyOper>... options) {
        return Options.execute(api()
                        .createReply()
                        .messageIDPath(messageID)
                        .body(body),
                options);
    }

    /**
     * getReplies.
     * <p>
     * Path   : "/messages/{messageID}/messages"
     * Method : get
     * OpId   : getReplies
     * Return a paginated list of messages that are replies to the specified message, optionally
     * limiting the returned results to direct replies only.
     *
     * @param messageID required parameter
     * @return Message
     */
    @SafeVarargs
    public static Response getReplies(
            String messageID,
            Options.OptionsBuilder<MessageApi.GetRepliesOper>... options) {
        return Options.execute(api()
                        .getReplies()
                        .messageIDPath(messageID),
                options);
    }

    /**
     * getOutcomeTypes.
     * <p>
     * Path   : "/messages/{messageID}/outcomeTypes"
     * Method : get
     * OpId   : getOutcomeTypes
     * Return a paginated list of the possible outcome types for the specified message.
     *
     * @param messageID required parameter
     * @return OutcomeType
     */
    @SafeVarargs
    public static Response getOutcomeTypes(
            String messageID,
            Options.OptionsBuilder<MessageApi.GetOutcomeTypesOper>... options) {
        return Options.execute(api()
                        .getOutcomeTypes()
                        .messageIDPath(messageID),
                options);
    }

    /**
     * createOutcome.
     * <p>
     * Path   : "/messages/{messageID}/outcomes"
     * Method : post
     * OpId   : createOutcome
     *
     * @param messageID required parameter
     * @param body      required parameter
     * @return OutcomeBase
     */
    @SafeVarargs
    public static Response createOutcome(
            String messageID,
            OutcomeBase body,
            Options.OptionsBuilder<MessageApi.CreateOutcomeOper>... options) {
        return Options.execute(api()
                        .createOutcome()
                        .messageIDPath(messageID)
                        .body(body),
                options);
    }

    /**
     * getOutcomes.
     * <p>
     * Path   : "/messages/{messageID}/outcomes"
     * Method : get
     * OpId   : getOutcomes
     * Return a paginated list of the outcomes for the specified message.
     *
     * @param messageID required parameter
     * @return OutcomeBase
     */
    @SafeVarargs
    public static Response getOutcomes(
            String messageID,
            Options.OptionsBuilder<MessageApi.GetOutcomesOper>... options) {
        return Options.execute(api()
                        .getOutcomes()
                        .messageIDPath(messageID),
                options);
    }

    /**
     * createMessageUnhelpful.
     * <p>
     * Path   : "/messages/{messageID}/unhelpful"
     * Method : post
     * OpId   : createMessageUnhelpful
     * Register that the requesting person considers the specified message unhelpful.
     *
     * @param messageID required parameter
     * @return Generic response
     */
    @SafeVarargs
    public static Response createMessageUnhelpful(
            String messageID,
            Options.OptionsBuilder<MessageApi.CreateMessageUnhelpfulOper>... options) {
        return Options.execute(api()
                        .createMessageUnhelpful()
                        .messageIDPath(messageID),
                options);
    }

    /**
     * deleteMessageUnhelpful.
     * <p>
     * Path   : "/messages/{messageID}/unhelpful"
     * Method : delete
     * OpId   : deleteMessageUnhelpful
     * Delete the registration of the specified message as unhelpful by the requesting user.
     *
     * @param messageID required parameter
     * @return Generic response
     */
    @SafeVarargs
    public static Response deleteMessageUnhelpful(
            String messageID,
            Options.OptionsBuilder<MessageApi.DeleteMessageUnhelpfulOper>... options) {
        return Options.execute(api()
                        .deleteMessageUnhelpful()
                        .messageIDPath(messageID),
                options);
    }

    /**
     * getHaveMarkedUnhelpful.
     * <p>
     * Path   : "/messages/{messageID}/unhelpful"
     * Method : get
     * OpId   : getHaveMarkedUnhelpful
     * Return a paginated list of the people who consider this message unhelpful.
     *
     * @param messageID required parameter
     * @return Person
     */
    @SafeVarargs
    public static Response getHaveMarkedUnhelpful(
            String messageID,
            Options.OptionsBuilder<MessageApi.GetHaveMarkedUnhelpfulOper>... options) {
        return Options.execute(api()
                        .getHaveMarkedUnhelpful()
                        .messageIDPath(messageID),
                options);
    }
}
