package fixtures;

public class MutualFriends {

    private final Friends friends;
    private boolean mutualFriendsId;
    private boolean mutualFriendsName;

    public MutualFriends(final Friends friends) {
        this.friends = friends;
    }

    public MutualFriends selectMutualFriendsId() {
        mutualFriendsId = true;
        return this;
    }

    public MutualFriends selectMutualFriendsName() {
        mutualFriendsName = true;
        return this;
    }

    public MutualFriends skipMutualFriendsId() {
        mutualFriendsId = false;
        return this;
    }

    public MutualFriends skipMutualFriendsName() {
        mutualFriendsName = false;
        return this;
    }

    public MutualFriends selectAllFields() {
        mutualFriendsId = true;
        mutualFriendsName = true;
        return this;
    }

    public MutualFriends ignoreAllFields() {
        mutualFriendsId = false;
        mutualFriendsName = false;
        return this;
    }

    public Friends endMutualFriendsSelection() {
        return friends;
    }
}