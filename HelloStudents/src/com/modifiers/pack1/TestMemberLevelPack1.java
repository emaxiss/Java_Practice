package com.modifiers.pack1;

public class TestMemberLevelPack1
{
	public static void main(String[] args)
	{
		var ml = new MemberLevel("Steinbeck", "John", 68, "Salinas");
		
//		ml.privateLastName = "George";
		ml.publicFirstName = "Anthony";
		ml.protectedAge = 25;
		ml.defaultCity = "San Francisco";

//		ml.getPrivateLastName();
		ml.getPublicFirstName();
		ml.getProtectedAge();
		ml.getDefaultCity();
	}
}
