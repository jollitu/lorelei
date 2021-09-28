package com.lorelei.model.user;

import java.util.List;

public class User
{
    private String username;

    private String password;

    private String email;

    // All below fields are created after the account, so they are present
    // here, but not in the UserDTO.

    private String lastLogin;

    // TODO convert string to actual masterlist object
    private List<String> masterlistEntries;

    // TODO convert string to actual favorites object/favorites wrapper
    private List<String> favoritesList;

    // TODO convert to profile object
    private String profile;

    private boolean banned = false;

    private boolean enabled = true;

    private boolean credentialsStillValid = true;

    public User()
    {
    }

    public User(String username, String password, String email, String lastLogin, List<String> masterlistEntries, List<String> favoritesList, String profile, boolean banned, boolean enabled, boolean credentialsStillValid)
    {
        this.username = username;
        this.password = password;
        this.email = email;
        this.lastLogin = lastLogin;
        this.masterlistEntries = masterlistEntries;
        this.favoritesList = favoritesList;
        this.profile = profile;
        this.banned = banned;
        this.enabled = enabled;
        this.credentialsStillValid = credentialsStillValid;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getLastLogin()
    {
        return lastLogin;
    }

    public void setLastLogin(String lastLogin)
    {
        this.lastLogin = lastLogin;
    }

    public List<String> getMasterlistEntries()
    {
        return masterlistEntries;
    }

    public void setMasterlistEntries(List<String> masterlistEntries)
    {
        this.masterlistEntries = masterlistEntries;
    }

    public List<String> getFavoritesList()
    {
        return favoritesList;
    }

    public void setFavoritesList(List<String> favoritesList)
    {
        this.favoritesList = favoritesList;
    }

    public String getProfile()
    {
        return profile;
    }

    public void setProfile(String profile)
    {
        this.profile = profile;
    }

    public boolean isBanned()
    {
        return banned;
    }

    public void setBanned(boolean banned)
    {
        this.banned = banned;
    }

    public boolean isEnabled()
    {
        return enabled;
    }

    public void setEnabled(boolean enabled)
    {
        this.enabled = enabled;
    }

    public boolean isCredentialsStillValid()
    {
        return credentialsStillValid;
    }

    public void setCredentialsStillValid(boolean credentialsStillValid)
    {
        this.credentialsStillValid = credentialsStillValid;
    }
}
