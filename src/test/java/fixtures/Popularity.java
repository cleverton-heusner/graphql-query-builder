package fixtures;

public class Popularity {

    private final GetPostQuery getPostQuery;
    private boolean likes;
    private boolean dislikes;

    public Popularity(final GetPostQuery getPostQuery) {
        this.getPostQuery = getPostQuery;
    }

    public Popularity selectLikes() {
        likes = true;
        return this;
    }

    public Popularity selectDislikes() {
        dislikes = true;
        return this;
    }

    public Popularity skipLikes() {
        likes = false;
        return this;
    }

    public Popularity skipDislikes() {
        dislikes = false;
        return this;
    }

    public Popularity selectAllFields() {
        likes = true;
        dislikes = true;
        return this;
    }

    public Popularity ignoreAllFields() {
        likes = false;
        dislikes = false;
        return this;
    }

    public GetPostQuery endPopularitySelection() {
        return getPostQuery;
    }
}