// To use this code, add the following Maven dependency to your project:
//
//
//     com.fasterxml.jackson.core     : jackson-databind          : 2.9.0
//     com.fasterxml.jackson.datatype : jackson-datatype-jsr310   : 2.9.0
//
// Import this package:
//
//     import com.sashantgroup.fafwiki.lang.Converter;
//
// Then you can deserialize a JSON string with
//
//     Lang data = Converter.fromJsonString(jsonString);

package com.sashantgroup.fafwiki.lang;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.io.IOException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;

@RequiresApi(api = Build.VERSION_CODES.O)
public class ConverterLang {
    // Date-time helpers

//    private static final DateTimeFormatter DATE_TIME_FORMATTER = new DateTimeFormatterBuilder()
//            .appendOptional(DateTimeFormatter.ISO_DATE_TIME)
//            .appendOptional(DateTimeFormatter.ISO_OFFSET_DATE_TIME)
//            .appendOptional(DateTimeFormatter.ISO_INSTANT)
//            .appendOptional(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SX"))
//            .appendOptional(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ssX"))
//            .appendOptional(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))
//            .toFormatter()
//            .withZone(ZoneOffset.UTC);
//
//    public static OffsetDateTime parseDateTimeString(String str) {
//        return ZonedDateTime.from(ConverterLang.DATE_TIME_FORMATTER.parse(str)).toOffsetDateTime();
//    }
//
//    private static final DateTimeFormatter TIME_FORMATTER = new DateTimeFormatterBuilder()
//            .appendOptional(DateTimeFormatter.ISO_TIME)
//            .appendOptional(DateTimeFormatter.ISO_OFFSET_TIME)
//            .parseDefaulting(ChronoField.YEAR, 2020)
//            .parseDefaulting(ChronoField.MONTH_OF_YEAR, 1)
//            .parseDefaulting(ChronoField.DAY_OF_MONTH, 1)
//            .toFormatter()
//            .withZone(ZoneOffset.UTC);
//
//    public static OffsetTime parseTimeString(String str) {
//        return ZonedDateTime.from(ConverterLang.TIME_FORMATTER.parse(str)).toOffsetDateTime().toOffsetTime();
//    }
    // Serialize/deserialize helpers

    public static Lang fromJsonString(String json) throws IOException {
        return getObjectReader().readValue(json);
    }

    public static String toJsonString(Lang obj) throws JsonProcessingException {
        return getObjectWriter().writeValueAsString(obj);
    }

    private static ObjectReader reader;
    private static ObjectWriter writer;

    private static void instantiateMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.findAndRegisterModules();
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        SimpleModule module = new SimpleModule();
//        module.addDeserializer(OffsetDateTime.class, new JsonDeserializer<OffsetDateTime>() {
//            @Override
//            public OffsetDateTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
//                String value = jsonParser.getText();
//                return ConverterLang.parseDateTimeString(value);
//            }
//        });
        mapper.registerModule(module);
        reader = mapper.readerFor(Lang.class);
        writer = mapper.writerFor(Lang.class);
    }

    private static ObjectReader getObjectReader() {
        if (reader == null) instantiateMapper();
        return reader;
    }

    private static ObjectWriter getObjectWriter() {
        if (writer == null) instantiateMapper();
        return writer;
    }
}
