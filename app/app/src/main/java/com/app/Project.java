package com.app;

import android.os.Parcelable;

import com.lib.User;

import java.io.Serializable;

import javax.persistence.JoinColumn;

import io.requery.Entity;
import io.requery.ForeignKey;
import io.requery.Key;
import io.requery.ManyToOne;
import io.requery.Persistable;

/**
 * Created by jerome on 5/4/18.
 */

@Entity
public interface Project extends Parcelable, Persistable, Serializable {

    @Key
    Long getId();

    @ForeignKey(references = User.class)
    @ManyToOne
    User getOwner();

}
