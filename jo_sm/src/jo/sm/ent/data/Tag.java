/**
 * Copyright 2014 
 * SMEdit https://github.com/StarMade/SMEdit
 * SMTools https://github.com/StarMade/SMTools
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 **/
package jo.sm.ent.data;

import jo.sm.ent.logic.TagLogic;

/**
 * @Auther Jo Jaquinta for SMEdit Classic - version 1.0
 **/
public class Tag {

    private TagType mType;
    private TagType mSubType;
    private String mName;
    private Object mValue;

    public Tag() {
        mType = TagType.FINISH;
        mName = null;
        mValue = null;
    }

    public Tag(TagType type, String name, Object value) {
        mType = type;
        mName = name;
        TagLogic.setValue(this, value); // validation is here
    }

    @Override
    public String toString() {
        return mName + " (" + mValue + ")";
    }

    public TagType getSubType() {
        return mSubType;
    }

    public void setSubType(TagType subType) {
        mSubType = subType;
    }

    public TagType getType() {
        return mType;
    }

    public void setType(TagType type) {
        mType = type;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public Object getValue() {
        return mValue;
    }

    public void setValue(Object value) {
        mValue = value;
    }
}
