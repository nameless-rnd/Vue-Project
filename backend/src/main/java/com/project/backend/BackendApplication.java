package com.project.backend;

import com.project.backend.Character.Entity.Character;
import com.project.backend.Character.Repository.CharacterRepository;
import com.project.backend.Character.Entity.TypeHeroes;
import com.project.backend.Character.Repository.TypeHeroesRepository;
import com.project.backend.Character.Entity.Skill;
import com.project.backend.Character.Repository.SkillRepository;

import com.project.backend.Login.Entity.Login;
import com.project.backend.Login.Repository.LoginRepository;

import com.project.backend.Rune.Entity.Rune;
import com.project.backend.Rune.Repository.RuneRepository;
import com.project.backend.Rune.Entity.Level;
import com.project.backend.Rune.Repository.LevelRepository;
import com.project.backend.Rune.Entity.TypeRune;
import com.project.backend.Rune.Repository.TypeRuneRepository;

import com.project.backend.Enchantment.Entity.Enchantment;
import com.project.backend.Enchantment.Repository.EnchantmentRepository;
import com.project.backend.Enchantment.Entity.TypeEn;
import com.project.backend.Enchantment.Repository.TypeEnRepository;
import com.project.backend.Enchantment.Entity.LevelEn;
import com.project.backend.Enchantment.Repository.LevelEnRepository;

import com.project.backend.Item.Entity.Item;
import com.project.backend.Item.Repository.ItemRepository;
import com.project.backend.Item.Entity.TypeItem;
import com.project.backend.Item.Repository.TypeItemRepository;

import java.util.stream.Stream;
import java.util.Arrays;
import java.util.List;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
public class BackendApplication {

  public static void main(String[] args) {
    SpringApplication.run(BackendApplication.class, args);
  }

  @Bean
  ApplicationRunner init(LoginRepository loginRepository,
      CharacterRepository characterRepository,SkillRepository skillRepository,TypeHeroesRepository typeHeroesRepository,
      RuneRepository runeRepository,LevelRepository levelRepository,TypeRuneRepository typeRuneRepository,
      EnchantmentRepository enchantmentRepository,TypeEnRepository typeEnRepository,LevelEnRepository levelEnRepository,
      ItemRepository itemRepository,TypeItemRepository typeItemRepository
      ) {
    return args -> {
      //Object[][] data;

      Login p1 = new Login();
      p1.setName("Nattapol Panta");
      p1.setUsername("namenp2707");
      p1.setPassword("27072541");
      p1.setEmail("namenp09@gmail.com");
      loginRepository.save(p1);



//========================= Heroes Information ================================
//=============================================================================
      /*data = new Object[][] {{"..\\assasin.png","assassin"} , {"..\\carry.png","carry"}};
			for (int i = 0; i < data.length; i++) {
				TypeHeroes type = new TypeHeroes();
        type.setImg_typeHeroes(data[i][0].toString());
        type.setTypeHeroes(data[i][1].toString());
				typeHeroesRepository.save(type);
      };*/
      Stream.of("Assassin","Carry","Mage","Fighter","Tank","Support").forEach(typeHe -> {
          TypeHeroes types = new TypeHeroes();
          types.setTypeHeroes(typeHe);
          typeHeroesRepository.save(types);
      });
      /*Stream.of("..\\assasing.png","..\\carry.png","..\\mage.png","..\\fighter.png","..\\tank.png","..\\support.png").forEach(Img_typeHe -> {
        TypeHeroes types = new TypeHeroes();
        types.setImg_typeHeroes(Img_typeHe);
        typeHeroesRepository.save(types);
      });
      //======================= Airi ===================================
      //================================================================
   
      /*Skill skill0 = new Skill();
      skill0.setImg_skill("..\\Heroes\\Airi\\skill-airi.png");
      skill0.setName_skill("Dragon Blade");
      skill0.setDetail_skill("การโจมตีปกติแต่ละครั้ง จะลดคูลดาวน์สกิล Dragon Shuriken 1 วินาที");
      //skill0.setCharacter(characterRepository.findById(1));
      //skillRepository.save(skill0);

      Skill skill1 = new Skill();
      skill1.setImg_skill("..\\Heroes\\AiRi\\skill-airi1.png");
      skill1.setName_skill("Dragon Shuriken");
      skill1.setDetail_skill("Airi ปาดาวกระจายใส่เหล่าศัตรูเบื้องหน้า สร้างความเสียหายกายภาพ");
      //skill1.setCharacter(characterRepository.findById(1));
      //skillRepository.save(skill1);

      Skill skill2 = new Skill();
      skill2.setImg_skill("..\\Heroes\\AiRi\\skill-airi2.png");
      skill2.setName_skill("Swift Shadow");
      skill2.setDetail_skill("Airi พุ่งไปโจมตีจุดที่กำหนด สร้างความเสียหายกายภาพโดยสกิลนี้สามารถใช้ต่อเนื่องได้ 3 ครั้ง ก่อนที่สกิลจะคูลดาวน์");
      //skill2.setCharacter(characterRepository.findById(1));
      //skillRepository.save(skill2);

      Skill skill3 = new Skill();
      skill3.setImg_skill("..\\Heroes\\AiRi\\skill-airi3.png");
      skill3.setName_skill("Ryo no Ikari");
      skill3.setDetail_skill("Airi กระโดดขึ้นไปบนอากาศ พร้อมกับเรียกมังกรออกมาโจมตีสร้างความเสียหายกายภาพ และลดความเร็ว จากนั้นสร้างความเสียหายซ้ำอีกครั้ง พร้อมกับสตั๊นศัตรู (การโจมตีแต่ละครั้งจะเพิ่มเกราะ)ขณะใช้สกิลจะไม่ติดสถานะ และความเร็วเพิ่มขึ้น 100% เป็นเวลา 2.5 วิ; ความเร็วโจมตี 30% เป็นเวลา 5 วิ");
      //skill3.setCharacter(characterRepository.findById(1));
      //skillRepository.save(skill3);

      List<Skill> skills_airi = Arrays.asList(skill0 , skill1 , skill2 , skill3);*/
      

      Character c1 = new Character();
      c1.setName("Airi");
      c1.setImg_small("..\\Heroes\\Airi\\airi-s.png");
      c1.setImg_big("..\\Heroes\\Airi\\airi.png");
      c1.addTypeHero(typeHeroesRepository.findById(1));
      c1.addTypeHero(typeHeroesRepository.findById(4));
      //c1.setSkills(skills_airi);
      /*c1.addSkill(skillRepository.findById(1));
      c1.addSkill(skillRepository.findById(2));
      c1.addSkill(skillRepository.findById(3));
      c1.addSkill(skillRepository.findById(4));*/
      characterRepository.save(c1);
      
      
      
      
      /*c1.setImg_skill("..\\Heroes\\Airi\\skill-airi.png");
      c1.setName_skill("Dragon Blade");
      c1.setDetail_skill(
        "การโจมตีปกติแต่ละครั้ง จะลดคูลดาวน์สกิล Dragon Shuriken 1 วินาที"
      );
      c1.setImg_skill_1_1("..\\Heroes\\AiRi\\skill-airi1.png");
      c1.setName_skill_1_1("Dragon Shuriken");
      c1.setDetail_skill_1_1(
        "Airi ปาดาวกระจายใส่เหล่าศัตรูเบื้องหน้า สร้างความเสียหายกายภาพ"
      );
      c1.setImg_skill_2_1("..\\Heroes\\AiRi\\skill-airi2.png");
      c1.setName_skill_2_1("Swift Shadow");
      c1.setDetail_skill_2_1(
        "Airi พุ่งไปโจมตีจุดที่กำหนด สร้างความเสียหายกายภาพโดยสกิลนี้สามารถใช้ต่อเนื่องได้ 3 ครั้ง ก่อนที่สกิลจะคูลดาวน์"
      );
      c1.setImg_skill_3_1("..\\Heroes\\AiRi\\skill-airi3.png");
      c1.setName_skill_3_1("Ryo no Ikari");
      c1.setDetail_skill_3_1(
        "Airi กระโดดขึ้นไปบนอากาศ พร้อมกับเรียกมังกรออกมาโจมตีสร้างความเสียหายกายภาพ และลดความเร็ว จากนั้นสร้างความเสียหายซ้ำอีกครั้ง พร้อมกับสตั๊นศัตรู (การโจมตีแต่ละครั้งจะเพิ่มเกราะ)ขณะใช้สกิลจะไม่ติดสถานะ และความเร็วเพิ่มขึ้น 100% เป็นเวลา 2.5 วิ; ความเร็วโจมตี 30% เป็นเวลา 5 วิ"
      );
      c1.setImg_type1_heroes("..\\assasin.png");
      c1.setType1_heroes("Assassin");
      c1.setImg_type2_heroes("..\\fighter.png");
      c1.setType2_heroes("Fighter");*/
      //characterRepository.save(c1);

      //======================= Aleister ===============================
      //================================================================
      /*Character c2 = new Character();
      c2.setName("Aleister");
      c2.setImg_small("..\\Heroes\\Aleister\\Aleister-s.png");
      c2.setImg_big("..\\Heroes\\Aleister\\Aleister.png");
      c2.setImg_skill("..\\Heroes\\Aleister\\skill-0.png");
      c2.setName_skill("Wicked Plot");
      c2.setDetail_skill(
        "ทุกการโจมตีปกติครั้งที่ 3 หรือการใช้สกิลของ Aleister จะทำให้เป้าหมายติดคำสาป เมื่อติดคำสาป 3 ครั้ง จะทำให้เกิดระเบิด สร้างความเสียหายจริง"
      );
      c2.setImg_skill_1_1("..\\Heroes\\Aleister\\skill-1.png");
      c2.setName_skill_1_1("Magic Barrier");
      c2.setDetail_skill_1_1(
        "Aleister สร้างแผงสายฟ้าดักหน้าศัตรู เมื่อศัตรูวิ่งผ่านจะสร้างความเสียหายเวทพร้อมกับทำให้ติดสต๊ันและคำสาป 1 ครั้ง หลังจากนั้นจะทำให้วิ่งช้าลงเป็นเวลาสั้นๆ"
      );
      c2.setImg_skill_2_1("..\\Heroes\\Aleister\\skill-2.png");
      c2.setName_skill_2_1("Matrix of Woe");
      c2.setDetail_skill_2_1(
        "Aleister สร้างพื้นที่สายฟ้าขึ้นมาช็อตศัตรูอย่างต่อเนื่อง โดยการโจมตีแต่ละครั้งจะสร้างความเสียหายเวทและติดคำสาป 1 ครั้ง"
      );
      c2.setImg_skill_3_1("..\\Heroes\\Aleister\\skill-3.png");
      c2.setName_skill_3_1("Ryo no Ikari");
      c2.setDetail_skill_3_1(
        "Aleister กักขังศัตรูในคุกเวท โดยจะสร้างความเสียหายเวทแต่ละครั้ง พร้อมกับทำให้ติดสตัน 2.5 วินาที (การโจมตีแต่ละครั้งทำให้ติดคำสาป 1 ครั้ง)"
      );
      c2.setImg_type1_heroes("..\\mage.png");
      c2.setType1_heroes("Mage");
      characterRepository.save(c2);

      //========================= Alice ================================
      //================================================================
      Character c3 = new Character();
      c3.setName("Alice");
      c3.setImg_small("..\\Heroes\\Alice\\Alice-s.png");
      c3.setImg_big("..\\Heroes\\Alice\\Alice.png");
      c3.setImg_skill("..\\Heroes\\Alice\\skill-0.png");
      c3.setName_skill("Trot");
      c3.setDetail_skill(
        "การใช้สกิลจะทำให้ความเร็วเคลื่อนที่เพิ่มขึ้น 20% เป็นเวลา 1 วิ"
      );
      c3.setImg_skill_1_1("..\\Heroes\\Alice\\skill-1.png");
      c3.setName_skill_1_1("Chrono Burst");
      c3.setDetail_skill_1_1(
        "Alice ดึงพลังแห่งพระอาทิตย์ สร้างความเสียหายเวทและทำให้ศัตรูติดสตั๊น"
      );
      c3.setImg_skill_2_1("..\\Heroes\\Alice\\skill-2.png");
      c3.setName_skill_2_1("Chrono Shield");
      c3.setDetail_skill_2_1(
        "Alice สร้างโล่ให้กับพันธมิตรของเธอ ซึ่งดูดซับความเสียหาย และเพื่มความเร็วเคลื่อนที่ขึ้น 30% เป็นเวลา 2 วินาที"
      );
      c3.setImg_skill_3_1("..\\Heroes\\Alice\\skill-3.png");
      c3.setName_skill_3_1("Chrono Flow");
      c3.setDetail_skill_3_1(
        "Alice ปลดปล่อยห้วงเวลาลงที่พื้น ลดความเร็วการเคลื่อนที่ 35% เป็นเวลา 2 วิ และลดอัตราการป้องกันเวทของศัตรูออก 30/40/50% รวมถึงสร้างความเสียหายเวททุก 0.5 วิ และใบ้ศัตรูที่เข้ามาในวงสกิลทีหลังอีก 1 วิ"
      );
      c3.setImg_type1_heroes("..\\support.png");
      c3.setType1_heroes("Support");
      characterRepository.save(c3);

      //========================= Allain ================================
      //================================================================
      Character c4 = new Character();
      c4.setName("Allain");
      c4.setImg_small("..\\Heroes\\Allain\\Allain-s.jpg");
      c4.setImg_big("..\\Heroes\\Allain\\Allain-1.jpg");
      c4.setImg_skill("..\\Heroes\\Allain\\skill-0.png");
      c4.setName_skill("Howling Sword");
      c4.setDetail_skill(
        "1. Allain สามารถสะสมพลังได้จากการโจมตีปกติ โดยสามารถสะสมได้ 4 ขั้น การโจมตีปกติ 1 ครั้งจะสร้างความเสียหายทั้งกายภาพและเวทอย่างละ 1 ครั้ง (รวมเป็น 2) และสะสมพลังได้ 1 ขั้น และที่การโจมตีครั้งสุดท้ายจะสร้างความเสียหายจริง 2. ทุกครั้งที่โจมตี Allain จะได้รับความเสียหายน้อยลง และค่าเจาะเกราะเพิ่ม 1 วินาที ที่การโจมตีครั้งที่ 8 จะฟื้นฟู HP 8% ของ HP ที่เสียไป และ 16 ครั้งจะฟื้นฟู HP 2 เท่าจากเดิม"
      );
      c4.setImg_skill_1_1("..\\Heroes\\Allain\\skill-1.png");
      c4.setName_skill_1_1("Meteor Strike");
      c4.setDetail_skill_1_1(
        "มี 4 ระดับ โดยอิงตามพลังที่สะสมได้จากการโจมตีปกติ ขั้นที่ 1 เสยดาบขึ้นไปยังทิศที่เลือก สร้างความเสียหายเวทและทำให้เป้าหมายลอยขึ้น เร็วขึ้นอีก ขั้นที่ 2 โจมตี 3 ครั้ง สร้างความเสียหายทั้งกายภาพและเวทและทำให้เป้าหมายลอยขึ้น ต้องเร็วขึ้นอีก ขั้นที่ 3 โจมตี 5 ครั้ง สร้างความเสียหายทั้งกายภาพและเวทและทำให้เป้าหมายลอยขึ้น ต้องเร็วกว่านี้อีก!! ขั้นสุดท้าย โจมตี 9 ครั้ง สร้างความเสียหายทุกรูปแบบและทำให้เป้าหมายลอยขึ้น!! นอกจากนี้เขาจะป้องกัน CC ทุกรูปแบบและสามารถเลือกทิศทางในการโจมตีครั้งสุดท้ายได้ พอละ เมื่อยแขน"
      );
      c4.setImg_skill_2_1("..\\Heroes\\Allain\\skill-2.png");
      c4.setName_skill_2_1("Moonflash");
      c4.setDetail_skill_2_1(
        "พุ่งไปยังทิศที่เลือก สร้างความเสียหายกายภาพและทำให้เป้าหมายแรกไม่สามารเคลื่อนที่ได้ 1 วินาที โดยสกิลนี้สามารถสะสมได้ 2 ครั้ง"
      );
      c4.setImg_skill_3_1("..\\Heroes\\Allain\\skill-3.png");
      c4.setName_skill_3_1("Death at Sunset");
      c4.setDetail_skill_3_1(
        "ล็อคเป้าหมายที่เลือกพร้อมทั้งหายตัว 1.5 วินาที จากนั้นก็ปรากฏตัวออกมาฟันกวาดรอบตัว สร้างความเสียหายจริงตาม HP ปัจจุบันของเป้าหมาย โดยจะรุนแรงขึ้น 25% ต่อ 1 เป้าหมายที่โดนสูงสุด 50% หากใช้ใส่ศัตรูจะลดความเร็วลง และ Allain จะได้รับโล่กันความเสียหาย หากใช้ใส่เพื่อนจะเพิ่มความเร็วให้เป้าหมายและทำให้เพื่อนได้รับโล่กันความเสียหาย หากใช้ใส่แฟน (Butterfly) จะได้รับผลเหมือนใช้ใส่เพื่อนทุกประการ แต่ จะได้รับบัพกัน CC เพิ่มอีกด้วย"
      );
      c4.setImg_type1_heroes("..\\fighter.png");
      c4.setType1_heroes("Fighter");
      characterRepository.save(c4);

      //========================= Amily ================================
      //================================================================
      Character c5 = new Character();
      c5.setName("Amily");
      c5.setImg_small("..\\Heroes\\Amily\\Amily-s.png");
      c5.setImg_big("..\\Heroes\\Amily\\Amily.png");
      c5.setImg_skill("..\\Heroes\\Amily\\skill-0.png");
      c5.setName_skill("Duel");
      c5.setDetail_skill(
        "เมื่อการโจมตีปกติ หรือสกิล Combo vอง Amily โจมตีโดนเป้าหมายเดียว เธอจะสร้างความเสียหายเพิ่มขึ้น 50%"
      );
      c5.setImg_skill_1_1("..\\Heroes\\Amily\\skill-1.png");
      c5.setName_skill_1_1("Kickblade");
      c5.setDetail_skill_1_1(
        "Amily ปามีดออกไป ซึ่งหากโดนศัตรู มีดจะโจมตีใส่ศัตรูอื่นอีก 4 ครั้งสร้าง ความเสียหายกายภาพ 150 (+60% AD) และลดความเร็วเคลื่อนที่ 30% เป็นเวลา 1 3 (เป้าหมายแรกจะลด 50%) เมื่อมีดลอยกลับมา เธอจะวิ่งเร็วขึ้น 20% เป็นเวลา 33 ฟื้นฟู HP 125(+50% AD) และลดคูลดาวน์สกิลนี้ 30%"
      );
      c5.setImg_skill_2_1("..\\Heroes\\Amily\\skill-2.png");
      c5.setName_skill_2_1("Combo");
      c5.setDetail_skill_2_1(
        "Amily กระโดดเตะต่อเนื่อง สร้างความเสียหายกายภาพ 80 (+30% AD) โดยการโจมตีครั้งที่ 2 จะทําให้ลอยขึ้น จากนั้นการโจมตีปกติครั้งต่อไปจะพังโจมตี สร้างโบนัส ความเสียหายกายภาพ 80 (+30% AD) สกิลติดตัว: Amily ฟื้นฟู 1% ของพลังชีวิต และมานาสูงสุดต่อวิ รวมถึงวิ่งเร็วขึ้น 10 หน่วย เมื่อออกจากการต่อสู้"
      );
      c5.setImg_skill_3_1("..\\Heroes\\Amily\\skill-3.png");
      c5.setName_skill_3_1("Enrage");
      c5.setDetail_skill_3_1(
        "Amily เข้าสู่โหมดคลั่ง ซึ่งหลังจาก 1วิ จะสร้าง ความเสียหายเวท 300 จากนั้นเธอจะได้รับพลังโจมตีเพิ่มขึ้น 100 หน่วย และความเร็วเคลื่อนที่ 40 หน่วย รวมถึงต้านทานความเสียหาย 40 หน่วย ในvณะเดียวกันเธอจะสร้างความเสียหายเวท 60 ทุก 8วิ"
      );
      c5.setImg_type1_heroes("..\\assasin.png");
      c5.setType1_heroes("Assassin");
      c5.setImg_type2_heroes("..\\fighter.png");
      c5.setType2_heroes("Fighter");
      characterRepository.save(c5);

      //========================= Annette ================================
      //================================================================
      Character c6 = new Character();
      c6.setName("Annette");
      c6.setImg_small("..\\Heroes\\Annette\\Annette-s.png");
      c6.setImg_big("..\\Heroes\\Annette\\Annette.png");
      c6.setImg_skill("..\\Heroes\\Annette\\skill-0.png");
      c6.setName_skill("Whisperwind");
      c6.setDetail_skill(
        "เมื่อ Annette ใช้สกิล เธอจะได้รับสัญลักษณ์แห่งสายลม (สะสมสูงสุด 10 ครั้ง) ขณะที่สะสมครบ 10 ครั้ง หาก HP ตนเองหรือพันธมิตรใกล้ๆ เหลือต่ำกว่า 70% จะใช้สัญลักษณ์ทั้งหมดฟื้นฟูพลังชีวิตของตัวเองและพันธมิตรรอบๆ ทันที (เอฟเฟคนี้จะทำงานทุก 5 วิ)"
      );
      c6.setImg_skill_1_1("..\\Heroes\\Annette\\skill-1.png");
      c6.setName_skill_1_1("Gust Force");
      c6.setDetail_skill_1_1(
        "Annette เรียกพายุหมุนขึ้นมายังจุดที่กำหนด สร้างความเสียหายเวททุก 0.25 วิ เป็นเวลา 2 วิ (การโจมตีทุกๆ 2 ครั้ง จะทำให้ความเสียหายจะแรงขึ้น 33%) นอกจากนี้ ศัตรูที่อยู่ใจกลางวงพายุจะได้รับโบนัสความเสียหายเพิ่มขึ้น (2% ของ HP สูงสุด) พร้อมกับวิ่งช้าลง 50% เป็นเวลา 0.25 วิ"
      );
      c6.setImg_skill_2_1("..\\Heroes\\Annette\\skill-2.png");
      c6.setName_skill_2_1("Wind Cuffs");
      c6.setDetail_skill_2_1(
        "Annette ยิงกระสุนสายลมไปยังทิศที่กำหนด สร้างความเสียหายเวทและลดความเร็วลง หากสกิลนี้ยิงทะลุเป้าหมายที่ 1 ไปโดนเป้าหมายที่ 2 จะสร้างโบนัสความเสียหายเวทพร้อมกับดึงเป้าหมายทั้ง 2 เข้าหากัน และสตั๊น 1 วิ สกิลติดตัว: เมื่อ Annette ติดสตั๊น คูลดาวน์สกิลนี้จะถูกรีเซ็ตทันที พร้อมกับได้รับเกราะ และพลังป้องกันเพิ่มขึ้นเป็นเวลา 2 วิ (เอฟเฟคนี้จะมีผลทุก 45 วิ)"
      );
      c6.setImg_skill_3_1("..\\Heroes\\Annette\\skill-3.png");
      c6.setName_skill_3_1("Hurricane Wall");
      c6.setDetail_skill_3_1(
        "Annette พุ่งไปยังจุดที่กำหนด และเรียกพายุเฮอริเคนออกมาผลักให้ศัตรูที่อยู่รอบๆ กระเด็นออกไป พร้อมกับสร้างความเสียหายเวท ระหว่างนั้นพายุที่เธอสร้างจะขวางทางไม่ให้ศัตรูสามารถเดินผ่านได้ ส่วนพันธมิตรที่อยู่ในวงพายุจะวิ่งเร็วขึ้น และโจมตีเร็วขึ้นเป็นเวลา 3.5 วิ (สถานะผิดปกติทั้งหมดจะถูกลบออกจาก Annette หลังใช้สกิลนี้)"
      );
      c6.setImg_type1_heroes("..\\support.png");
      c6.setType1_heroes("Support");
      c6.setImg_type1_heroes("..\\mage.png");
      c6.setType1_heroes("Mage");
      characterRepository.save(c6);*/

//========================== Runes Information ================================
//=============================================================================
      Stream.of(1,2,3).forEach(namel -> {
        Level level = new Level();
        level.setLevel(namel);
        levelRepository.save(level);
      });
      Stream.of("โจมตี" , "พลังชีวิต" , "ป้องกัน" , "พิเศษ" , "ดูดเลือด" , 
                "ความเร็ว" , "คริติคอล" , "เจาะ" ).forEach(typeR -> {
        TypeRune type = new TypeRune();
        type.setTypeRune(typeR);
        typeRuneRepository.save(type);
      });
      
      //----------------------- Passion ------------------------------------
      Rune r1 = new Rune();
      r1.setLevel(levelRepository.findById(1));
      r1.setName("Passion");
      r1.setImg_rune("..\\Rune\\Level1\\1_Passion.png");
      r1.addType(typeRuneRepository.findById(1));
      r1.addType(typeRuneRepository.findById(2));
      r1.setEffect("พลังโจมตี +0.9");
      runeRepository.save(r1);

      //----------------------- Shock ------------------------------------
      Rune r2 = new Rune();
      r2.setLevel(levelRepository.findById(2));
      r2.setName("Shock");
      r2.setImg_rune("..\\Rune\\Level1\\2_Shock.png");
      r2.addType(typeRuneRepository.findById(1));
      r2.setEffect("อัตราคริติคอล +0.5%");
      runeRepository.save(r2);

      Rune r3 = new Rune();
      r3.setLevel(levelRepository.findById(3));
      r3.setName("Shock");
      r3.setImg_rune("..\\Rune\\Level1\\2_Shock.png");
      r3.addType(typeRuneRepository.findById(1));
      r3.setEffect("อัตราคริติคอล +0.5%");
      runeRepository.save(r3);

//========================== Enchantment Information ==========================
//=============================================================================
      Stream.of(1,2,3).forEach(namelen -> {
        LevelEn level = new LevelEn();
        level.setLevelEn(namelen);
        levelEnRepository.save(level);
      });
      Stream.of("Afata" , "Human" , "Lokheim" , "Veda" ).forEach(typeEns -> {
        TypeEn type = new TypeEn();
        type.setTypeEn(typeEns);
        typeEnRepository.save(type);
      });
      //----------------------- River Treader -----------------------------------
      Enchantment e1 = new Enchantment();
      e1.setName("River Treader");
      e1.setImage("..\\Enchantment\\Afata\\ขั้น 1\\AFATA-1.png");
      e1.setDetail("เมื่ออยู่บริเวณแม่น้ำจะได้รับความเร็วเคลื่อนที่ 10 หน่วย พร้อมกับโบนัสฟื้นฟู 20 HP และ 10 MP ทุก 5 วิ");
      e1.setTypeEn(typeEnRepository.findById(1));
      e1.setLevelEn(levelEnRepository.findById(1));
      enchantmentRepository.save(e1);
      //----------------------- Backstabbing -----------------------------------
      Enchantment e2 = new Enchantment();
      e2.setName("Backstabbing");
      e2.setImage("..\\Enchantment\\Afata\\ขั้น 1\\AFATA-2.png");
      e2.setDetail("หลังจากเข้าพุ่มไม้จะทำให้การโจมตีปกติ ครั้งต่อไปสร้างโบนัสความเสียหายจริง 4% ของ HP ที่เหลืออยู่ โดยเอฟเฟกต์จะมีผล 4 วิ หลังออกจากพุ่มไม้ (คูลดาวน์ 20 วิ)");
      e2.setTypeEn(typeEnRepository.findById(1));
      e2.setLevelEn(levelEnRepository.findById(1));
      enchantmentRepository.save(e2);
      //----------------------- Tower Blessing -----------------------------------
      Enchantment e3 = new Enchantment();
      e3.setName("Tower Blessing");
      e3.setImage("..\\Enchantment\\Afata\\ขั้น 1\\AFATA-3.png");
      e3.setDetail("เมื่ออยู่ในระยะป้อม จะได้รับการต้านทานสถานะเพิ่มขึ้น 15% พร้อมกับลดความเสียหายที่ได้รับลง 10%");
      e3.setTypeEn(typeEnRepository.findById(1));
      e3.setLevelEn(levelEnRepository.findById(1));
      enchantmentRepository.save(e3);
      //----------------------- Regrowth -----------------------------------
      Enchantment e4 = new Enchantment();
      e4.setName("Regrowth");
      e4.setImage("..\\Enchantment\\Afata\\ขั้น 2\\AFATA-4.png");
      e4.setDetail("เอฟเฟกต์การฟื้นฟู และโล่เพิ่มขึ้น 10% หาก HP เป้าหมายน้อยกว่า 50% จะทำให้เอฟเฟกต์เพิ่มขึ้น 10%");
      e4.setTypeEn(typeEnRepository.findById(1));
      e4.setLevelEn(levelEnRepository.findById(2));
      enchantmentRepository.save(e4);
      //----------------------- Nature’s Gift -----------------------------------
      Enchantment e5 = new Enchantment();
      e5.setName("Nature’s Gift");
      e5.setImage("..\\Enchantment\\Afata\\ขั้น 2\\AFATA-5.png");
      e5.setDetail("แต่ละครีปและมอนสเตอร์ป่าที่ตายบริเวณใกล้ๆ จะทำให้ได้รับบัฟ (จำนวนบัฟ: ครีป 1 ครั้ง, มอนสเตอร์ป่า 2 ครั้ง, Epic มอนสเตอร์ 3 ครั้ง) โดยบัฟแต่ละครั้งจะเพิ่ม HP ขึ้น 8 หน่วยจนจบเกม (สูงสุด 100 ครั้ง)");
      e5.setTypeEn(typeEnRepository.findById(1));
      e5.setLevelEn(levelEnRepository.findById(2));
      enchantmentRepository.save(e5);
      //----------------------- Nature’s Rage -----------------------------------
      Enchantment e6 = new Enchantment();
      e6.setName("Nature’s Rage");
      e6.setImage("..\\Enchantment\\Afata\\ขั้น 3\\Natures-Rage.png");
      e6.setDetail("เมื่อใช้สกิลควบคุม (ยั่วยุ, ลอยขึ้น, ผลัก, สตั๊น, แช่แข็ง ฯลฯ) โดนฮีโร่ จะทำให้ได้รับเอฟเฟกต์เผาไหม้ สร้างความเสียหายเวท 1% HP ทุก 0.5 วิ รวมถึงลดเกราะเวทศัตรูที่โดนเผาลง 30 (LV อัพ+3) คูลดาวน์ 25 วิ");
      e6.setTypeEn(typeEnRepository.findById(1));
      e6.setLevelEn(levelEnRepository.findById(3));
      enchantmentRepository.save(e6);
      //----------------------- Explosive Shield -----------------------------------
      Enchantment e7 = new Enchantment();
      e7.setName("Explosive Shield");
      e7.setImage("..\\Enchantment\\Afata\\ขั้น 3\\Explosive-Shield.png");
      e7.setDetail("สะสมบัฟเมื่อโนโจมตี หากสะสมครบ 20 ครั้ง จะลบล้างสถานะควบคุมทั้งหมดและระเบิดพลังสร้างความเสียหายเวท 10%  HP สูงสุด พร้อมกับสตั๊น 0.75 วิ รวมถึงได้รับเอฟเฟกต์ฟื้นฟูเพิ่มขึ้น 30% เป็นเวลา 3 วิ");
      e7.setTypeEn(typeEnRepository.findById(1));
      e7.setLevelEn(levelEnRepository.findById(3));
      enchantmentRepository.save(e7);
      //----------------------- Forest Wanderer -----------------------------------
      Enchantment e8 = new Enchantment();
      e8.setName("Forest Wanderer");
      e8.setImage("..\\Enchantment\\Afata\\ขั้น 3\\Forest-Wanderer.png");
      e8.setDetail("เมื่อไม่ได้ต่อสู้ จะได้รับโบนัสฟื้นฟูพลังชีวิต 20 และมานา 10 หน่วย ทุก 5 วิ การโจมตีปกติครั้งต่อไปจะลดความเร็ว 30% เป็นเวลา 1 วิ และลดพลังโจมตีของศัตรูลง 30% เป็นเวลา 2 วิ");
      e8.setTypeEn(typeEnRepository.findById(1));
      e8.setLevelEn(levelEnRepository.findById(3));
      enchantmentRepository.save(e8);
      //----------------------- Mark of Frost -----------------------------------
      Enchantment e9 = new Enchantment();
      e9.setName("Forest Wanderer");
      e9.setImage("..\\Enchantment\\Human\\ขั้น 1\\Human-1.png");
      e9.setDetail("หลังจากเริ่มเกม 3 นาที จะได้รับเอฟเฟกต์ Freeze ซึ่งจะทำให้คุณเป็นอมตะ แต่จะไม่สามารถขยับ หรือโจมตีได้");
      e9.setTypeEn(typeEnRepository.findById(2));
      e9.setLevelEn(levelEnRepository.findById(1));
      enchantmentRepository.save(e9);
      //----------------------- Reaper’s Blessing -----------------------------------
      Enchantment e10 = new Enchantment();
      e10.setName("Reaper’s Blessing");
      e10.setImage("..\\Enchantment\\Human\\ขั้น 1\\Human-2.png");
      e10.setDetail("หลังจากเริ่มเกม 3 นาที จะได้รับเอฟเฟกต์ Death Sickle ป้องกันความเสียหายที่ทำให้ถึงแก่ชีวิต 1 ครั้ง พร้อมกับวิ่งเร็วขึ้น 20% เป็นเวลา 1 วิ (มีผลเพียงครั้งเดียว)");
      e10.setTypeEn(typeEnRepository.findById(2));
      e10.setLevelEn(levelEnRepository.findById(1));
      enchantmentRepository.save(e10);
      //----------------------- Arcane Whisper -----------------------------------
      Enchantment e11 = new Enchantment();
      e11.setName("Arcane Whisper");
      e11.setImage("..\\Enchantment\\Human\\ขั้น 1\\Human-3.png");
      e11.setDetail("ลดคูลดาวน์สกิลชาเลนเจอร์ลง 15%");
      e11.setTypeEn(typeEnRepository.findById(2));
      e11.setLevelEn(levelEnRepository.findById(1));
      enchantmentRepository.save(e11);
      //----------------------- Minion Kill -----------------------------------
      Enchantment e12 = new Enchantment();
      e12.setName("Minion Kill");
      e12.setImage("..\\Enchantment\\Human\\ขั้น 2\\Human-4.png");
      e12.setDetail("การโจมตีปกติหรือใช้สกิลจะสามารถสังหารครีปที่เหลือ HP ต่ำกว่า 200 ได้ทันที");
      e12.setTypeEn(typeEnRepository.findById(2));
      e12.setLevelEn(levelEnRepository.findById(2));
      enchantmentRepository.save(e12);
      //----------------------- Gunslinger -----------------------------------
      Enchantment e13 = new Enchantment();
      e13.setName("Gunslinger");
      e13.setImage("..\\Enchantment\\Human\\ขั้น 2\\Human-5.png");
      e13.setDetail("ได้รับบัฟ Gunslinger 1 ครั้ง และสามารถสะสมเพิ่มได้โดยการ Kill หรือ Assist ซึ่งบัฟแต่ละครั้งจะเพิ่มพลังโจมตี 10 หน่วย และพลังเวท 15 หน่วย");
      e13.setTypeEn(typeEnRepository.findById(2));
      e13.setLevelEn(levelEnRepository.findById(2));
      enchantmentRepository.save(e13);
      //----------------------- Endless Cycle -----------------------------------
      Enchantment e14 = new Enchantment();
      e14.setName("Endless Cycle");
      e14.setImage("..\\Enchantment\\Human\\ขั้น 3\\Endless-Cycle.png");
      e14.setDetail("หลังจากตายจะได้รับสกิล Resurrection ซึ่งเมื่อใช้แล้วจะสามารถไปเกิดที่บ่อน้ำพุได้ทันที โดย CD จะขึ้นอยู่กับเวลาในเกม (160-300 วิ)");
      e14.setTypeEn(typeEnRepository.findById(2));
      e14.setLevelEn(levelEnRepository.findById(3));
      enchantmentRepository.save(e14);
      //----------------------- Visceral Boost -----------------------------------
      Enchantment e15 = new Enchantment();
      e15.setName("Visceral Boost");
      e15.setImage("..\\Enchantment\\Human\\ขั้น 3\\Visceral-Boost.png");
      e15.setDetail("เริ่มเกมด้วย LV2 และได้รับ XP เพิ่มขึ้น 50% จนถึง LV12 โดยระหว่างที่เอฟเฟกต์นี้ทำงาน จะทำให้ XP และโกลด์ที่ได้รับจากครีปและมอนสเตอร์ป่าลดลงครึ่งหนึ่ง");
      e15.setTypeEn(typeEnRepository.findById(2));
      e15.setLevelEn(levelEnRepository.findById(3));
      enchantmentRepository.save(e15);
      //----------------------- Devourer -----------------------------------
      Enchantment e16 = new Enchantment();
      e16.setName("Devourer");
      e16.setImage("..\\Enchantment\\Lokheim\\ขั้น 1\\LOKHEIM-1.png");
      e16.setDetail("หลังจาก Kill หรือ Assist จะฟื้นฟูพลังชีวิต 9% และมานา 15%");
      e16.setTypeEn(typeEnRepository.findById(3));
      e16.setLevelEn(levelEnRepository.findById(1));
      enchantmentRepository.save(e16);
      //----------------------- Shadow Blade -----------------------------------
      Enchantment e17 = new Enchantment();
      e17.setName("Shadow Blade");
      e17.setImage("..\\Enchantment\\Lokheim\\ขั้น 1\\LOKHEIM-2.png");
      e17.setDetail("หลังจากใช้สกิลเคลื่อนที่ จะได้รับบัฟ 1 ครั้ง เป็นเวลา 2 วิ (สูงสุด 3 ครั้ง) การโจมตีปกติครั้งต่อไปจะใช้งานบัฟที่สะสมอยู่ทั้งหมด โดยบัฟแต่ละครั้งจะสร้างโบนัสความเสียหายกายภาพ 30 (LV อัพ+5)");
      e17.setTypeEn(typeEnRepository.findById(3));
      e17.setLevelEn(levelEnRepository.findById(1));
      enchantmentRepository.save(e17);
      //----------------------- Raging Inferno -----------------------------------
      Enchantment e18 = new Enchantment();
      e18.setName("Raging Inferno");
      e18.setImage("..\\Enchantment\\Lokheim\\ขั้น 1\\LOKHEIM-3.png");
      e18.setDetail("การโจมตีปกติหรือสกิลจะสร้างเสียหายเวท 50 (LV อัพ+5) (0.25 AP) (0.35 โบนัส AD) แก่ฮีโร่ศัตรู (คูลดาวน์ 8 วิ)");
      e18.setTypeEn(typeEnRepository.findById(3));
      e18.setLevelEn(levelEnRepository.findById(1));
      enchantmentRepository.save(e18);
      //----------------------- Deadly Claw -----------------------------------
      Enchantment e19 = new Enchantment();
      e19.setName("Deadly Claw");
      e19.setImage("..\\Enchantment\\Lokheim\\ขั้น 2\\Deadly-Claw.png");
      e19.setDetail("ได้รับโบนัสพลังโจมตี 12~40 และพลังเวท 18~60");
      e19.setTypeEn(typeEnRepository.findById(3));
      e19.setLevelEn(levelEnRepository.findById(2));
      enchantmentRepository.save(e19);
      //----------------------- Bone Cutter -----------------------------------
      Enchantment e20 = new Enchantment();
      e20.setName("Bone Cutter");
      e20.setImage("..\\Enchantment\\Lokheim\\ขั้น 2\\LOKHEIM-5.png");
      e20.setDetail("ต้านทานสถานะเพิ่มขึ้น 10%");
      e20.setTypeEn(typeEnRepository.findById(3));
      e20.setLevelEn(levelEnRepository.findById(2));
      enchantmentRepository.save(e20);
      //----------------------- Curse of Death -----------------------------------
      Enchantment e21 = new Enchantment();
      e21.setName("Curse of Death");
      e21.setImage("..\\Enchantment\\Lokheim\\ขั้น 3\\Curse-of-Death.png");
      e21.setDetail("เมื่อใช้สกิล/โจมตีโดนฮีโร่ศัตรูจะได้บัฟ 1 ครั้ง เมื่อครบ 3 ครั้ง จะสร้างความเสียหายเวท 50 (LV อัพ+5) (+0.25 Bonus AD) (+0.2AP) เป็นวงกว้าง จากนั้น 1 วิ จะสร้างความเสียหายเวท 100 (LV อัพ+10) (0.5 Bonus AD) (+0.4AP) ซ้ำ (คูลดาวน์ 15 วิ)");
      e21.setTypeEn(typeEnRepository.findById(3));
      e21.setLevelEn(levelEnRepository.findById(3));
      enchantmentRepository.save(e21);
      //----------------------- Desperate duel -----------------------------------
      Enchantment e22 = new Enchantment();
      e22.setName("Desperate Duel");
      e22.setImage("..\\Enchantment\\Lokheim\\ขั้น 3\\Desperate-Duel.png");
      e22.setDetail("เมื่อโจมตี/สกิลโดนฮีโร่ศัตรู จะได้บัฟและวิ่งเร็วขึ้น 2 หน่วย (ระยะไกลสะสม 1 ครั้ง/ใกล้ 2 ครั้ง) เป็นเวลา 3 วิ เมื่อครบ 10 ครั้งจะฟื้น 15% HP ที่เสียไป เจาะเกราะ/เจาะเกราะเวท +15% (ระยะไกลเพิ่มแค่ 5%)");
      e22.setTypeEn(typeEnRepository.findById(3));
      e22.setLevelEn(levelEnRepository.findById(3));
      enchantmentRepository.save(e22);
      //----------------------- Devil’s Awakening -----------------------------------
      Enchantment e23 = new Enchantment();
      e23.setName("Devil’s Awakening");
      e23.setImage("..\\Enchantment\\Lokheim\\ขั้น 3\\Devils-Awakening.png");
      e23.setDetail(" เมื่อใช้สกิลอัลติเมต จะลดคูลดาวน์ของสกิลธรรมดาลง 50% และลดอัตราการนับคูลดาวน์ลงอีก 20% รวมถึงลดความเสียหายที่ได้รับลง 10% (ขยายระยะเวลาเพิ่ม 3 วิ หากได้ Kill หรือ Assist) คูลดาวน์ 30 วิ");
      e23.setTypeEn(typeEnRepository.findById(3));
      e23.setLevelEn(levelEnRepository.findById(3));
      enchantmentRepository.save(e23);
      //----------------------- Axe of Sacrifice -----------------------------------
      Enchantment e24 = new Enchantment();
      e24.setName("Axe of Sacrifice");
      e24.setImage("..\\Enchantment\\Veda\\ขั้น 1\\Veda-1.png");
      e24.setDetail("สร้างความเสียหายเพิ่มขึ้น 3% และได้รับความเสียหายแรงขึ้น 2% (ฮีโร่ระยะไกล 1%)");
      e24.setTypeEn(typeEnRepository.findById(4));
      e24.setLevelEn(levelEnRepository.findById(1));
      enchantmentRepository.save(e24);
      //----------------------- Mana Refill -----------------------------------
      Enchantment e25 = new Enchantment();
      e25.setName("Mana Refill");
      e25.setImage("..\\Enchantment\\Veda\\ขั้น 1\\Veda-2.png");
      e25.setDetail("เมื่อใช้สกิล/โจมตีปกติโดนฮีโร่ศัตรู จะฟื้นฟูมานา 8% (คลูดาวน์ 5 วิ)");
      e25.setTypeEn(typeEnRepository.findById(4));
      e25.setLevelEn(levelEnRepository.findById(1));
      enchantmentRepository.save(e25);
      //----------------------- Sacred Bead -----------------------------------
      Enchantment e26 = new Enchantment();
      e26.setName("Sacred Bead");
      e26.setImage("..\\Enchantment\\Veda\\ขั้น 1\\Veda-3.png");
      e26.setDetail("คลูดาวน์สกิลอัลติเมตลดลง 10% (ผลจะลดลงหรือไม่ทำงานหากถึงขีดจำกัดการลดคลูดาวน์สูงสุดแล้ว)");
      e26.setTypeEn(typeEnRepository.findById(4));
      e26.setLevelEn(levelEnRepository.findById(1));
      enchantmentRepository.save(e26);
      //----------------------- Blessing -----------------------------------
      Enchantment e27 = new Enchantment();
      e27.setName("Blessing");
      e27.setImage("..\\Enchantment\\Veda\\ขั้น 2\\Veda-4.png");
      e27.setDetail("โบนัสอัตราคริติคอลจากไอเทม +12% โบนัสพลังเวทจากไอเทม +8%");
      e27.setTypeEn(typeEnRepository.findById(4));
      e27.setLevelEn(levelEnRepository.findById(2));
      enchantmentRepository.save(e27);
      //----------------------- Holy Verdict -----------------------------------
      Enchantment e28 = new Enchantment();
      e28.setName("Holy Verdict");
      e28.setImage("..\\Enchantment\\Veda\\ขั้น 2\\Veda-5.png");
      e28.setDetail("ได้รับเจาะเกราะ/เจาะเกราะเวท +18 (LV อัพ+3)");
      e28.setTypeEn(typeEnRepository.findById(4));
      e28.setLevelEn(levelEnRepository.findById(2));
      enchantmentRepository.save(e28);
      //----------------------- Holy Summoner -----------------------------------
      Enchantment e29 = new Enchantment();
      e29.setName("Holy Summoner");
      e29.setImage("..\\Enchantment\\Veda\\ขั้น 3\\Holy-Summoner.png");
      e29.setDetail("เมื่อโจมตีโดนศัตรูครบ 3 ครั้งต่อเนื่อง จะเรียกแฟรี่ออกมาโจมตีเป็นเวลา 5 วิ โดยแฟรี่จะโจมตีเป้าหมาย เดียวกับที่คุณกำลังโจมตีอยู่ด้วยพลังโจมตี 0.4 AD และอัตราเจาะเกราะ 15% (คูลดาวน์ 10 วิ)");
      e29.setTypeEn(typeEnRepository.findById(4));
      e29.setLevelEn(levelEnRepository.findById(3));
      enchantmentRepository.save(e29);
      //----------------------- Holy Thunder -----------------------------------
      Enchantment e30 = new Enchantment();
      e30.setName("Holy Thunder");
      e30.setImage("..\\Enchantment\\Veda\\ขั้น 3\\Holy-Thunder.png");
      e30.setDetail("การโจมตีหรือใช้สกิลโดนฮีโร่ศัตรูครั้งแรกจะปล่อยสายฟ้าสร้างความเสียหาย 100 (+10 เมื่อ LVอัพ) (0.4 Bonus AS) (0.3 AP) จากนั้นการโจมตีปกติและสกิลครั้งถัดไปจะลดคูลดาวน์เอฟเฟต์นี้ลง 1 วิ (คูลดาวน์ 15 วิ)");
      e30.setTypeEn(typeEnRepository.findById(4));
      e30.setLevelEn(levelEnRepository.findById(3));
      enchantmentRepository.save(e30);
      //----------------------- Sacred Protection -----------------------------------
      Enchantment e31 = new Enchantment();
      e31.setName("Sacred Protection");
      e31.setImage("..\\Enchantment\\Veda\\ขั้น 3\\Sacred-Protection.png");
      e31.setDetail("หากได้รับความเสียหายเกิน 30% ของ HP สูงสุด ภายใน 3 วิ จะวิ่งเร็วขึ้น 50% เป็นเวลา 1.5 วิ เกราะ 550 (LV อัพ+60) และเวทแวมไพร์ 15% เป็นเวลา 6 วิ ซึ่งหากได้ Kill/Assist จะได้ขยายเวลาเวทแวมไพร์ขึ้น 3 วิ (คูลดาวน์ 30 วิ)");
      e31.setTypeEn(typeEnRepository.findById(4));
      e31.setLevelEn(levelEnRepository.findById(3));
      enchantmentRepository.save(e31);

      

//=========================== Item Information ================================
//=============================================================================
      Stream.of("โจมตี" , "เวท" , "ป้องกัน" , "เคลื่อนที่" , "ป่า" , "สนับสนุน").forEach(typeItems -> {
        TypeItem type = new TypeItem();
        type.setTypeItem(typeItems);
        typeItemRepository.save(type);
      });

      //----------------------- Short Sword -----------------------------------
      Item i1 = new Item();
      i1.setName("Short Sword");
      i1.setImg_item("..\\Item\\โจมตี\\Short-Sword.png");
      i1.setTypeItem(typeItemRepository.findById(1));
      i1.setEffectItem("+10 พลังโจมตี");
      i1.setPriceItem(250);
      itemRepository.save(i1);

      loginRepository.findAll().forEach(System.out::println);
    };
  }
}
