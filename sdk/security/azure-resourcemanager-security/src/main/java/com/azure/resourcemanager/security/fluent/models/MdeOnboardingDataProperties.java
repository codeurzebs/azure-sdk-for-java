// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of the MDE configuration or data parameter needed to onboard the machine to MDE. */
@Fluent
public final class MdeOnboardingDataProperties {
    /*
     * The onboarding package used to onboard Windows machines to MDE, coded in base64. This can also be used for
     * onboarding using the dedicated VM Extension
     */
    @JsonProperty(value = "onboardingPackageWindows")
    private byte[] onboardingPackageWindows;

    /*
     * The onboarding package used to onboard Linux machines to MDE, coded in base64. This can also be used for
     * onboarding using the dedicated VM Extension
     */
    @JsonProperty(value = "onboardingPackageLinux")
    private byte[] onboardingPackageLinux;

    /**
     * Get the onboardingPackageWindows property: The onboarding package used to onboard Windows machines to MDE, coded
     * in base64. This can also be used for onboarding using the dedicated VM Extension.
     *
     * @return the onboardingPackageWindows value.
     */
    public byte[] onboardingPackageWindows() {
        return CoreUtils.clone(this.onboardingPackageWindows);
    }

    /**
     * Set the onboardingPackageWindows property: The onboarding package used to onboard Windows machines to MDE, coded
     * in base64. This can also be used for onboarding using the dedicated VM Extension.
     *
     * @param onboardingPackageWindows the onboardingPackageWindows value to set.
     * @return the MdeOnboardingDataProperties object itself.
     */
    public MdeOnboardingDataProperties withOnboardingPackageWindows(byte[] onboardingPackageWindows) {
        this.onboardingPackageWindows = CoreUtils.clone(onboardingPackageWindows);
        return this;
    }

    /**
     * Get the onboardingPackageLinux property: The onboarding package used to onboard Linux machines to MDE, coded in
     * base64. This can also be used for onboarding using the dedicated VM Extension.
     *
     * @return the onboardingPackageLinux value.
     */
    public byte[] onboardingPackageLinux() {
        return CoreUtils.clone(this.onboardingPackageLinux);
    }

    /**
     * Set the onboardingPackageLinux property: The onboarding package used to onboard Linux machines to MDE, coded in
     * base64. This can also be used for onboarding using the dedicated VM Extension.
     *
     * @param onboardingPackageLinux the onboardingPackageLinux value to set.
     * @return the MdeOnboardingDataProperties object itself.
     */
    public MdeOnboardingDataProperties withOnboardingPackageLinux(byte[] onboardingPackageLinux) {
        this.onboardingPackageLinux = CoreUtils.clone(onboardingPackageLinux);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}