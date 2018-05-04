package com.lib;

import android.os.Parcelable;

import java.io.Serializable;

import io.requery.Entity;
import io.requery.Key;
import io.requery.Persistable;

/**
 * Created by jerome on 5/4/18.
 */

@Entity
public interface User extends Parcelable, Persistable, Serializable {

    @Key
    Long getId();
}
