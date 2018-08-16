package com.yahoo.r4hu7.instagram;

import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ProfileActivity extends AppCompatActivity {

    RecyclerView rvStoryContainer;
    RecyclerView rvFeedContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Toolbar toolbar = findViewById(R.id.tbPrimary);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        rvStoryContainer = findViewById(R.id.rvStoryContainer);
        rvFeedContainer = findViewById(R.id.rvFeedContainer);

        initStory();
        initFeeds();

    }

    private void initStory() {
        List<Story> storyList = new ArrayList<>();

        storyList.add(new Story(
                "sgvu",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f1/Gyan_Vihar_Logo.jpg/220px-Gyan_Vihar_Logo.jpg"
        ));

        storyList.add(new Story(
                "jecrc",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRYrTdWB47RC8uuU_y6wGPHoVNglPQ2jIKjXhEyzSXyVb3Q4-awsA"
        ));

        storyList.add(new Story(
                "nickie_jones",
                "https://cdn.skim.gs/image/upload/v1456338154/msi/woman-taking-your-picture-6_meiftn.jpg"
        ));

        storyList.add(new Story(
                "lill_crazy",
                "https://instagram.fjai1-2.fna.fbcdn.net/vp/1927169880e72bef8cd69293d7423cc0/5C0F5D44/t51.2885-15/e15/11348120_385729598287467_976395022_n.jpg"
        ));

        storyList.add(new Story(
                "samuel_morse",
                "https://images.askmen.com/1080x540/2016/01/25-021526-facebook_profile_picture_affects_chances_of_getting_hired.jpg"
        ));

        storyList.add(new Story(
                "jecrc",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRYrTdWB47RC8uuU_y6wGPHoVNglPQ2jIKjXhEyzSXyVb3Q4-awsA"
        ));

        storyList.add(new Story(
                "nickie_jones",
                "https://cdn.skim.gs/image/upload/v1456338154/msi/woman-taking-your-picture-6_meiftn.jpg"
        ));

        storyList.add(new Story(
                "lill_crazy",
                "https://instagram.fjai1-2.fna.fbcdn.net/vp/1927169880e72bef8cd69293d7423cc0/5C0F5D44/t51.2885-15/e15/11348120_385729598287467_976395022_n.jpg"
        ));

        storyList.add(new Story(
                "samuel_morse",
                "https://images.askmen.com/1080x540/2016/01/25-021526-facebook_profile_picture_affects_chances_of_getting_hired.jpg"
        ));
        StoryAdapter adapter = new StoryAdapter(storyList);

        rvStoryContainer.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        rvStoryContainer.addItemDecoration(new RecyclerView.ItemDecoration() {
            private int spacing = 36;
            private int spacing_vertical = 26;

            @Override
            public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
                outRect.top = spacing_vertical;
                outRect.right = spacing;
                outRect.bottom = spacing_vertical;
                outRect.left = spacing;
            }
        });
        rvStoryContainer.setAdapter(adapter);
    }

    private void initFeeds() {
        List<Feed> feeds = new ArrayList<>();

        feeds.add(new Feed(
                "sgvu",
                "https://www.findingtheuniverse.com/wp-content/uploads/2017/01/Bakers2Bbeach2BVEO2Btripod2Bsunset2Bsan2Bfrancisco_by_Laurence2BNorah.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f1/Gyan_Vihar_Logo.jpg/220px-Gyan_Vihar_Logo.jpg",
                5,
                232));

        feeds.add(new Feed(
                "sam_chores",
                "https://www.adorama.com/alc/wp-content/uploads/2017/08/shutterstock_630297917.jpg",
                "https://blog.kicksta.co/wp-content/uploads/2016/05/photo-1453574503519-1ae2536262ec-850x567.jpeg",
                20,
                122));

        feeds.add(new Feed(
                "samuel_morse",
                "https://i2.wp.com/digital-photography-school.com/wp-content/uploads/2017/01/Potluck.jpg?fit=717%2C478&ssl=1",
                "https://images.askmen.com/1080x540/2016/01/25-021526-facebook_profile_picture_affects_chances_of_getting_hired.jpg",
                46,
                234));

        feeds.add(new Feed(
                "lill_crazy",
                "http://pixelphotography.info/wp-content/uploads/2018/04/professional-photography-courses-in-Delhi.jpg",
                "https://instagram.fjai1-2.fna.fbcdn.net/vp/1927169880e72bef8cd69293d7423cc0/5C0F5D44/t51.2885-15/e15/11348120_385729598287467_976395022_n.jpg",
                54,
                123));
        FeedAdapter adapter = new FeedAdapter(feeds);

        rvFeedContainer.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        rvFeedContainer.addItemDecoration(new RecyclerView.ItemDecoration() {
            private int spacing = 36;

            @Override
            public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
                outRect.bottom = spacing;
            }
        });

        rvFeedContainer.setAdapter(adapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.feed, menu);
        return super.onCreateOptionsMenu(menu);
    }

    class StoryAdapter extends RecyclerView.Adapter<StoryAdapter.ViewHolder> {

        List<Story> items;

        public StoryAdapter(List<Story> items) {
            this.items = items;
        }

        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_story, parent, false);
            return new ViewHolder(v);
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            GlideApp.with(holder.ivProfile)
                    .asBitmap()
                    .centerCrop()
                    .circleCrop()
                    .load(items.get(position).getProfileImgUrl())
                    .into(holder.ivProfile);
            holder.tvUserName.setText(items.get(position).getUserName());
        }

        @Override
        public int getItemCount() {
            return items.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {
            ImageView ivProfile;
            TextView tvUserName;

            public ViewHolder(View itemView) {
                super(itemView);
                ivProfile = itemView.findViewById(R.id.ivProfile);
                tvUserName = itemView.findViewById(R.id.tvUserName);
            }
        }
    }

    class FeedAdapter extends RecyclerView.Adapter<FeedAdapter.ViewHolder> {

        List<Feed> items;

        public FeedAdapter(List<Feed> items) {
            this.items = items;
        }

        @NonNull
        @Override
        public FeedAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_feed, parent, false);
            return new ViewHolder(v);
        }

        @Override
        public void onBindViewHolder(@NonNull FeedAdapter.ViewHolder holder, int position) {
            GlideApp.with(holder.ivProfile)
                    .asBitmap()
                    .centerCrop()
                    .circleCrop()
                    .load(items.get(position).getProfileImgUrl())
                    .into(holder.ivProfile);
            GlideApp.with(holder.ivFeed)
                    .asBitmap()
                    .fitCenter()
                    .load(items.get(position).getFeedImgUrl())
                    .into(holder.ivFeed);

            holder.tvUserName.setText(items.get(position).getUserName());
            holder.tvLikeCount.setText(String.format("%d likes", items.get(position).getLikes()));
            holder.tvTime.setText(String.format("%d minutes ago", items.get(position).getMinutePassed()));
        }

        @Override
        public int getItemCount() {
            return items.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {
            ImageView ivProfile;
            ImageView ivFeed;
            TextView tvUserName;
            TextView tvLikeCount;
            TextView tvTime;

            public ViewHolder(View itemView) {
                super(itemView);
                ivProfile = itemView.findViewById(R.id.ivProfile);
                ivFeed = itemView.findViewById(R.id.ivFeed);
                tvUserName = itemView.findViewById(R.id.tvUserName);
                tvLikeCount = itemView.findViewById(R.id.tvLikeCount);
                tvTime = itemView.findViewById(R.id.tvTime);
            }
        }
    }

}
