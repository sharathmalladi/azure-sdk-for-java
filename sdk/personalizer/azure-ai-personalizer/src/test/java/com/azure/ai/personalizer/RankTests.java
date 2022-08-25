// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.personalizer;

import com.azure.ai.personalizer.models.PersonalizerRankOptions;
import com.azure.ai.personalizer.models.PersonalizerRankResult;
import com.azure.ai.personalizer.models.PersonalizerRankableAction;
import com.azure.core.http.HttpClient;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;

import static com.azure.ai.personalizer.TestUtils.DISPLAY_NAME_WITH_ARGUMENTS;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RankTests extends PersonalizerTestBase {
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.personalizer.TestUtils#getTestParameters")
    public final void singleSlotRankTests(HttpClient httpClient, PersonalizerServiceVersion serviceVersion) {
        PersonalizerClient client = getClient(httpClient, serviceVersion, true);
        singleSlotRankTests(client);
    }

    private void singleSlotRankTests(PersonalizerClient client) {
        rankNullParameters(client);
        rankServerFeatures(client);
        rankWithNoExcludedFeatures(client);
    }

    private void rankNullParameters(PersonalizerClient client) {
        List<Object> features = new ArrayList<Object>() {
            {
                add(new Object() { String videoType = "documentary"; Integer videoLength = 35; String director = "CarlSagan"; });
                add(new Object() { String mostWatchedByAge = "30-35"; });
            }};
        List<PersonalizerRankableAction> actions = new ArrayList<>();
        actions.add(new PersonalizerRankableAction().setId("Person").setFeatures(features));
        PersonalizerRankOptions request = new PersonalizerRankOptions().setActions(actions).setContextFeatures(null).setExcludedActions(null);
        // Action
        PersonalizerRankResult response = client.rank(request);
        // Assert
        assertEquals(actions.size(), response.getRanking().size());
        for (int i = 0; i < response.getRanking().size(); i++) {
            assertEquals(actions.get(i).getId(), response.getRanking().get(i).getId());
        }
    }

    private void rankServerFeatures(PersonalizerClient client) {
        List<Object> contextFeatures = new ArrayList<Object>() {
            {
                add(new Object() { Object features = new Object() { String day = "Tuesday"; String time = "Night"; String weather = "rainy"; }; });
                add(new Object() { Object features = new Object() { String userId = "1234"; boolean payingUser = true; String favoriteGenre = "rainy"; double hoursOnSite = 0.12; String lastWatchedType = "movie"; }; });
            }
        };

        List<PersonalizerRankableAction> actions = new ArrayList<>();
        List<Object> features1 = new ArrayList<Object>() {
            {
                add(new Object() {
                    String videoType = "documentary";
                    Integer videoLength = 35;
                    String director = "CarlSagan";
                });
                add(new Object() {
                    String mostWatchedByAge = "30-35";
                });
            }
        };
        actions.add(new PersonalizerRankableAction().setId("Person1").setFeatures(features1));

        List<Object> features2 = new ArrayList<Object>() {
            {
                add(new Object() {
                    String videoType = "documentary";
                    Integer videoLength = 35;
                    String director = "CarlSagan";
                });
                add(new Object() {
                    String mostWatchedByAge = "40-45";
                });
            }
        };
        actions.add(new PersonalizerRankableAction().setId("Person2").setFeatures(features2));

        ArrayList<String> excludeActions = new ArrayList<String>() {
            {
                add("Person1");
            }
        };
        String eventId = "123456789";
        PersonalizerRankOptions request = new PersonalizerRankOptions().setActions(actions).setContextFeatures(contextFeatures).setExcludedActions(excludeActions).setEventId(eventId);
        // Action
        PersonalizerRankResult response = client.rank(request);
        // Assert
        assertEquals(eventId, response.getEventId());
        assertEquals(actions.size(), response.getRanking().size());
        for (int i = 0; i < response.getRanking().size(); i++) {
            assertEquals(actions.get(i).getId(), response.getRanking().get(i).getId());
        }
    }

    private void rankWithNoExcludedFeatures(PersonalizerClient client) {
        List<Object> contextFeatures = new ArrayList<Object>() {
            {
                add(new Object() { Object features = new Object() { String day = "tuesday"; boolean payingUser = true; String favoriteGenre = "documentary"; double hoursOnSite = 0.12; String lastWatchedType = "movie"; }; });
            }
        };

        List<Object> features1 = new ArrayList<Object>() {
            {
                add(new Object() { String videoType = "documentary"; Integer videoLength = 35; String director = "CarlSagan"; });
                add(new Object() { Object mostWatchedByAge = "30-35"; });
            }
        };

        List<Object> features2 = new ArrayList<Object>() {
            {
                add(new Object() { String videoType = "documentary"; Integer videoLength = 35; String director = "CarlSagan"; });
                add(new Object() { Object mostWatchedByAge = "40-45"; });
            }
        };

        List<PersonalizerRankableAction> actions = new ArrayList<PersonalizerRankableAction>();
        actions.add(new PersonalizerRankableAction().setId("Person1").setFeatures(features1));
        actions.add(new PersonalizerRankableAction().setId("Person2").setFeatures(features2));
        // Action
        PersonalizerRankResult response = client.rank(new PersonalizerRankOptions().setActions(actions).setContextFeatures(contextFeatures));
        assertEquals(actions.size(), response.getRanking().size());
    }
}
