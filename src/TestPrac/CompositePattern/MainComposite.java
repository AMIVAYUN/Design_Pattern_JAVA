package TestPrac.CompositePattern;

public class MainComposite {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu=
                new Menu("팬케이크하우스메뉴", "아침메뉴");
        MenuComponent dinerMenu=
                new Menu("객체마을식당메뉴", "점심메뉴");
        MenuComponent cafeMenu=
                new Menu("카페메뉴", "저녁메뉴");
        MenuComponent dessertMenu=
                new Menu("디저트메뉴", "디저트를즐기세요!");
        MenuComponent allMenus= new Menu("전체메뉴",
                "전체메뉴");
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);
        dinerMenu.add(new MenuItem("파스타", "마리나라소스스파게티, 효모빵포함", true, 3.89));
        dinerMenu.add(dessertMenu);
        dessertMenu.add(new MenuItem("애플파이","바삭바삭한크러스트에바닐라아이스크림이얹혀있는애플파이", true, 1.59));
        // 메뉴항목들추가
        Waitron waitron= new Waitron(allMenus);
        waitron.printMenu();
    }


}
