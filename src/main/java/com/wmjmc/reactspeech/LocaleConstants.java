package com.wmjmc.reactspeech;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/**
 * Created by JMC on 20/01/2016.
 */
public final class LocaleConstants {

    private LocaleConstants() { }

    public static final String LOCALE_DEFAULT = "DEFAULT";

    public static final String LOCALE_CANADA = "CANADA";
    public static final String LOCALE_CANADA_FRENCH = "CANADA_FRENCH";

    public static final String LOCALE_CHINA = "CHINA";
    public static final String LOCALE_CHINESE = "CHINESE";
    public static final String LOCALE_SIMPLIFIED_CHINESE = "SIMPLIFIED_CHINESE";
    public static final String LOCALE_TRADITIONAL_CHINESE = "TRADITIONAL_CHINESE";

    public static final String LOCALE_UK = "UK";
    public static final String LOCALE_US = "US";
    public static final String LOCALE_ENGLISH = "ENGLISH";

    public static final String LOCALE_FRANCE = "FRANCE";
    public static final String LOCALE_FRENCH = "FRENCH";

    public static final String LOCALE_GERMAN = "GERMAN";
    public static final String LOCALE_GERMANY = "GERMANY";

    public static final String LOCALE_ITALY = "ITALY";
    public static final String LOCALE_ITALIAN = "ITALIAN";

    public static final String LOCALE_JAPAN = "JAPAN";
    public static final String LOCALE_JAPANESE = "JAPANESE";

    public static final String LOCALE_KOREA = "KOREA";
    public static final String LOCALE_KOREAN = "KOREAN";

    public static final String LOCALE_TAIWAN = "TAIWAN";

    public static Map<String, Object> getConstants() {
        final Map<String, Object> constants = new HashMap<>();

        constants.put(LocaleConstants.LOCALE_DEFAULT, Locale.getDefault().toString());

        constants.put(LocaleConstants.LOCALE_CANADA, Locale.CANADA.toString());
        constants.put(LocaleConstants.LOCALE_CANADA_FRENCH, Locale.CANADA_FRENCH.toString());

        constants.put(LocaleConstants.LOCALE_CHINA, Locale.CHINA.toString());
        constants.put(LocaleConstants.LOCALE_CHINESE, Locale.CHINESE.toString());
        constants.put(LocaleConstants.LOCALE_SIMPLIFIED_CHINESE, Locale.SIMPLIFIED_CHINESE.toString());
        constants.put(LocaleConstants.LOCALE_TRADITIONAL_CHINESE, Locale.TRADITIONAL_CHINESE.toString());

        constants.put(LocaleConstants.LOCALE_UK, Locale.UK.toString());
        constants.put(LocaleConstants.LOCALE_US, Locale.US.toString());
        constants.put(LocaleConstants.LOCALE_ENGLISH, Locale.ENGLISH.toString());

        constants.put(LocaleConstants.LOCALE_FRANCE, Locale.FRANCE.toString());
        constants.put(LocaleConstants.LOCALE_FRENCH, Locale.FRENCH.toString());

        constants.put(LocaleConstants.LOCALE_GERMAN, Locale.GERMAN.toString());
        constants.put(LocaleConstants.LOCALE_GERMANY, Locale.GERMANY.toString());

        constants.put(LocaleConstants.LOCALE_ITALY, Locale.ITALY.toString());
        constants.put(LocaleConstants.LOCALE_ITALIAN, Locale.ITALIAN.toString());

        constants.put(LocaleConstants.LOCALE_JAPAN, Locale.JAPAN.toString());
        constants.put(LocaleConstants.LOCALE_JAPANESE, Locale.JAPANESE.toString());

        constants.put(LocaleConstants.LOCALE_KOREA, Locale.KOREA.toString());
        constants.put(LocaleConstants.LOCALE_KOREAN, Locale.KOREAN.toString());

        constants.put(LocaleConstants.LOCALE_TAIWAN, Locale.TAIWAN.toString());

        return constants;
    }
}
