package com.jive.restapi.automation.utilities.v3;

import com.jive.restapi.generated.person.api.TileDefinitionApi;

import com.aurea.automation.openapi.common.Options;
import io.restassured.response.Response;
import lombok.experimental.UtilityClass;

/**
 * Utility class for api calls in tileDefinition group.
 */

@UtilityClass
public class TileDefinitionUtils {
        private static TileDefinitionApi api() {
                return ApiUtils.apiClient().tileDefinition();
        }

        /**
         * getInstances.
         * 
         * <p>
         * Path : "/tileDefs" Method : get OpId : getInstances Return a paginated list
         * of existing tiles in the system.
         * 
         * @return TileDefinitionEntities
         */
        @SafeVarargs
        public static Response getInstances(Options.OptionsBuilder<TileDefinitionApi.GetInstancesOper>... options) {
                return Options.execute(api().getInstances(), options);
        }

        /**
         * getTileCategories.
         * 
         * <p>
         * Path : "/tileDefs/categories" Method : get OpId : getTileCategories Return a
         * paginated list of content objects that match the specified filter criteria.
         * 
         * @return TileCategoryEntities
         */
        @SafeVarargs
        public static Response getTileCategories(
                        Options.OptionsBuilder<TileDefinitionApi.GetTileCategoriesOper>... options) {
                return Options.execute(api().getTileCategories(), options);
        }

        /**
         * getTileCategory.
         * 
         * <p>
         * Path : "/tileDefs/category/{tileCategoryID}" Method : get OpId :
         * getTileCategory Return the specified tile category with the specified fields.
         * 
         * @param tileCategoryID required parameter
         * @return TileCategory
         */
        @SafeVarargs
        public static Response getTileCategory(String tileCategoryID,
                        Options.OptionsBuilder<TileDefinitionApi.GetTileCategoryOper>... options) {
                return Options.execute(api().getTileCategory().tileCategoryIDPath(tileCategoryID), options);
        }

        /**
         * deleteDefinition.
         * 
         * <p>
         * Path : "/tileDefs/{tileID}" Method : delete OpId : deleteDefinition Delete an
         * existing custom tile definition that was created by the requesting user
         * 
         * @param tileID required parameter
         * @return Generic response
         */
        @SafeVarargs
        public static Response deleteDefinition(String tileID,
                        Options.OptionsBuilder<TileDefinitionApi.DeleteDefinitionOper>... options) {
                return Options.execute(api().deleteDefinition().tileIDPath(tileID), options);
        }

        /**
         * getDefinition.
         * 
         * <p>
         * Path : "/tileDefs/{tileID}" Method : get OpId : getDefinition Return the
         * specified tile definition with the specified fields.
         * 
         * @param tileID required parameter
         * @return TileDefinition
         */
        @SafeVarargs
        public static Response getDefinition(String tileID,
                        Options.OptionsBuilder<TileDefinitionApi.GetDefinitionOper>... options) {
                return Options.execute(api().getDefinition().tileIDPath(tileID), options);
        }

        /**
         * getI18nResource.
         * 
         * <p>
         * Path : "/tileDefs/{tileID}/i18n" Method : get OpId : getI18nResource
         * Retrieves the current i18n resource bundle for the default locale.
         * 
         * @param tileID required parameter
         * @return Generic response
         */
        @SafeVarargs
        public static Response getI18nResource(String tileID,
                        Options.OptionsBuilder<TileDefinitionApi.GetI18nResourceOper>... options) {
                return Options.execute(api().getI18nResource().tileIDPath(tileID), options);
        }

        /**
         * getI18nResourceByLang.
         * 
         * <p>
         * Path : "/tileDefs/{tileID}/i18n/{lang}" Method : get OpId :
         * getI18nResourceByLang Retrieves the current i18n resource bundle for a
         * language.
         * 
         * @param tileID required parameter
         * @param lang   required parameter
         * @return Generic response
         */
        @SafeVarargs
        public static Response getI18nResourceByLang(String tileID, String lang,
                        Options.OptionsBuilder<TileDefinitionApi.GetI18nResourceByLangOper>... options) {
                return Options.execute(api().getI18nResourceByLang().tileIDPath(tileID).langPath(lang), options);
        }

        /**
         * getI18nResourceByLangAndCountry.
         * 
         * <p>
         * Path : "/tileDefs/{tileID}/i18n/{lang}/{country}" Method : get OpId :
         * getI18nResourceByLangAndCountry Retrieves the current i18n resource bundle
         * for a language and country.
         * 
         * @param tileID  required parameter
         * @param lang    required parameter
         * @param country required parameter
         * @return Generic response
         */
        @SafeVarargs
        public static Response getI18nResourceByLangAndCountry(String tileID, String lang, String country,
                        Options.OptionsBuilder<TileDefinitionApi.GetI18nResourceByLangAndCountryOper>... options) {
                return Options.execute(api().getI18nResourceByLangAndCountry().tileIDPath(tileID).langPath(lang)
                                .countryPath(country), options);
        }

        /**
         * getPrototype.
         * 
         * <p>
         * Path : "/tileDefs/{tileID}/prototype" Method : get OpId : getPrototype Return
         * a new tile instance, that is not persistent, based on the specified tile
         * definition.
         * 
         * @param tileID required parameter
         * @return TileDefinition
         */
        @SafeVarargs
        public static Response getPrototype(String tileID,
                        Options.OptionsBuilder<TileDefinitionApi.GetPrototypeOper>... options) {
                return Options.execute(api().getPrototype().tileIDPath(tileID), options);
        }

}
