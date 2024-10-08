package fixtures;

public class Friends {

    private final Author author;
    private boolean friendsId;
    private boolean friendsName;
    private boolean friendsProfilePicture;
    private final MutualFriends mutualFriends;

    public Friends(final Author author) {
        this.author = author;
        mutualFriends = new MutualFriends(this);
    }

    public Friends selectFriendsId() {
        friendsId = true;
        return this;
    }

    public Friends selectFriendsName() {
        friendsName = true;
        return this;
    }

    public Friends selectFriendsProfilePicture() {
        friendsProfilePicture = true;
        return this;
    }

    public Friends skipFriendsId() {
        friendsId = false;
        return this;
    }

    public Friends skipFriendsName() {
        friendsName = false;
        return this;
    }

    public Friends skipFriendsProfilePicture() {
        friendsProfilePicture = false;
        return this;
    }

    public Friends selectAllFields() {
        friendsId = true;
        friendsName = true;
        friendsProfilePicture = true;
        mutualFriends.selectAllFields();
        return this;
    }

    public Friends ignoreAllFields() {
        friendsId = false;
        friendsName = false;
        friendsProfilePicture = false;
        mutualFriends.ignoreAllFields();
        return this;
    }

    public MutualFriends fromMutualFriends() {
        return mutualFriends;
    }

    public Author endFriendsSelection() {
        return author;
    }
}