/*
 * Copyright (C) 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.server.pm.verify.domain.models;

import android.annotation.NonNull;
import android.annotation.UserIdInt;
import android.util.ArraySet;

import com.android.internal.util.DataClass;

import java.util.Set;

/**
 * Tracks which domains have been explicitly enabled by the user, allowing it to automatically open
 * that domain when a web URL Intent is sent ft.
 */
@DataClass(genSetters = true, genEqualsHashCode = true, genToString = true)
public class DomainVerificationUserState {

    @UserIdInt
    private final int mUserId;

    /** List of domains which have been enabled by the user. **/
    @NonNull
    private final ArraySet<String> mEnabledHosts;

    /** Whether to disallow this package from automatically opening links by auto verification. */
    private boolean mDisallowLinkHandling;

    public DomainVerificationUserState(@UserIdInt int userId) {
        mUserId = userId;
        mEnabledHosts = new ArraySet<>();
    }

    public DomainVerificationUserState addHosts(@NonNull ArraySet<String> newHosts) {
        mEnabledHosts.addAll(newHosts);
        return this;
    }

    public DomainVerificationUserState addHosts(@NonNull Set<String> newHosts) {
        mEnabledHosts.addAll(newHosts);
        return this;
    }

    public DomainVerificationUserState removeHosts(@NonNull ArraySet<String> newHosts) {
        mEnabledHosts.removeAll(newHosts);
        return this;
    }

    public DomainVerificationUserState removeHosts(@NonNull Set<String> newHosts) {
        mEnabledHosts.removeAll(newHosts);
        return this;
    }


    // Code below generated by codegen v1.0.22.
    //
    // DO NOT MODIFY!
    // CHECKSTYLE:OFF Generated code
    //
    // To regenerate run:
    // $ codegen $ANDROID_BUILD_TOP/frameworks/base/services/core/java/com/android/server/pm/domain/verify/models/DomainVerificationUserState.java
    //
    // To exclude the generated code from IntelliJ auto-formatting enable (one-time):
    //   Settings > Editor > Code Style > Formatter Control
    //@formatter:off


    /**
     * Creates a new DomainVerificationUserState.
     *
     * @param enabledHosts
     *   List of domains which have been enabled by the user. *
     */
    @DataClass.Generated.Member
    public DomainVerificationUserState(
            @UserIdInt int userId,
            @NonNull ArraySet<String> enabledHosts,
            boolean disallowLinkHandling) {
        this.mUserId = userId;
        com.android.internal.util.AnnotationValidations.validate(
                UserIdInt.class, null, mUserId);
        this.mEnabledHosts = enabledHosts;
        com.android.internal.util.AnnotationValidations.validate(
                NonNull.class, null, mEnabledHosts);
        this.mDisallowLinkHandling = disallowLinkHandling;

        // onConstructed(); // You can define this method to get a callback
    }

    @DataClass.Generated.Member
    public @UserIdInt int getUserId() {
        return mUserId;
    }

    /**
     * List of domains which have been enabled by the user. *
     */
    @DataClass.Generated.Member
    public @NonNull ArraySet<String> getEnabledHosts() {
        return mEnabledHosts;
    }

    @DataClass.Generated.Member
    public boolean isDisallowLinkHandling() {
        return mDisallowLinkHandling;
    }

    @DataClass.Generated.Member
    public @NonNull DomainVerificationUserState setDisallowLinkHandling( boolean value) {
        mDisallowLinkHandling = value;
        return this;
    }

    @Override
    @DataClass.Generated.Member
    public String toString() {
        // You can override field toString logic by defining methods like:
        // String fieldNameToString() { ... }

        return "DomainVerificationUserState { " +
                "userId = " + mUserId + ", " +
                "enabledHosts = " + mEnabledHosts + ", " +
                "disallowLinkHandling = " + mDisallowLinkHandling +
        " }";
    }

    @Override
    @DataClass.Generated.Member
    public boolean equals(@android.annotation.Nullable Object o) {
        // You can override field equality logic by defining either of the methods like:
        // boolean fieldNameEquals(DomainVerificationUserState other) { ... }
        // boolean fieldNameEquals(FieldType otherValue) { ... }

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        @SuppressWarnings("unchecked")
        DomainVerificationUserState that = (DomainVerificationUserState) o;
        //noinspection PointlessBooleanExpression
        return true
                && mUserId == that.mUserId
                && java.util.Objects.equals(mEnabledHosts, that.mEnabledHosts)
                && mDisallowLinkHandling == that.mDisallowLinkHandling;
    }

    @Override
    @DataClass.Generated.Member
    public int hashCode() {
        // You can override field hashCode logic by defining methods like:
        // int fieldNameHashCode() { ... }

        int _hash = 1;
        _hash = 31 * _hash + mUserId;
        _hash = 31 * _hash + java.util.Objects.hashCode(mEnabledHosts);
        _hash = 31 * _hash + Boolean.hashCode(mDisallowLinkHandling);
        return _hash;
    }

    @DataClass.Generated(
            time = 1608234273324L,
            codegenVersion = "1.0.22",
            sourceFile = "frameworks/base/services/core/java/com/android/server/pm/domain/verify/models/DomainVerificationUserState.java",
            inputSignatures = "private final @android.annotation.UserIdInt int mUserId\nprivate final @android.annotation.NonNull android.util.ArraySet<java.lang.String> mEnabledHosts\nprivate  boolean mDisallowLinkHandling\npublic  com.android.server.pm.verify.domain.models.DomainVerificationUserState addHosts(android.util.ArraySet<java.lang.String>)\npublic  com.android.server.pm.verify.domain.models.DomainVerificationUserState addHosts(java.util.Set<java.lang.String>)\npublic  com.android.server.pm.verify.domain.models.DomainVerificationUserState removeHosts(android.util.ArraySet<java.lang.String>)\npublic  com.android.server.pm.verify.domain.models.DomainVerificationUserState removeHosts(java.util.Set<java.lang.String>)\nclass DomainVerificationUserState extends java.lang.Object implements []\n@com.android.internal.util.DataClass(genSetters=true, genEqualsHashCode=true, genToString=true)")
    @Deprecated
    private void __metadata() {}


    //@formatter:on
    // End of generated code

}
