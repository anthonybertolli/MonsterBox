
package com.bertolli.monsterbox.data;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Monster {

    @SerializedName("element2")
    @Expose
    private Object element2;
    @SerializedName("awoken_skills")
    @Expose
    private List<Object> awokenSkills = new ArrayList<Object>();
    @SerializedName("rcv_scale")
    @Expose
    private Double rcvScale;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("type3")
    @Expose
    private Object type3;
    @SerializedName("type2")
    @Expose
    private Object type2;
    @SerializedName("image40_href")
    @Expose
    private String image40Href;
    @SerializedName("xp_curve")
    @Expose
    private Integer xpCurve;
    @SerializedName("leader_skill")
    @Expose
    private String leaderSkill;
    @SerializedName("image40_size")
    @Expose
    private Integer image40Size;
    @SerializedName("version")
    @Expose
    private Integer version;
    @SerializedName("atk_min")
    @Expose
    private Integer atkMin;
    @SerializedName("atk_max")
    @Expose
    private Integer atkMax;
    @SerializedName("jp_only")
    @Expose
    private Boolean jpOnly;
    @SerializedName("image60_size")
    @Expose
    private Integer image60Size;
    @SerializedName("max_level")
    @Expose
    private Integer maxLevel;
    @SerializedName("image60_href")
    @Expose
    private String image60Href;
    @SerializedName("monster_points")
    @Expose
    private Integer monsterPoints;
    @SerializedName("rcv_min")
    @Expose
    private Integer rcvMin;
    @SerializedName("rcv_max")
    @Expose
    private Integer rcvMax;
    @SerializedName("hp_max")
    @Expose
    private Integer hpMax;
    @SerializedName("hp_scale")
    @Expose
    private Double hpScale;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("team_cost")
    @Expose
    private Integer teamCost;
    @SerializedName("type")
    @Expose
    private Integer type;
    @SerializedName("hp_min")
    @Expose
    private Integer hpMin;
    @SerializedName("name_jp")
    @Expose
    private String nameJp;
    @SerializedName("rarity")
    @Expose
    private Integer rarity;
    @SerializedName("active_skill")
    @Expose
    private String activeSkill;
    @SerializedName("feed_xp")
    @Expose
    private Double feedXp;
    @SerializedName("element")
    @Expose
    private Integer element;
    @SerializedName("atk_scale")
    @Expose
    private Double atkScale;

    /**
     * @return The element2
     */
    public Object getElement2() {
        return element2;
    }

    /**
     * @param element2 The element2
     */
    public void setElement2(Object element2) {
        this.element2 = element2;
    }

    /**
     * @return The awokenSkills
     */
    public List<Object> getAwokenSkills() {
        return awokenSkills;
    }

    /**
     * @param awokenSkills The awoken_skills
     */
    public void setAwokenSkills(List<Object> awokenSkills) {
        this.awokenSkills = awokenSkills;
    }

    /**
     * @return The rcvScale
     */
    public Double getRcvScale() {
        return rcvScale;
    }

    /**
     * @param rcvScale The rcv_scale
     */
    public void setRcvScale(Double rcvScale) {
        this.rcvScale = rcvScale;
    }

    /**
     * @return The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return The type3
     */
    public Object getType3() {
        return type3;
    }

    /**
     * @param type3 The type3
     */
    public void setType3(Object type3) {
        this.type3 = type3;
    }

    /**
     * @return The type2
     */
    public Object getType2() {
        return type2;
    }

    /**
     * @param type2 The type2
     */
    public void setType2(Object type2) {
        this.type2 = type2;
    }

    /**
     * @return The image40Href
     */
    public String getImage40Href() {
        return image40Href;
    }

    /**
     * @param image40Href The image40_href
     */
    public void setImage40Href(String image40Href) {
        this.image40Href = image40Href;
    }

    /**
     * @return The xpCurve
     */
    public Integer getXpCurve() {
        return xpCurve;
    }

    /**
     * @param xpCurve The xp_curve
     */
    public void setXpCurve(Integer xpCurve) {
        this.xpCurve = xpCurve;
    }

    /**
     * @return The leaderSkill
     */
    public String getLeaderSkill() {
        return leaderSkill;
    }

    /**
     * @param leaderSkill The leader_skill
     */
    public void setLeaderSkill(String leaderSkill) {
        this.leaderSkill = leaderSkill;
    }

    /**
     * @return The image40Size
     */
    public Integer getImage40Size() {
        return image40Size;
    }

    /**
     * @param image40Size The image40_size
     */
    public void setImage40Size(Integer image40Size) {
        this.image40Size = image40Size;
    }

    /**
     * @return The version
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * @param version The version
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * @return The atkMin
     */
    public Integer getAtkMin() {
        return atkMin;
    }

    /**
     * @param atkMin The atk_min
     */
    public void setAtkMin(Integer atkMin) {
        this.atkMin = atkMin;
    }

    /**
     * @return The atkMax
     */
    public Integer getAtkMax() {
        return atkMax;
    }

    /**
     * @param atkMax The atk_max
     */
    public void setAtkMax(Integer atkMax) {
        this.atkMax = atkMax;
    }

    /**
     * @return The jpOnly
     */
    public Boolean getJpOnly() {
        return jpOnly;
    }

    /**
     * @param jpOnly The jp_only
     */
    public void setJpOnly(Boolean jpOnly) {
        this.jpOnly = jpOnly;
    }

    /**
     * @return The image60Size
     */
    public Integer getImage60Size() {
        return image60Size;
    }

    /**
     * @param image60Size The image60_size
     */
    public void setImage60Size(Integer image60Size) {
        this.image60Size = image60Size;
    }

    /**
     * @return The maxLevel
     */
    public Integer getMaxLevel() {
        return maxLevel;
    }

    /**
     * @param maxLevel The max_level
     */
    public void setMaxLevel(Integer maxLevel) {
        this.maxLevel = maxLevel;
    }

    /**
     * @return The image60Href
     */
    public String getImage60Href() {
        return image60Href;
    }

    /**
     * @param image60Href The image60_href
     */
    public void setImage60Href(String image60Href) {
        this.image60Href = image60Href;
    }

    /**
     * @return The monsterPoints
     */
    public Integer getMonsterPoints() {
        return monsterPoints;
    }

    /**
     * @param monsterPoints The monster_points
     */
    public void setMonsterPoints(Integer monsterPoints) {
        this.monsterPoints = monsterPoints;
    }

    /**
     * @return The rcvMin
     */
    public Integer getRcvMin() {
        return rcvMin;
    }

    /**
     * @param rcvMin The rcv_min
     */
    public void setRcvMin(Integer rcvMin) {
        this.rcvMin = rcvMin;
    }

    /**
     * @return The rcvMax
     */
    public Integer getRcvMax() {
        return rcvMax;
    }

    /**
     * @param rcvMax The rcv_max
     */
    public void setRcvMax(Integer rcvMax) {
        this.rcvMax = rcvMax;
    }

    /**
     * @return The hpMax
     */
    public Integer getHpMax() {
        return hpMax;
    }

    /**
     * @param hpMax The hp_max
     */
    public void setHpMax(Integer hpMax) {
        this.hpMax = hpMax;
    }

    /**
     * @return The hpScale
     */
    public Double getHpScale() {
        return hpScale;
    }

    /**
     * @param hpScale The hp_scale
     */
    public void setHpScale(Double hpScale) {
        this.hpScale = hpScale;
    }

    /**
     * @return The name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return The teamCost
     */
    public Integer getTeamCost() {
        return teamCost;
    }

    /**
     * @param teamCost The team_cost
     */
    public void setTeamCost(Integer teamCost) {
        this.teamCost = teamCost;
    }

    /**
     * @return The type
     */
    public Integer getType() {
        return type;
    }

    /**
     * @param type The type
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * @return The hpMin
     */
    public Integer getHpMin() {
        return hpMin;
    }

    /**
     * @param hpMin The hp_min
     */
    public void setHpMin(Integer hpMin) {
        this.hpMin = hpMin;
    }

    /**
     * @return The nameJp
     */
    public String getNameJp() {
        return nameJp;
    }

    /**
     * @param nameJp The name_jp
     */
    public void setNameJp(String nameJp) {
        this.nameJp = nameJp;
    }

    /**
     * @return The rarity
     */
    public Integer getRarity() {
        return rarity;
    }

    /**
     * @param rarity The rarity
     */
    public void setRarity(Integer rarity) {
        this.rarity = rarity;
    }

    /**
     * @return The activeSkill
     */
    public String getActiveSkill() {
        return activeSkill;
    }

    /**
     * @param activeSkill The active_skill
     */
    public void setActiveSkill(String activeSkill) {
        this.activeSkill = activeSkill;
    }

    /**
     * @return The feedXp
     */
    public Double getFeedXp() {
        return feedXp;
    }

    /**
     * @param feedXp The feed_xp
     */
    public void setFeedXp(Double feedXp) {
        this.feedXp = feedXp;
    }

    /**
     * @return The element
     */
    public Integer getElement() {
        return element;
    }

    /**
     * @param element The element
     */
    public void setElement(Integer element) {
        this.element = element;
    }

    /**
     * @return The atkScale
     */
    public Double getAtkScale() {
        return atkScale;
    }

    /**
     * @param atkScale The atk_scale
     */
    public void setAtkScale(Double atkScale) {
        this.atkScale = atkScale;
    }
}