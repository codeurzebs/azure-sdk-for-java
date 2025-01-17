// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.OrcWriteSettings;

public final class OrcWriteSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OrcWriteSettings model = BinaryData.fromString(
            "{\"type\":\"OrcWriteSettings\",\"maxRowsPerFile\":\"datacghvsmvvfpkym\",\"fileNamePrefix\":\"datavvwfao\",\"\":{\"armtuprqtcxqkoh\":\"databoawzplwghfgq\",\"kdejparjvsbo\":\"datapya\",\"lnbklhwri\":\"datafjbdyyxhjfzjbwmr\",\"ff\":\"dataruljbhg\"}}")
            .toObject(OrcWriteSettings.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OrcWriteSettings model
            = new OrcWriteSettings().withMaxRowsPerFile("datacghvsmvvfpkym").withFileNamePrefix("datavvwfao");
        model = BinaryData.fromObject(model).toObject(OrcWriteSettings.class);
    }
}
