//所有子类角色的父类通用角色

package characters;

public class commonCharacter
{
    String characterName;//角色名称
    int id;//玩家ID
    String[] characterState;//角色状态
    //构造通用角色作为父类
    commonCharacter(String characterName,int id,boolean healthy,boolean death,boolean poisoning,boolean protection)
    {
        this.characterName=characterName;
        this.id=id;
        this.healthy=healthy;
        this.death=death;
        this.poisoning=poisoning;
        this.protection=protection;
    }
}


