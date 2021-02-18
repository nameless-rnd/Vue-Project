package com.project.backend;

import com.project.backend.Character.Entity.Character;
import com.project.backend.Character.Entity.Skill;
import com.project.backend.Character.Entity.TypeHeroes;
import com.project.backend.Character.Repository.CharacterRepository;
import com.project.backend.Character.Repository.SkillRepository;
import com.project.backend.Character.Repository.TypeHeroesRepository;

import com.project.backend.Enchantment.Entity.Enchantment;
import com.project.backend.Enchantment.Entity.TypeEn;
import com.project.backend.Enchantment.Repository.EnchantmentRepository;
import com.project.backend.Enchantment.Repository.TypeEnRepository;

import com.project.backend.Item.Entity.Item;
import com.project.backend.Item.Entity.TypeItem;
import com.project.backend.Item.Entity.PropertyItem;
import com.project.backend.Item.Repository.ItemRepository;
import com.project.backend.Item.Repository.TypeItemRepository;
import com.project.backend.Item.Repository.PropertyItemRepository;

import com.project.backend.User.Entity.User;
import com.project.backend.User.Repository.UserRepository;

import com.project.backend.Mode.Entity.Map;
import com.project.backend.Mode.Entity.Mode;
import com.project.backend.Mode.Entity.Rank;
import com.project.backend.Mode.Entity.TypeMode;
import com.project.backend.Mode.Entity.Monster;
import com.project.backend.Mode.Repository.MonsterRepository;
import com.project.backend.Mode.Repository.MapRepository;
import com.project.backend.Mode.Repository.ModeRepository;
import com.project.backend.Mode.Repository.RankRepository;
import com.project.backend.Mode.Repository.TypeModeRepository;

import com.project.backend.Effect.Entity.Effect;
import com.project.backend.Effect.Repository.EffectRepository;

import com.project.backend.Rune.Entity.Rune;
import com.project.backend.Rune.Entity.TypeRune;
import com.project.backend.Rune.Entity.PropertyRune;

import com.project.backend.Rune.Repository.RuneRepository;
import com.project.backend.Rune.Repository.TypeRuneRepository;
import com.project.backend.Rune.Repository.PropertyRuneRepository;

import com.project.backend.Skin.Entity.Skin;
import com.project.backend.Skin.Repository.SkinRepository;
import com.project.backend.Skin.Entity.TypeSkin;
import com.project.backend.Skin.Repository.TypeSkinRepository;
import com.project.backend.Skin.Entity.Receive;
import com.project.backend.Skin.Repository.ReceiveRepository;

import com.project.backend.Post.Entity.Post;
import com.project.backend.Post.Repository.PostRepository;

import com.project.backend.Comment.Entity.Comment;
import com.project.backend.Comment.Repository.CommentRepository;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;  
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
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
  ApplicationRunner init(
    UserRepository userRepository,CharacterRepository characterRepository,
    SkillRepository skillRepository,TypeHeroesRepository typeHeroesRepository,
    RuneRepository runeRepository,TypeRuneRepository typeRuneRepository,
    PropertyRuneRepository propertyRuneRepository,EnchantmentRepository enchantmentRepository,
    TypeEnRepository typeEnRepository,ItemRepository itemRepository,
    PropertyItemRepository propertyItemRepository,TypeItemRepository typeItemRepository,
    EffectRepository effectRepository,ModeRepository modeRepository,
    MapRepository mapRepository,TypeModeRepository typeModeRepository,
    RankRepository rankRepository,MonsterRepository monsterRepository,
    SkinRepository skinRepository,TypeSkinRepository typeSkinRepository,
    ReceiveRepository receiveRepository,PostRepository postRepository,
    CommentRepository commentRepository
  ) {
    return args -> {
      //Object[][] data;

      User u1 = new User();
      u1.setName("Nattapol Panta");
      u1.setUsername("namenp2707");
      u1.setPassword("27072541");
      u1.setEmail("namenp09@gmail.com");
      userRepository.save(u1);

      Stream.of("พลังโจมตี", "อัตราคริติคอล" , "พลังเวท" , "ความเร็วโจมตี" ,
          "พลังชีวิต" , "ฟื้นฟูพลังชีวิต/5วิ" , "ดูดเลือด" , "เวทแวมไพร์" , "เกราะ" ,
          "ต้านทานเวท" , "เจาะเกราะ" , "เจาะเกราะเวท" , "ความเสียหายคริติคอล" ,
          "ลดคูลดาวน์" , "ความเร็วเคลื่อนที่" , "มานาสูงสุด").forEach(effectR -> {
            Effect effect = new Effect();
            effect.setEffect(effectR);
            effectRepository.save(effect);
          }
        );

      //========================= Heroes Information ================================
      //=============================================================================
      //-------------------------- Type of Heroes ---------------------------------
      TypeHeroes t1 = new TypeHeroes();
      t1.setImg_typeHeroes("..\\assasin.png");
      t1.setTypeHeroes("Assassin");
      typeHeroesRepository.save(t1);

      TypeHeroes t2 = new TypeHeroes();
      t2.setImg_typeHeroes("..\\carry.png");
      t2.setTypeHeroes("Carry");
      typeHeroesRepository.save(t2);

      TypeHeroes t3 = new TypeHeroes();
      t3.setImg_typeHeroes("..\\mage.png");
      t3.setTypeHeroes("Mage");
      typeHeroesRepository.save(t3);

      TypeHeroes t4 = new TypeHeroes();
      t4.setImg_typeHeroes("..\\fighter.png");
      t4.setTypeHeroes("Fighter");
      typeHeroesRepository.save(t4);

      TypeHeroes t5 = new TypeHeroes();
      t5.setImg_typeHeroes("..\\tank.png");
      t5.setTypeHeroes("Tank");
      typeHeroesRepository.save(t5);

      TypeHeroes t6 = new TypeHeroes();
      t6.setImg_typeHeroes("..\\support.png");
      t6.setTypeHeroes("Support");
      typeHeroesRepository.save(t6);

      //======================= Airi ===================================
      //================================================================

      Skill skill_airi0 = new Skill();
      skill_airi0.setImg_skill("..\\Heroes\\Airi\\skill-airi.png");
      skill_airi0.setName_skill("Dragon Blade");
      skill_airi0.setDetail_skill(
        "การโจมตีปกติแต่ละครั้ง จะลดคูลดาวน์สกิล Dragon Shuriken 1 วินาที"
      );
      skillRepository.save(skill_airi0);

      Skill skill_airi1 = new Skill();
      skill_airi1.setImg_skill("..\\Heroes\\AiRi\\skill-airi1.png");
      skill_airi1.setName_skill("Dragon Shuriken");
      skill_airi1.setDetail_skill(
        "Airi ปาดาวกระจายใส่เหล่าศัตรูเบื้องหน้า สร้างความเสียหายกายภาพ"
      );
      skillRepository.save(skill_airi1);

      Skill skill_airi2 = new Skill();
      skill_airi2.setImg_skill("..\\Heroes\\AiRi\\skill-airi2.png");
      skill_airi2.setName_skill("Swift Shadow");
      skill_airi2.setDetail_skill(
        "Airi พุ่งไปโจมตีจุดที่กำหนด สร้างความเสียหายกายภาพโดยสกิลนี้สามารถใช้ต่อเนื่องได้ 3 ครั้ง ก่อนที่สกิลจะคูลดาวน์"
      );
      skillRepository.save(skill_airi2);

      Skill skill_airi3 = new Skill();
      skill_airi3.setImg_skill("..\\Heroes\\AiRi\\skill-airi3.png");
      skill_airi3.setName_skill("Ryo no Ikari");
      skill_airi3.setDetail_skill(
        "Airi กระโดดขึ้นไปบนอากาศ พร้อมกับเรียกมังกรออกมาโจมตีสร้างความเสียหายกายภาพ และลดความเร็ว จากนั้นสร้างความเสียหายซ้ำอีกครั้ง พร้อมกับสตั๊นศัตรู (การโจมตีแต่ละครั้งจะเพิ่มเกราะ)ขณะใช้สกิลจะไม่ติดสถานะ และความเร็วเพิ่มขึ้น 100% เป็นเวลา 2.5 วิ; ความเร็วโจมตี 30% เป็นเวลา 5 วิ"
      );
      skillRepository.save(skill_airi3);

      Character c1 = new Character();
      c1.setName("Airi");
      c1.setImg_small("..\\Heroes\\Airi\\airi-s.png");
      c1.setImg_big("..\\Heroes\\Airi\\airi.png");
      c1.addTypeHero(typeHeroesRepository.findById(1));
      c1.addTypeHero(typeHeroesRepository.findById(4));
      c1.addSkill(skillRepository.findById(1));
      c1.addSkill(skillRepository.findById(2));
      c1.addSkill(skillRepository.findById(3));
      c1.addSkill(skillRepository.findById(4));
      characterRepository.save(c1);

      //======================= Aleister ===============================
      //================================================================
      Skill skill_Aleister0 = new Skill();
      skill_Aleister0.setImg_skill("..\\Heroes\\Aleister\\skill-0.png");
      skill_Aleister0.setName_skill("Wicked Plot");
      skill_Aleister0.setDetail_skill(
        "ทุกการโจมตีปกติครั้งที่ 3 หรือการใช้สกิลของ Aleister จะทำให้เป้าหมายติดคำสาป เมื่อติดคำสาป 3 ครั้ง จะทำให้เกิดระเบิด สร้างความเสียหายจริง"
      );
      skillRepository.save(skill_Aleister0);

      Skill skill_Aleister1 = new Skill();
      skill_Aleister1.setImg_skill("..\\Heroes\\Aleister\\skill-1.png");
      skill_Aleister1.setName_skill("Magic Barrier");
      skill_Aleister1.setDetail_skill(
        "Aleister สร้างแผงสายฟ้าดักหน้าศัตรู เมื่อศัตรูวิ่งผ่านจะสร้างความเสียหายเวทพร้อมกับทำให้ติดสต๊ันและคำสาป 1 ครั้ง หลังจากนั้นจะทำให้วิ่งช้าลงเป็นเวลาสั้นๆ"
      );
      skillRepository.save(skill_Aleister1);

      Skill skill_Aleister2 = new Skill();
      skill_Aleister2.setImg_skill("..\\Heroes\\Aleister\\skill-2.png");
      skill_Aleister2.setName_skill("Matrix of Woe");
      skill_Aleister2.setDetail_skill(
        "Aleister สร้างพื้นที่สายฟ้าขึ้นมาช็อตศัตรูอย่างต่อเนื่อง โดยการโจมตีแต่ละครั้งจะสร้างความเสียหายเวทและติดคำสาป 1 ครั้ง"
      );
      skillRepository.save(skill_Aleister2);

      Skill skill_Aleister3 = new Skill();
      skill_Aleister3.setImg_skill("..\\Heroes\\Aleister\\skill-3.png");
      skill_Aleister3.setName_skill("Magic Prison");
      skill_Aleister3.setDetail_skill(
        "Aleister กักขังศัตรูในคุกเวท โดยจะสร้างความเสียหายเวทแต่ละครั้ง พร้อมกับทำให้ติดสตัน 2.5 วินาที (การโจมตีแต่ละครั้งทำให้ติดคำสาป 1 ครั้ง)"
      );
      skillRepository.save(skill_Aleister3);

      Character c2 = new Character();
      c2.setName("Aleister");
      c2.setImg_small("..\\Heroes\\Aleister\\Aleister-s.png");
      c2.setImg_big("..\\Heroes\\Aleister\\Aleister.png");
      c2.addTypeHero(typeHeroesRepository.findById(3));
      c2.addSkill(skillRepository.findById(5));
      c2.addSkill(skillRepository.findById(6));
      c2.addSkill(skillRepository.findById(7));
      c2.addSkill(skillRepository.findById(8));
      characterRepository.save(c2);

      //========================= Alice ================================
      //================================================================
      Skill skill_Alice0 = new Skill();
      skill_Alice0.setImg_skill("..\\Heroes\\Alice\\skill-0.png");
      skill_Alice0.setName_skill("Trot");
      skill_Alice0.setDetail_skill(
        "การใช้สกิลจะทำให้ความเร็วเคลื่อนที่เพิ่มขึ้น 20% เป็นเวลา 1 วิ"
      );
      skillRepository.save(skill_Alice0);

      Skill skill_Alice1 = new Skill();
      skill_Alice1.setImg_skill("..\\Heroes\\Alice\\skill-1.png");
      skill_Alice1.setName_skill("Chrono Burst");
      skill_Alice1.setDetail_skill(
        "Alice ดึงพลังแห่งพระอาทิตย์ สร้างความเสียหายเวทและทำให้ศัตรูติดสตั๊น"
      );
      skillRepository.save(skill_Alice1);

      Skill skill_Alice2 = new Skill();
      skill_Alice2.setImg_skill("..\\Heroes\\Alice\\skill-2.png");
      skill_Alice2.setName_skill("Chrono Shield");
      skill_Alice2.setDetail_skill(
        "Alice สร้างโล่ให้กับพันธมิตรของเธอ ซึ่งดูดซับความเสียหาย และเพื่มความเร็วเคลื่อนที่ขึ้น 30% เป็นเวลา 2 วินาที"
      );
      skillRepository.save(skill_Alice2);

      Skill skill_Alice3 = new Skill();
      skill_Alice3.setImg_skill("..\\Heroes\\Alice\\skill-3.png");
      skill_Alice3.setName_skill("Chrono Flow");
      skill_Alice3.setDetail_skill(
        "Alice ปลดปล่อยห้วงเวลาลงที่พื้น ลดความเร็วการเคลื่อนที่ 35% เป็นเวลา 2 วิ และลดอัตราการป้องกันเวทของศัตรูออก 30/40/50% รวมถึงสร้างความเสียหายเวททุก 0.5 วิ และใบ้ศัตรูที่เข้ามาในวงสกิลทีหลังอีก 1 วิ"
      );
      skillRepository.save(skill_Alice3);

      Character c3 = new Character();
      c3.setName("Alice");
      c3.setImg_small("..\\Heroes\\Alice\\Alice-s.png");
      c3.setImg_big("..\\Heroes\\Alice\\Alice.png");
      c3.addTypeHero(typeHeroesRepository.findById(6));
      c3.addSkill(skillRepository.findById(9));
      c3.addSkill(skillRepository.findById(10));
      c3.addSkill(skillRepository.findById(11));
      c3.addSkill(skillRepository.findById(12));
      characterRepository.save(c3);

      //========================= Allain ================================
      //================================================================
      Skill skill_Allain0 = new Skill();
      skill_Allain0.setImg_skill("..\\Heroes\\Allain\\skill-0.png");
      skill_Allain0.setName_skill("Howling Sword");
      skill_Allain0.setDetail_skill(
        "1. Allain สามารถสะสมพลังได้จากการโจมตีปกติ โดยสามารถสะสมได้ 4 ขั้น การโจมตีปกติ 1 ครั้งจะสร้างความเสียหายทั้งกายภาพและเวทอย่างละ 1 ครั้ง (รวมเป็น 2) และสะสมพลังได้ 1 ขั้น และที่การโจมตีครั้งสุดท้ายจะสร้างความเสียหายจริง 2. ทุกครั้งที่โจมตี Allain จะได้รับความเสียหายน้อยลง และค่าเจาะเกราะเพิ่ม 1 วินาที ที่การโจมตีครั้งที่ 8 จะฟื้นฟู HP 8% ของ HP ที่เสียไป และ 16 ครั้งจะฟื้นฟู HP 2 เท่าจากเดิม"
      );
      skillRepository.save(skill_Allain0);

      Skill skill_Allain1 = new Skill();
      skill_Allain1.setImg_skill("..\\Heroes\\Allain\\skill-1.png");
      skill_Allain1.setName_skill("Meteor Strike");
      skill_Allain1.setDetail_skill(
        "มี 4 ระดับ โดยอิงตามพลังที่สะสมได้จากการโจมตีปกติ ขั้นที่ 1 เสยดาบขึ้นไปยังทิศที่เลือก สร้างความเสียหายเวทและทำให้เป้าหมายลอยขึ้น เร็วขึ้นอีก ขั้นที่ 2 โจมตี 3 ครั้ง สร้างความเสียหายทั้งกายภาพและเวทและทำให้เป้าหมายลอยขึ้น ต้องเร็วขึ้นอีก ขั้นที่ 3 โจมตี 5 ครั้ง สร้างความเสียหายทั้งกายภาพและเวทและทำให้เป้าหมายลอยขึ้น ต้องเร็วกว่านี้อีก!! ขั้นสุดท้าย โจมตี 9 ครั้ง สร้างความเสียหายทุกรูปแบบและทำให้เป้าหมายลอยขึ้น!! นอกจากนี้เขาจะป้องกัน CC ทุกรูปแบบและสามารถเลือกทิศทางในการโจมตีครั้งสุดท้ายได้ พอละ เมื่อยแขน"
      );
      skillRepository.save(skill_Allain1);

      Skill skill_Allain2 = new Skill();
      skill_Allain2.setImg_skill("..\\Heroes\\Allain\\skill-2.png");
      skill_Allain2.setName_skill("Moonflash");
      skill_Allain2.setDetail_skill(
        "พุ่งไปยังทิศที่เลือก สร้างความเสียหายกายภาพและทำให้เป้าหมายแรกไม่สามารเคลื่อนที่ได้ 1 วินาที โดยสกิลนี้สามารถสะสมได้ 2 ครั้ง"
      );
      skillRepository.save(skill_Allain2);

      Skill skill_Allain3 = new Skill();
      skill_Allain3.setImg_skill("..\\Heroes\\Allain\\skill-3.png");
      skill_Allain3.setName_skill("Death at Sunset");
      skill_Allain3.setDetail_skill(
        "ลีอคเป้าหมายที่เลือกพร้อมทั้งหายตัว 1.5 วินาที จากนั้นก็ปรากฏตัวออกมาฟันกวาดรอบตัว สร้างความเสียหายจริงตาม HP ปัจจุบันของเป้าหมาย โดยจะรุนแรงขึ้น 25% ต่อ 1 เป้าหมายที่โดนสูงสุด 50% หากใช้ใส่ศัตรูจะลดความเร็วลง และ Allain จะได้รับโล่กันความเสียหาย หากใช้ใส่เพื่อนจะเพิ่มความเร็วให้เป้าหมายและทำให้เพื่อนได้รับโล่กันความเสียหาย หากใช้ใส่แฟน (Butterfly) จะได้รับผลเหมือนใช้ใส่เพื่อนทุกประการ แต่ จะได้รับบัพกัน CC เพิ่มอีกด้วย"
      );
      skillRepository.save(skill_Allain3);

      Character c4 = new Character();
      c4.setName("Allain");
      c4.setImg_small("..\\Heroes\\Allain\\Allain-s.jpg");
      c4.setImg_big("..\\Heroes\\Allain\\Allain-1.jpg");
      c4.addTypeHero(typeHeroesRepository.findById(4));
      c4.addSkill(skillRepository.findById(13));
      c4.addSkill(skillRepository.findById(14));
      c4.addSkill(skillRepository.findById(15));
      c4.addSkill(skillRepository.findById(16));
      characterRepository.save(c4);

      //========================= Amily ================================
      //================================================================
      Skill skill_Amily0 = new Skill();
      skill_Amily0.setImg_skill("..\\Heroes\\Amily\\skill-0.png");
      skill_Amily0.setName_skill("Duel");
      skill_Amily0.setDetail_skill(
        "เมื่อการโจมตีปกติ หรือสกิล Combo vอง Amily โจมตีโดนเป้าหมายเดียว เธอจะสร้างความเสียหายเพิ่มขึ้น 50%"
      );
      skillRepository.save(skill_Amily0);

      Skill skill_Amily1 = new Skill();
      skill_Amily1.setImg_skill("..\\Heroes\\Amily\\skill-1.png");
      skill_Amily1.setName_skill("Kickblade");
      skill_Amily1.setDetail_skill(
        "Amily ปามีดออกไป ซึ่งหากโดนศัตรู มีดจะโจมตีใส่ศัตรูอื่นอีก 4 ครั้งสร้าง ความเสียหายกายภาพ 150 (+60% AD) และลดความเร็วเคลื่อนที่ 30% เป็นเวลา 1 3 (เป้าหมายแรกจะลด 50%) เมื่อมีดลอยกลับมา เธอจะวิ่งเร็วขึ้น 20% เป็นเวลา 33 ฟื้นฟู HP 125(+50% AD) และลดคูลดาวน์สกิลนี้ 30%"
      );
      skillRepository.save(skill_Amily1);

      Skill skill_Amily2 = new Skill();
      skill_Amily2.setImg_skill("..\\Heroes\\Amily\\skill-2.png");
      skill_Amily2.setName_skill("Combo");
      skill_Amily2.setDetail_skill(
        "Amily กระโดดเตะต่อเนื่อง สร้างความเสียหายกายภาพ 80 (+30% AD) โดยการโจมตีครั้งที่ 2 จะทําให้ลอยขึ้น จากนั้นการโจมตีปกติครั้งต่อไปจะพังโจมตี สร้างโบนัส ความเสียหายกายภาพ 80 (+30% AD) สกิลติดตัว: Amily ฟื้นฟู 1% ของพลังชีวิต และมานาสูงสุดต่อวิ รวมถึงวิ่งเร็วขึ้น 10 หน่วย เมื่อออกจากการต่อสู้"
      );
      skillRepository.save(skill_Amily2);

      Skill skill_Amily3 = new Skill();
      skill_Amily3.setImg_skill("..\\Heroes\\Amily\\skill-3.png");
      skill_Amily3.setName_skill("Enrage");
      skill_Amily3.setDetail_skill(
        "Amily เข้าสู่โหมดคลั่ง ซึ่งหลังจาก 1วิ จะสร้าง ความเสียหายเวท 300 จากนั้นเธอจะได้รับพลังโจมตีเพิ่มขึ้น 100 หน่วย และความเร็วเคลื่อนที่ 40 หน่วย รวมถึงต้านทานความเสียหาย 40 หน่วย ในvณะเดียวกันเธอจะสร้างความเสียหายเวท 60 ทุก 8วิ"
      );
      skillRepository.save(skill_Amily3);

      Character c5 = new Character();
      c5.setName("Amily");
      c5.setImg_small("..\\Heroes\\Amily\\Amily-s.png");
      c5.setImg_big("..\\Heroes\\Amily\\Amily.png");
      c5.addTypeHero(typeHeroesRepository.findById(1));
      c5.addTypeHero(typeHeroesRepository.findById(4));
      c5.addSkill(skillRepository.findById(17));
      c5.addSkill(skillRepository.findById(18));
      c5.addSkill(skillRepository.findById(19));
      c5.addSkill(skillRepository.findById(20));
      characterRepository.save(c5);

      //========================= Annette ================================
      //================================================================
      Skill skill_Annette0 = new Skill();
      skill_Annette0.setImg_skill("..\\Heroes\\Annette\\skill-0.png");
      skill_Annette0.setName_skill("Whisperwind");
      skill_Annette0.setDetail_skill(
        "เมื่อ Annette ใช้สกิล เธอจะได้รับสัญลักษณ์แห่งสายลม (สะสมสูงสุด 10 ครั้ง) ขณะที่สะสมครบ 10 ครั้ง หาก HP ตนเองหรือพันธมิตรใกล้ๆ เหลือต่ำกว่า 70% จะใช้สัญลักษณ์ทั้งหมดฟื้นฟูพลังชีวิตของตัวเองและพันธมิตรรอบๆ ทันที (เอฟเฟคนี้จะทำงานทุก 5 วิ)"
      );
      skillRepository.save(skill_Annette0);

      Skill skill_Annette1 = new Skill();
      skill_Annette1.setImg_skill("..\\Heroes\\Annette\\skill-1.png");
      skill_Annette1.setName_skill("Gust Force");
      skill_Annette1.setDetail_skill(
        "Annette เรียกพายุหมุนขึ้นมายังจุดที่กำหนด สร้างความเสียหายเวททุก 0.25 วิ เป็นเวลา 2 วิ (การโจมตีทุกๆ 2 ครั้ง จะทำให้ความเสียหายจะแรงขึ้น 33%) นอกจากนี้ ศัตรูที่อยู่ใจกลางวงพายุจะได้รับโบนัสความเสียหายเพิ่มขึ้น (2% ของ HP สูงสุด) พร้อมกับวิ่งช้าลง 50% เป็นเวลา 0.25 วิ"
      );
      skillRepository.save(skill_Annette1);

      Skill skill_Annette2 = new Skill();
      skill_Annette2.setImg_skill("..\\Heroes\\Annette\\skill-2.png");
      skill_Annette2.setName_skill("Wind Cuffs");
      skill_Annette2.setDetail_skill(
        "Annette สร้างโล่ให้กับพันธมิตรของเธอ ซึ่งดูดซับความเสียหาย และเพื่มความเร็วเคลื่อนที่ขึ้น 30% เป็นเวลา 2 วินาที"
      );
      skillRepository.save(skill_Annette2);

      Skill skill_Annette3 = new Skill();
      skill_Annette3.setImg_skill("..\\Heroes\\Annette\\skill-3.png");
      skill_Annette3.setName_skill("Hurricane Wall");
      skill_Annette3.setDetail_skill(
        "Annette พุ่งไปยังจุดที่กำหนด และเรียกพายุเฮอริเคนออกมาผลักให้ศัตรูที่อยู่รอบๆ กระเด็นออกไป พร้อมกับสร้างความเสียหายเวท ระหว่างนั้นพายุที่เธอสร้างจะขวางทางไม่ให้ศัตรูสามารถเดินผ่านได้ ส่วนพันธมิตรที่อยู่ในวงพายุจะวิ่งเร็วขึ้น และโจมตีเร็วขึ้นเป็นเวลา 3.5 วิ (สถานะผิดปกติทั้งหมดจะถูกลบออกจาก Annette หลังใช้สกิลนี้)"
      );
      skillRepository.save(skill_Annette3);

      Character c6 = new Character();
      c6.setName("Annette");
      c6.setImg_small("..\\Heroes\\Annette\\Annette-s.png");
      c6.setImg_big("..\\Heroes\\Annette\\Annette.png");
      c6.addTypeHero(typeHeroesRepository.findById(3));
      c6.addTypeHero(typeHeroesRepository.findById(6));
      c6.addSkill(skillRepository.findById(21));
      c6.addSkill(skillRepository.findById(22));
      c6.addSkill(skillRepository.findById(23));
      c6.addSkill(skillRepository.findById(24));
      characterRepository.save(c6);

      //========================= Arduin ================================
      //================================================================
      Skill skill_Arduin0 = new Skill();
      skill_Arduin0.setImg_skill("..\\Heroes\\Arduin\\skill-0.png");
      skill_Arduin0.setName_skill("Bloodlust");
      skill_Arduin0.setDetail_skill(
        "ถ้าหากพลังชีวิตของเขาต่ำกว่า 50% Arduin จะเข้าสู้โหมด Bloodlust เป็นเวลา 8 วิ ซึ่งในโหมดนี้ เมื่อเขาโจมตีปกติ หรือใช้สกิล เขาจะฟื้นฟูพลังชีวิตตัวเอง 2% ของพลังชีวิตสูงสุด (คูลดาวน์ 60 วิ) เขาจะเข้าสู้โหมดนี้อีกครั้งทันทีหลังจากคูลดาวน์เสร็จ หากพลังชีวิตของเขาเหลือต่ำกว่า 90%"
      );
      skillRepository.save(skill_Arduin0);

      Skill skill_Arduin1_1 = new Skill();
      skill_Arduin1_1.setImg_skill("..\\Heroes\\Arduin\\skill-1.1.png");
      skill_Arduin1_1.setName_skill("Rend");
      skill_Arduin1_1.setDetail_skill(
        "ฟาดคลื่นพลังออกไปด้วยขวานของเขา สร้างความเสียหายกายภาพ พร้อมกับลดความเร็วศัตรู 2% เป็นเวลา 2 วิ"
      );
      skillRepository.save(skill_Arduin1_1);

      Skill skill_Arduin1_2 = new Skill();
      skill_Arduin1_2.setImg_skill("..\\Heroes\\Arduin\\skill-1.2.png");
      skill_Arduin1_2.setName_skill("Rend");
      skill_Arduin1_2.setDetail_skill(
        "หากสกิลโจมตีโดนฮีโร่ศัตรู เขาสามารถทุบขวานลงพื้น เพื่อสร้างความเสียหายกายภาพ และทำให้ศัตรูลอยขึ้นเป็นเวลา 1 วิ"
      );
      skillRepository.save(skill_Arduin1_2);

      Skill skill_Arduin2 = new Skill();
      skill_Arduin2.setImg_skill("..\\Heroes\\Arduin\\skill-2.png");
      skill_Arduin2.setName_skill("Undying Protector");
      skill_Arduin2.setDetail_skill(
        "Arduin ระเบิดพลัง สร้างความเสียหายเวทแก่ศัตรูรอบๆ พร้อมกับได้รับเกราะเท่ากับ 10% ของพลังชีวิตสูงสุด เป็นเวลา 5 วิ หลังจากเกราะทำงาน 8 วิ การโจมตีปกติ 3 ครั้ง หลังจากนี้ของ Arduin จะได้ สร้างความเสียหายจริงเพิ่ม และทุกครั้งที่โจมตีปกติโดนเป้าหมาย จะลดคูลดาวน์สกิล Cull ลง 1 วิ"
      );
      skillRepository.save(skill_Arduin2);

      Skill skill_Arduin3 = new Skill();
      skill_Arduin3.setImg_skill("..\\Heroes\\Arduin\\skill-3.png");
      skill_Arduin3.setName_skill("Cull");
      skill_Arduin3.setDetail_skill(
        "Arduin ปาขวานไปยังทิศทางที่กำหนด สร้าง ความเสียหายกายภาพพร้อมกับสตั๊นเป้าหมายแรกที่โดน เป็นเวลา 1.5 วิ จากนั้นเขาจะดึงตัวเองเข้าไปยังจุดที่ขวานถูกปาออกไป สร้าง ความเสียหายกายภาพแก่ศัตรูทั้งหมดในระยะ (Arduin จะไม่โดนสถานะใดๆ ขณะที่กำลังใช้สกิลนี้)"
      );
      skillRepository.save(skill_Arduin3);

      Character c7 = new Character();
      c7.setName("Arduin");
      c7.setImg_small("..\\Heroes\\Arduin\\Arduin-s.png");
      c7.setImg_big("..\\Heroes\\Arduin\\Arduin.png");
      c7.addTypeHero(typeHeroesRepository.findById(4));
      c7.addTypeHero(typeHeroesRepository.findById(5));
      c7.addSkill(skillRepository.findById(25));
      c7.addSkill(skillRepository.findById(26));
      c7.addSkill(skillRepository.findById(27));
      c7.addSkill(skillRepository.findById(28));
      c7.addSkill(skillRepository.findById(29));
      characterRepository.save(c7);

      //========================= Arum ================================
      //================================================================
      Skill skill_Arum0 = new Skill();
      skill_Arum0.setImg_skill("..\\Heroes\\Arum\\skill-0.png");
      skill_Arum0.setName_skill("Ravenous Beast");
      skill_Arum0.setDetail_skill(
        "หากภูติสัตว์ป่าโจมตีโดนฮีโร่ศัตรูจะสร้าง ความเสียหายเวท พร้อมกับฟื้นฟูพลังชีวิต Arum(แต่หากโจมตีโดนครีป จะฟื้นฟูน้อยกว่าฮีโร่)"
      );
      skillRepository.save(skill_Arum0);

      Skill skill_Arum1 = new Skill();
      skill_Arum1.setImg_skill("..\\Heroes\\Arum\\skill-1.png");
      skill_Arum1.setName_skill("Lion Tamer");
      skill_Arum1.setDetail_skill(
        "Arum คำราม สร้าง ความเสียหายเวทแก่ศัตรูรอบๆ พร้อมกับเรียกภูติสัตว์ป่าออกมา ระหว่างนั้นหากใช้สกิลนี้ซ้ำ และโจมตีโดนฮีโร่ศัตรู จะลดคูลดาวน์สกิลนี้ลง 50% (สามารถเรียกภูติสัตว์ป่าออกมาได้สูงสุด 3 ตัว)"
      );
      skillRepository.save(skill_Arum1);

      Skill skill_Arum2 = new Skill();
      skill_Arum2.setImg_skill("..\\Heroes\\Arum\\skill-2.png");
      skill_Arum2.setName_skill("Uncaged");
      skill_Arum2.setDetail_skill(
        "Arum ใช้ภูติสัตว์ป่าทั้งหมดสร้างความเสียหายเวท และ Arum จะวิ่งเร็วขึ้นชั่วขณะ สิงโตจะกระโดดโจมตีตามจำนวนภูติใช้เรียกออกมา ครั้งที่ 1: ลดความเร็วศัตรูลง 50% เป็นเวลา 1 วิ ครั้งที่ 2: ลดความเร็วศัตรูลง 90% เป็นเวลา 1 วิ ครั้งที่ 3:สตั๊นศัตรูเป็นเวลา 1 วิ"
      );
      skillRepository.save(skill_Arum2);

      Skill skill_Arum3 = new Skill();
      skill_Arum3.setImg_skill("..\\Heroes\\Arum\\skill-3.png");
      skill_Arum3.setName_skill("Snare");
      skill_Arum3.setDetail_skill(
        "ตรึงฮีโร่เป้าหมาย ทำให้ทั้ง Arum และเป้าหมายไม่สามารถขยับตัวได้เป็นเวลา 2.5 วิ (ไม่สามารถถูกหยุดได้) ความเสียหายที่แต่ละฝ่ายได้รับจะส่งผลต่ออีกฝ่ายด้วย และในระหว่างนั้น Arum จะไม่สามารถโจมตีหรือใช้สกิลได้ หลังจากสกิลจบลง Arum จะอัญเชิญภูติสัตว์ป่าออกมา 3 ตน"
      );
      skillRepository.save(skill_Arum3);

      Character c8 = new Character();
      c8.setName("Arum");
      c8.setImg_small("..\\Heroes\\Arum\\Arum-s.png");
      c8.setImg_big("..\\Heroes\\Arum\\Arum.png");
      c8.addTypeHero(typeHeroesRepository.findById(5));
      c8.addSkill(skillRepository.findById(30));
      c8.addSkill(skillRepository.findById(31));
      c8.addSkill(skillRepository.findById(32));
      c8.addSkill(skillRepository.findById(33));
      characterRepository.save(c8);

      //========================= Astrid ================================
      //================================================================
      Skill skill_Astrid0 = new Skill();
      skill_Astrid0.setImg_skill("..\\Heroes\\Astrid\\skill-0.png");
      skill_Astrid0.setName_skill("Martial Soul");
      skill_Astrid0.setDetail_skill(
        "เมื่อถูกโจมตีในขณะที่ พลังชีวิตต่ำกว่า 80% Astrid จะได้รับโล่ป้องกัน เป็นเวลา 4 วิ (คูลดาวน์ 24 วิ) และทุกครั้งที่โจมตี หรือใช้สกิลโดนฮีโร่ฝ่ายตรงข้าม จะลดคูลดาวน์ให้โล่ 3 วิ (ครีป และมอนสเตอร์ป่าลด 1.5 วิ)"
      );
      skillRepository.save(skill_Astrid0);

      Skill skill_Astrid1 = new Skill();
      skill_Astrid1.setImg_skill("..\\Heroes\\Astrid\\skill-1.png");
      skill_Astrid1.setName_skill("Spin Slash");
      skill_Astrid1.setDetail_skill(
        "Astrid ควงดาบรอบตัวเอง สร้างความเสียหายกายภาพแก่ศัตรูรอบตัว หากสกิลนี้โจมตีโดนศัตรู จะเพิ่มความเร็วโจมตีให้ตัวเอง แต่ถ้าโจมตีโดนฮีโร่จะเพิ่ม 5% (เพิ่มสูงสุด 25%) เป็นเวลา 3 วิ"
      );
      skillRepository.save(skill_Astrid1);

      Skill skill_Astrid2 = new Skill();
      skill_Astrid2.setImg_skill("..\\Heroes\\Astrid\\skill-2.png");
      skill_Astrid2.setName_skill("Fearless Charge");
      skill_Astrid2.setDetail_skill(
        "Astrid พุ่งไปยังทิศทางที่กำหนด จากนั้นจะชาร์จพลังให้กับการโจมตีปกติครั้งต่อไป สร้างความเสียหายกายภาพพร้อมกับลดความเร็วเป็นเวลา 1.5 วิ และลดเกราะของเป้าหมายลง 30% เป็นเวลา 4 วิ หากโจมตีปกติโดนฮีโร่ จะลดคูลดาวน์ให้กับสกิลนี้ 1 วิ (เอฟเฟคจะไม่ซ้อนทับ หากโจมตีโดนมากกว่า 1 ฮีโร่ ใน 1 ครั้ง)"
      );
      skillRepository.save(skill_Astrid2);

      Skill skill_Astrid3 = new Skill();
      skill_Astrid3.setImg_skill("..\\Heroes\\Astrid\\skill-3.png");
      skill_Astrid3.setName_skill("Dire Blow");
      skill_Astrid3.setDetail_skill(
        "Astrid จะเป็นอมตะ 2 วิ ก่อนชาร์จพลังไปที่ดาบเป็นเวลา 1.5 วิ และฟาดออกไปเป็นแนวนอน สร้างความเสียหายกายภาพ พร้อมกับลดคูลดาวน์สกิลติดตัวหากโจมตีโดนฮีโร่ หากโจมตีโดนเป้าหมายที่มี HP สูงกว่า จะทำให้เป้าหมายติดสตั๊น 1 วิ หากโจมตีโดนเป้าหมายที่มี HP ต่ำกว่า จะสร้างความเสียหายจริงตามพลังชีวิตที่เสียไป (มอนสเตอร์ป่าสูงสุด 500)"
      );
      skillRepository.save(skill_Astrid3);

      Character c9 = new Character();
      c9.setName("Astrid");
      c9.setImg_small("..\\Heroes\\Astrid\\Astrid-s.png");
      c9.setImg_big("..\\Heroes\\Astrid\\Astrid.png");
      c9.addTypeHero(typeHeroesRepository.findById(4));
      c9.addSkill(skillRepository.findById(34));
      c9.addSkill(skillRepository.findById(35));
      c9.addSkill(skillRepository.findById(36));
      c9.addSkill(skillRepository.findById(37));
      characterRepository.save(c9);

      //========================= Ata ================================
      //================================================================
      Skill skill_Ata0 = new Skill();
      skill_Ata0.setImg_skill("..\\Heroes\\Ata\\skill-0.png");
      skill_Ata0.setName_skill("Child of the Sea");
      skill_Ata0.setDetail_skill(
        "Ata จะกักเก็บ HP ที่เขาสูญเสียไปเอาไว้ ซึ่ง HP ที่เก็บไว้จะถูกนำมาฟื้นฟูเมื่อเขาสร้างความเสียหาย (ฟื้นฟู 50% ของความเสียหายหากโจมตีฮีโร่ / 25% หากไม่ใช่ฮีโร่) แต่หากไม่ได้ฟื้นฟูภายใน 7 วินาที HP ที่ถูกเก็บไว้จะค่อย ๆ ลดลง 3% ต่อวินาที"
      );
      skillRepository.save(skill_Ata0);

      Skill skill_Ata1 = new Skill();
      skill_Ata1.setImg_skill("..\\Heroes\\Ata\\skill-1.png");
      skill_Ata1.setName_skill("Wavewalking");
      skill_Ata1.setDetail_skill(
        "Ata จะกระโดดไปยังทิศที่กำหนด 2 ครั้ง (สามารถเปลี่ยนทิศทางกระโดดครั้งที่ 2 ได้) โดยครั้งที่ 1 จะสร้างความเสียหายกายภาพแก่ศัตรู และครั้งที่ 2 จะสร้างความเสียหายกายภาพซ้ำอีกครั้ง พร้อมกับสตั๊น 0.5 วินาที (เขาจะป้องกันสถานะขณะใช้งานสกิลนี้)"
      );
      skillRepository.save(skill_Ata1);

      Skill skill_Ata2 = new Skill();
      skill_Ata2.setImg_skill("..\\Heroes\\Ata\\skill-2.png");
      skill_Ata2.setName_skill("Sea Anchor");
      skill_Ata2.setDetail_skill(
        "Ata ปล่อยสมอเรือออกไปเป็นเส้นตรง สร้างความเสียหายกายภาพ พร้อมลดความเร็วศัตรู 60% เป็นเวลา 1.5 วินาที และดึงศัตรูเข้าหาเล็กน้อย แต่หากสมอพุ่งไปชนสิ่งกีดขวาง Ata จะพุ่งไปยังจุดดังกล่าวแทน พร้อมกับผลักศัตรูทั้งหมดไปด้วย สร้างความเสียหายกายภาพ และสตั๊น 1 วินาที หากศัตรูชนเข้ากับสิ่งกีดขวาง"
      );
      skillRepository.save(skill_Ata2);

      Skill skill_Ata3 = new Skill();
      skill_Ata3.setImg_skill("..\\Heroes\\Ata\\skill-3.png");
      skill_Ata3.setName_skill("Ghost Ship");
      skill_Ata3.setDetail_skill(
        "Ata เรียกซากเรือออกมา สร้างความเสียหายกายภาพ ซึ่งซากเรือขวางทางฮีโร่ทั้งหมดเป็นเวลา 4 วินาที ระหว่างนั้นเขาจะป้อกันสถานะ (สามารถใช้สกิลซ้ำ เพื่อนำซากเรือออกไป)"
      );
      skillRepository.save(skill_Ata3);

      Character c10 = new Character();
      c10.setName("Ata");
      c10.setImg_small("..\\Heroes\\Ata\\Ata-s.jpg");
      c10.setImg_big("..\\Heroes\\Ata\\Ata.png");
      c10.addTypeHero(typeHeroesRepository.findById(5));
      c10.addTypeHero(typeHeroesRepository.findById(4));
      c10.addSkill(skillRepository.findById(38));
      c10.addSkill(skillRepository.findById(39));
      c10.addSkill(skillRepository.findById(40));
      c10.addSkill(skillRepository.findById(41));
      characterRepository.save(c10);

      //========================= Azzen'Ka ================================
      //================================================================
      Skill skill_AzzenKa0 = new Skill();
      skill_AzzenKa0.setImg_skill("..\\Heroes\\AzzenKa\\skill-0.png");
      skill_AzzenKa0.setName_skill("Sand Trap");
      skill_AzzenKa0.setDetail_skill(
        "หากเป้าหมายได้รับความเสียหายโดยสกิล จะถูกติดสัญลักษณ์ไว้สูงสุด 3 ครั้ง เป้าหมายที่ติดสัญลักษณ์ครบ 3 ครั้งจะถูกแช่แข็งและสร้างความเสียหายเวท"
      );
      skillRepository.save(skill_AzzenKa0);

      Skill skill_AzzenKa1 = new Skill();
      skill_AzzenKa1.setImg_skill("..\\Heroes\\AzzenKa\\skill-1.png");
      skill_AzzenKa1.setName_skill("Sand Punch");
      skill_AzzenKa1.setDetail_skill(
        "Azzen'Ka เรียกหมัดทรายขึ้นมาจากพื้นเพื่อโจมตีศัตรู สร้างความเสียหายเวทและทำให้ศัตรูลอยขึ้น"
      );
      skillRepository.save(skill_AzzenKa1);

      Skill skill_AzzenKa2 = new Skill();
      skill_AzzenKa2.setImg_skill("..\\Heroes\\AzzenKa\\skill-2.png");
      skill_AzzenKa2.setName_skill("Dust Devil");
      skill_AzzenKa2.setDetail_skill(
        "Azzen'Ka ปล่อยปิศาจทรายกระแทกใส่ศัตรูของเขา สร้างความเสียหายเวทให้แก่ศัตรูที่โดน (หากกระแทกซ้ำครั้งที่ 2 จะสร้างความเสียหายเพียง 80%)"
      );
      skillRepository.save(skill_AzzenKa2);

      Skill skill_AzzenKa3 = new Skill();
      skill_AzzenKa3.setImg_skill("..\\Heroes\\AzzenKa\\skill-3.png");
      skill_AzzenKa3.setName_skill("Sand Wraith");
      skill_AzzenKa3.setDetail_skill(
        "Azzen'Ka ปล่อยพายุทรายออกไปโจมตีศัตรูของเขา สร้างความเสียหายเวทแก่ศัตรูที่โดน จากนั้นพายุทรายจะขยายตัวขึ้นที่พื้นอย่างต่อเนื่อง สร้างความเสียหายเวทแก่ศัตรูในระยะและลดความเร็วเคลื่อนที่ลง 60%"
      );
      skillRepository.save(skill_AzzenKa3);

      Character c11 = new Character();
      c11.setName("Azzen'Ka");
      c11.setImg_small("..\\Heroes\\AzzenKa\\AzzenKa-s.png");
      c11.setImg_big("..\\Heroes\\AzzenKa\\AzzenKa.png");
      c11.addTypeHero(typeHeroesRepository.findById(3));
      c11.addSkill(skillRepository.findById(42));
      c11.addSkill(skillRepository.findById(43));
      c11.addSkill(skillRepository.findById(44));
      c11.addSkill(skillRepository.findById(45));
      characterRepository.save(c11);

      //========================= Baldum ================================
      //================================================================
      Skill skill_Baldum0 = new Skill();
      skill_Baldum0.setImg_skill("..\\Heroes\\Baldum\\skill-0.png");
      skill_Baldum0.setName_skill("Hulking");
      skill_Baldum0.setDetail_skill(
        "Baldum จะได้รับเกราะเพิ่มขึ้น 10/13/16/19/22% เมื่อ LV 1, 4, 7, 10 และ 13 ตามลำดับ"
      );
      skillRepository.save(skill_Baldum0);

      Skill skill_Baldum1 = new Skill();
      skill_Baldum1.setImg_skill("..\\Heroes\\Baldum\\skill-1.png");
      skill_Baldum1.setName_skill("Wild Charge");
      skill_Baldum1.setDetail_skill(
        "Baldum พุ่งไปด้านหน้า สร้างความเสียหายกายภาพพร้อมกับงัดฮีโร่ศัตรูคนแรกที่โดนให้ลอยข้ามไปด้านหลังของเขา สร้างความเสียหายกายภาพเพิ่มอีก 8% ของ HP สูงสุด และลดความเร็วเคลื่อนที่ลงเป็นเวลา 1 วิ"
      );
      skillRepository.save(skill_Baldum1);

      Skill skill_Baldum2 = new Skill();
      skill_Baldum2.setImg_skill("..\\Heroes\\Baldum\\skill-2.png");
      skill_Baldum2.setName_skill("Wild Stomp");
      skill_Baldum2.setDetail_skill(
        "Baldum ทำให้พื้นดินเกิดแรงสั่นสะเทือน สร้างความเสียหายกายภาพแก่ศัตรูรอบตัว พร้อมกับลดความเร็วลง และศัตรูที่อยู่ในระยะจะสร้างความเสียหายกายภาพใส่ Baldum เบาลงเป็นเวลา 1 วิ หากการโจมตีของสกิลนี้โดนฮีโร่ศัตรูจะลดคูลดาวน์สกิลนี้ลงครั้งละ 0.3 วิ"
      );
      skillRepository.save(skill_Baldum2);

      Skill skill_Baldum3 = new Skill();
      skill_Baldum3.setImg_skill("..\\Heroes\\Baldum\\skill-3.png");
      skill_Baldum3.setName_skill("Wild Prison");
      skill_Baldum3.setDetail_skill(
        "ปักเสาลงพื้นสร้างคุกดินขึ้นมายังจุดที่กำหนด หลังจากนั้น 0.5 วิ คุกจะพังลงมา ฝังศัตรูทั้งหมดลงสู่ใต้ดิน เป็นเวลา 3 วิ เมื่อสิ้นสุดการกักขัง เป้าหมายสกิลทั้งหมดจะได้รับความเสียหายกายภาพพร้อมกับลดความเร็ว 50% เป็นเวลา 2 วิ"
      );
      skillRepository.save(skill_Baldum3);

      Character c12 = new Character();
      c12.setName("Baldum");
      c12.setImg_small("..\\Heroes\\Baldum\\Baldum-s.png");
      c12.setImg_big("..\\Heroes\\Baldum\\Baldum.png");
      c12.addTypeHero(typeHeroesRepository.findById(5));
      c12.addSkill(skillRepository.findById(46));
      c12.addSkill(skillRepository.findById(47));
      c12.addSkill(skillRepository.findById(48));
      c12.addSkill(skillRepository.findById(49));
      characterRepository.save(c12);

      //========================== Runes Information ================================
      //=============================================================================
      Stream.of( "โจมตี","พลังชีวิต","ป้องกัน","พิเศษ","ดูดเลือด",
          "ความเร็ว","คริติคอล","เจาะ").forEach(typeR -> {
            TypeRune type = new TypeRune();
            type.setTypeRune(typeR);
            typeRuneRepository.save(type);
          }
        );
      //----------------------- Passion ------------------------------------
      PropertyRune pr1 = new PropertyRune();
      pr1.setEffects(effectRepository.findById(1));
      pr1.setPropertyRune(0.9);  //พลังโจมตี 0.9 (id=1)
      propertyRuneRepository.save(pr1);

      Rune r1 = new Rune();
      r1.setLevel(1);
      r1.setName("Passion");
      r1.setImg_rune("..\\Rune\\Level1\\1_Passion.png");
      r1.addType(typeRuneRepository.findById(1));
      r1.addProperty(propertyRuneRepository.findById(1));
      runeRepository.save(r1);

      //----------------------- Shock ------------------------------------
      PropertyRune pr2 = new PropertyRune();
      pr2.setEffects(effectRepository.findById(2));
      pr2.setPropertyRune(0.5);  //อัตราคริติคอล 0.5 (id=2)
      propertyRuneRepository.save(pr2);

      Rune r2 = new Rune();
      r2.setLevel(1);
      r2.setName("Shock");
      r2.setImg_rune("..\\Rune\\Level1\\2_Shock.png");
      r2.addType(typeRuneRepository.findById(7));
      r2.addProperty(propertyRuneRepository.findById(2));
      runeRepository.save(r2);

      //----------------------- Curse ------------------------------------
      PropertyRune pr3 = new PropertyRune();
      pr3.setEffects(effectRepository.findById(3));
      pr3.setPropertyRune(1.5);  //พลังเวท +1.5 (id=3)
      propertyRuneRepository.save(pr3);

      Rune r3 = new Rune();
      r3.setLevel(1);
      r3.setName("Curse");
      r3.setImg_rune("..\\Rune\\Level1\\3_Curse.png");
      r3.addType(typeRuneRepository.findById(1));
      r3.addProperty(propertyRuneRepository.findById(3));
      runeRepository.save(r3);

      //----------------------- Gale ------------------------------------
      PropertyRune pr4 = new PropertyRune();
      pr4.setEffects(effectRepository.findById(4));
      pr4.setPropertyRune(0.6);  //ความเร็วโจมตี +0.6% (id=4)
      propertyRuneRepository.save(pr4);

      Rune r4 = new Rune();
      r4.setLevel(1);
      r4.setName("Gale");
      r4.setImg_rune("..\\Rune\\Level1\\4_Gale.png");
      r4.addType(typeRuneRepository.findById(6));
      r4.addProperty(propertyRuneRepository.findById(4));
      runeRepository.save(r4);
      
      //----------------------- Life ------------------------------------
      PropertyRune pr5 = new PropertyRune();
      pr5.setEffects(effectRepository.findById(5));
      pr5.setPropertyRune(21);  //พลังชีวิต +21 (id=5)
      propertyRuneRepository.save(pr5);

      Rune r5 = new Rune();
      r5.setLevel(1);
      r5.setName("Life");
      r5.setImg_rune("..\\Rune\\Level1\\5_Life.png");
      r5.addType(typeRuneRepository.findById(2));
      r5.addProperty(propertyRuneRepository.findById(6));
      runeRepository.save(r5);
      
      //----------------------- Rebirth ------------------------------------
      PropertyRune pr6 = new PropertyRune();
      pr6.setEffects(effectRepository.findById(6));
      pr6.setPropertyRune(4.2);  //ฟื้นฟูพลังชีวิต/5วิ +4.2 (id=6)
      propertyRuneRepository.save(pr6);

      Rune r6 = new Rune();
      r6.setLevel(1);
      r6.setName("Rebirth");
      r6.setImg_rune("..\\Rune\\Level1\\6_Rebirth.png");
      r6.addType(typeRuneRepository.findById(1));
      r6.addProperty(propertyRuneRepository.findById(6));
      runeRepository.save(r6);
      
      //----------------------- Lifesteal ------------------------------------
      PropertyRune pr7 = new PropertyRune();
      pr7.setEffects(effectRepository.findById(7));
      pr7.setPropertyRune(0.4);  //ดูดเลือด +0.4% (id=7)
      propertyRuneRepository.save(pr7);

      Rune r7 = new Rune();
      r7.setLevel(1);
      r7.setName("Lifesteal");
      r7.setImg_rune("..\\Rune\\Level1\\7_Lifesteal.png");
      r7.addType(typeRuneRepository.findById(5));
      r7.addProperty(propertyRuneRepository.findById(7));
      runeRepository.save(r7);

      //----------------------- Absorption ------------------------------------
      PropertyRune pr8 = new PropertyRune();
      pr8.setEffects(effectRepository.findById(8));
      pr8.setPropertyRune(0.4);  //เวทแวมไพร์ +0.4% (id=8)
      propertyRuneRepository.save(pr8);

      Rune r8 = new Rune();
      r8.setLevel(1);
      r8.setName("Absorption");
      r8.setImg_rune("..\\Rune\\Level1\\8_Absorption.png");
      r8.addType(typeRuneRepository.findById(5));
      r8.addProperty(propertyRuneRepository.findById(8));
      runeRepository.save(r8);
      
      //----------------------- Guard ------------------------------------
      PropertyRune pr9 = new PropertyRune();
      pr9.setEffects(effectRepository.findById(9));
      pr9.setPropertyRune(2.5);  //เกราะ +2.5 (id=9)
      propertyRuneRepository.save(pr9);

      Rune r9 = new Rune();
      r9.setLevel(1);
      r9.setName("Guard");
      r9.setImg_rune("..\\Rune\\Level1\\9_Guard.png");
      r9.addType(typeRuneRepository.findById(3));
      r9.addProperty(propertyRuneRepository.findById(9));
      runeRepository.save(r9);
      
      //----------------------- Strength ------------------------------------
      PropertyRune pr10 = new PropertyRune();
      pr10.setEffects(effectRepository.findById(10));
      pr10.setPropertyRune(2.5);  //ต้านทานเวท +2.5 (id=10)
      propertyRuneRepository.save(pr10);

      Rune r10 = new Rune();
      r10.setLevel(1);
      r10.setName("Strength");
      r10.setImg_rune("..\\Rune\\Level1\\10_Strength.png");
      r10.addType(typeRuneRepository.findById(3));
      r10.addProperty(propertyRuneRepository.findById(10));
      runeRepository.save(r10);
      
      //----------------------- Stab ------------------------------------
      PropertyRune pr11 = new PropertyRune();
      pr11.setEffects(effectRepository.findById(11));
      pr11.setPropertyRune(2.2);  //เจาะเกราะ +2.2 (id=11)
      propertyRuneRepository.save(pr11);

      Rune r11 = new Rune();
      r11.setLevel(1);
      r11.setName("Stab");
      r11.setImg_rune("..\\Rune\\Level1\\11_Stab.png");
      r11.addType(typeRuneRepository.findById(8));
      r11.addProperty(propertyRuneRepository.findById(11));
      runeRepository.save(r11);

      //----------------------- Disruption ------------------------------------
      PropertyRune pr12 = new PropertyRune();
      pr12.setEffects(effectRepository.findById(12));
      pr12.setPropertyRune(2.2);  //เจาะเกราะเวท +2.2 (id=12)
      propertyRuneRepository.save(pr12);

      Rune r12 = new Rune();
      r12.setLevel(1);
      r12.setName("Disruption");
      r12.setImg_rune("..\\Rune\\Level1\\12_Disruption.png");
      r12.addType(typeRuneRepository.findById(8));
      r12.addProperty(propertyRuneRepository.findById(12));
      runeRepository.save(r12);

      //----------------------- Agility ------------------------------------
      PropertyRune pr13 = new PropertyRune();
      pr13.setEffects(effectRepository.findById(4));
      pr13.setPropertyRune(1.2);  //ความเร็วโจมตี +1.2% (id=13)
      propertyRuneRepository.save(pr13);

      Rune r2_1 = new Rune();
      r2_1.setLevel(2);
      r2_1.setName("Agility");
      r2_1.setImg_rune("..\\Rune\\Level2\\2_1_Agility.png");
      r2_1.addType(typeRuneRepository.findById(6));
      r2_1.addProperty(propertyRuneRepository.findById(13));
      runeRepository.save(r2_1);

      //----------------------- Brute Force ------------------------------------
      PropertyRune pr14 = new PropertyRune();
      pr14.setEffects(effectRepository.findById(1));
      pr14.setPropertyRune(1.5);  //พลังโจมตี +1.5 (id=14)
      propertyRuneRepository.save(pr14);

      PropertyRune pr15 = new PropertyRune();
      pr15.setEffects(effectRepository.findById(5));
      pr15.setPropertyRune(13.5);  //พลังชีวิต +13.5 (id=15)
      propertyRuneRepository.save(pr15);

      Rune r2_2 = new Rune();
      r2_2.setLevel(2);
      r2_2.setName("Brute Force");
      r2_2.setImg_rune("..\\Rune\\Level2\\2_2_Brute-Force.png");
      r2_2.addType(typeRuneRepository.findById(1));
      r2_2.addType(typeRuneRepository.findById(2));
      r2_2.addProperty(propertyRuneRepository.findById(14));
      r2_2.addProperty(propertyRuneRepository.findById(15));
      runeRepository.save(r2_2);

      //----------------------- Master ------------------------------------
      PropertyRune pr16 = new PropertyRune();
      pr16.setEffects(effectRepository.findById(4));
      pr16.setPropertyRune(0.4);  //ความเร็วโจมตี +0.4% (id=16)
      propertyRuneRepository.save(pr16);

      Rune r2_3 = new Rune();
      r2_3.setLevel(2);
      r2_3.setName("Master");
      r2_3.setImg_rune("..\\Rune\\Level2\\2_3_Master.png");
      r2_3.addType(typeRuneRepository.findById(1));
      r2_3.addType(typeRuneRepository.findById(6));
      r2_3.addProperty(propertyRuneRepository.findById(14));
      r2_3.addProperty(propertyRuneRepository.findById(16));
      runeRepository.save(r2_3);

      //----------------------- Cyclone ------------------------------------
      PropertyRune pr17 = new PropertyRune();
      pr17.setEffects(effectRepository.findById(4));
      pr17.setPropertyRune(0.6);  //ความเร็วโจมตี +0.6% (id=17)
      propertyRuneRepository.save(pr17);

      PropertyRune pr18 = new PropertyRune();
      pr18.setEffects(effectRepository.findById(2));
      pr18.setPropertyRune(0.3);  //อัตราคริติคอล +0.3% (id=18)
      propertyRuneRepository.save(pr18);

      PropertyRune pr19 = new PropertyRune();
      pr19.setEffects(effectRepository.findById(13));
      pr19.setPropertyRune(1.1);  //ความเสียหายคริติคอล +1.1% (id=19)
      propertyRuneRepository.save(pr19);

      Rune r2_4 = new Rune();
      r2_4.setLevel(2);
      r2_4.setName("Cyclone");
      r2_4.setImg_rune("..\\Rune\\Level2\\2_4_Cyclone.png");
      r2_4.addType(typeRuneRepository.findById(6));
      r2_4.addType(typeRuneRepository.findById(7));
      r2_4.addProperty(propertyRuneRepository.findById(17));
      r2_4.addProperty(propertyRuneRepository.findById(18));
      r2_4.addProperty(propertyRuneRepository.findById(19));
      runeRepository.save(r2_4);

      //----------------------- Magma ------------------------------------
      PropertyRune pr20 = new PropertyRune();
      pr20.setEffects(effectRepository.findById(3));
      pr20.setPropertyRune(2.5);  //พลังเวท +2.5 (id=20)
      propertyRuneRepository.save(pr20);

      PropertyRune pr21 = new PropertyRune();
      pr21.setEffects(effectRepository.findById(2));
      pr21.setPropertyRune(0.3);  //อัตราคริติคอล +0.3% (id=21)
      propertyRuneRepository.save(pr21);

      Rune r2_5 = new Rune();
      r2_5.setLevel(2);
      r2_5.setName("Magma");
      r2_5.setImg_rune("..\\Rune\\Level2\\2_5_Magma.png");
      r2_5.addType(typeRuneRepository.findById(1));
      r2_5.addType(typeRuneRepository.findById(7));
      r2_5.addProperty(propertyRuneRepository.findById(20));
      r2_5.addProperty(propertyRuneRepository.findById(21));
      runeRepository.save(r2_5);

      //----------------------- Pestilence ------------------------------------
      PropertyRune pr22 = new PropertyRune();
      pr22.setEffects(effectRepository.findById(12));
      pr22.setPropertyRune(1.4);  //เจาะเกราะเวท +1.4 (id=22)
      propertyRuneRepository.save(pr22);

      Rune r2_6 = new Rune();
      r2_6.setLevel(2);
      r2_6.setName("Pestilence");
      r2_6.setImg_rune("..\\Rune\\Level2\\2_6_Pestilence.png");
      r2_6.addType(typeRuneRepository.findById(1));
      r2_6.addType(typeRuneRepository.findById(8));
      r2_6.addProperty(propertyRuneRepository.findById(20));
      r2_6.addProperty(propertyRuneRepository.findById(22));
      runeRepository.save(r2_6);

      //----------------------- Atrocity ------------------------------------
      PropertyRune pr23 = new PropertyRune();
      pr23.setEffects(effectRepository.findById(2));
      pr23.setPropertyRune(1);  //อัตราคริติคอล +1% (id=23)
      propertyRuneRepository.save(pr23);

      Rune r2_7 = new Rune();
      r2_7.setLevel(2);
      r2_7.setName("Atrocity");
      r2_7.setImg_rune("..\\Rune\\Level2\\2_7_Atrocity.png");
      r2_7.addType(typeRuneRepository.findById(7));
      r2_7.addProperty(propertyRuneRepository.findById(23));
      runeRepository.save(r2_7);

      //----------------------- Mob ------------------------------------
      PropertyRune pr24 = new PropertyRune();
      pr24.setEffects(effectRepository.findById(2));
      pr24.setPropertyRune(0.5);  //อัตราคริติคอล +0.5% (id=24)
      propertyRuneRepository.save(pr24);

      PropertyRune pr25 = new PropertyRune();
      pr25.setEffects(effectRepository.findById(13));
      pr25.setPropertyRune(2);  //ความเสียหายคริติคอล +2% (id=25)
      propertyRuneRepository.save(pr25);

      Rune r2_8 = new Rune();
      r2_8.setLevel(2);
      r2_8.setName("Mob");
      r2_8.setImg_rune("..\\Rune\\Level2\\2_8_Mob.png");
      r2_8.addType(typeRuneRepository.findById(7));
      r2_8.addProperty(propertyRuneRepository.findById(24));
      r2_8.addProperty(propertyRuneRepository.findById(25));
      runeRepository.save(r2_8);

      //----------------------- Mutation ------------------------------------
      PropertyRune pr26 = new PropertyRune();
      pr26.setEffects(effectRepository.findById(5));
      pr26.setPropertyRune(45);  //พลังชีวิต +45 (id=26)
      propertyRuneRepository.save(pr26);

      Rune r2_9 = new Rune();
      r2_9.setLevel(2);
      r2_9.setName("Mutation");
      r2_9.setImg_rune("..\\Rune\\Level2\\2_9_Mulation.png");
      r2_9.addType(typeRuneRepository.findById(2));
      r2_9.addProperty(propertyRuneRepository.findById(26));
      runeRepository.save(r2_9);

      //----------------------- Guerrilla ------------------------------------
      PropertyRune pr27 = new PropertyRune();
      pr27.setEffects(effectRepository.findById(5));
      pr27.setPropertyRune(13.5);  //พลังชีวิต +13.5 (id=27)
      propertyRuneRepository.save(pr27);

      PropertyRune pr28 = new PropertyRune();
      pr28.setEffects(effectRepository.findById(4));
      pr28.setPropertyRune(0.7);  //ความเร็วเคลื่อนที่ +0.7% (id=28)
      propertyRuneRepository.save(pr28);

      Rune r2_10 = new Rune();
      r2_10.setLevel(2);
      r2_10.setName("Guerrilla");
      r2_10.setImg_rune("..\\Rune\\Level2\\2_10_Guerrilla.png");
      r2_10.addType(typeRuneRepository.findById(2));
      r2_10.addType(typeRuneRepository.findById(4));
      r2_10.addProperty(propertyRuneRepository.findById(27));
      r2_10.addProperty(propertyRuneRepository.findById(28));
      runeRepository.save(r2_10);

      //----------------------- Vitality ------------------------------------
      PropertyRune pr29 = new PropertyRune();
      pr29.setEffects(effectRepository.findById(6));
      pr29.setPropertyRune(9);  //ฟื้นฟูพลังชีวิต 5 วิ +9 (id=29)
      propertyRuneRepository.save(pr29);

      Rune r2_11 = new Rune();
      r2_11.setLevel(2);
      r2_11.setName("Vitality");
      r2_11.setImg_rune("..\\Rune\\Level2\\2_11_Vitallity.png");
      r2_11.addType(typeRuneRepository.findById(2));
      r2_11.addProperty(propertyRuneRepository.findById(29));
      runeRepository.save(r2_11);

      //----------------------- Revelation ------------------------------------
      PropertyRune pr30 = new PropertyRune();
      pr30.setEffects(effectRepository.findById(3));
      pr30.setPropertyRune(1.4);  //พลังเวท +1.4 (id=30)
      propertyRuneRepository.save(pr30);

      PropertyRune pr31 = new PropertyRune();
      pr31.setEffects(effectRepository.findById(8));
      pr31.setPropertyRune(0.8);  //เวทแวมไพร์ +0.8% (id=31)
      propertyRuneRepository.save(pr31);

      PropertyRune pr32 = new PropertyRune();
      pr32.setEffects(effectRepository.findById(10));
      pr32.setPropertyRune(1.6);  //ต้านทานเวท +1.6 (id=32)
      propertyRuneRepository.save(pr32);

      Rune r2_12 = new Rune();
      r2_12.setLevel(2);
      r2_12.setName("Revelation");
      r2_12.setImg_rune("..\\Rune\\Level2\\2_12_Revelation.png");
      r2_12.addType(typeRuneRepository.findById(1));
      r2_12.addType(typeRuneRepository.findById(3));
      r2_12.addType(typeRuneRepository.findById(5));
      r2_12.addProperty(propertyRuneRepository.findById(30));
      r2_12.addProperty(propertyRuneRepository.findById(31));
      r2_12.addProperty(propertyRuneRepository.findById(32));
      runeRepository.save(r2_12);

      //----------------------- Greed ------------------------------------
     /* Rune r2_13 = new Rune();
      r2_13.setLevel(2);
      r2_13.setName("Greed");
      r2_13.setImg_rune("..\\Rune\\Level2\\2_13_Greed.png");
      r2_13.addType(typeRuneRepository.findById(5));
      r2_13.addType(typeRuneRepository.findById(6));
      r2_13.setEffect("ความเร็วโจมตี +0.4% / ดูดเลือด +0.8%");
      runeRepository.save(r2_13);

      //----------------------- Final Battle ------------------------------------
      Rune r2_14 = new Rune();
      r2_14.setLevel(2);
      r2_14.setName("Final Battle");
      r2_14.setImg_rune("..\\Rune\\Level2\\2_14_Final-Battle.png");
      r2_14.addType(typeRuneRepository.findById(1));
      r2_14.addType(typeRuneRepository.findById(2));
      r2_14.setEffect("พลังโจมตี +0.6 / พลังชีวิต +36");
      runeRepository.save(r2_14);

      //----------------------- Reinforce ------------------------------------
      Rune r2_15 = new Rune();
      r2_15.setLevel(2);
      r2_15.setName("Reinforce");
      r2_15.setImg_rune("..\\Rune\\Level2\\2_15_Reinforce.png");
      r2_15.addType(typeRuneRepository.findById(2));
      r2_15.addType(typeRuneRepository.findById(3));
      r2_15.setEffect("พลังชีวิต +36 / เกราะ +1.6");
      runeRepository.save(r2_15);

      //----------------------- Fury ------------------------------------
      Rune r2_16 = new Rune();
      r2_16.setLevel(2);
      r2_16.setName("Fury");
      r2_16.setImg_rune("..\\Rune\\Level2\\2_16_Fury.png");
      r2_16.addType(typeRuneRepository.findById(7));
      r2_16.setEffect("ความเร็วโจมตี +0.4% / อัตราคริติคอล +0.3% / ความเร็วเคลื่อนที่ +0.5%");
      runeRepository.save(r2_16);

      //----------------------- Indomitable ------------------------------------
      Rune r2_17 = new Rune();
      r2_17.setLevel(2);
      r2_17.setName("Indomitable");
      r2_17.setImg_rune("..\\Rune\\Level2\\2_17_Indomitable.png");
      r2_17.addType(typeRuneRepository.findById(3));
      r2_17.setEffect("เกราะ +5.4");
      runeRepository.save(r2_17);

      //----------------------- Loyalty ------------------------------------
      Rune r2_18 = new Rune();
      r2_18.setLevel(2);
      r2_18.setName("Loyalty");
      r2_18.setImg_rune("..\\Rune\\Level2\\2_18_Loyalty.png");
      r2_18.addType(typeRuneRepository.findById(3));
      r2_18.setEffect("ต้านทานเวท +5.4");
      runeRepository.save(r2_18);

      //----------------------- Assault ------------------------------------
      Rune r2_19 = new Rune();
      r2_19.setLevel(2);
      r2_19.setName("Assault");
      r2_19.setImg_rune("..\\Rune\\Level2\\2_19_Assault.png");
      r2_19.addType(typeRuneRepository.findById(4));
      r2_19.addType(typeRuneRepository.findById(6));
      r2_19.setEffect("ความเร็วโจมตี +0.4% / ลดคูลดาวน์ +0.5%");
      runeRepository.save(r2_19);

      //----------------------- Sanctuary ------------------------------------
      Rune r2_20 = new Rune();
      r2_20.setLevel(2);
      r2_20.setName("Sanctuary");
      r2_20.setImg_rune("..\\Rune\\Level2\\2_20_Sanctuary.png");
      r2_20.addType(typeRuneRepository.findById(2));
      r2_20.addType(typeRuneRepository.findById(3));
      r2_20.setEffect("ฟื้นฟูพลังชีวิต/5 วิ +4.5 / เกราะ +3.2");
      runeRepository.save(r2_20);

      //----------------------- Doctrine ------------------------------------
      Rune r2_21 = new Rune();
      r2_21.setLevel(2);
      r2_21.setName("Doctrine");
      r2_21.setImg_rune("..\\Rune\\Level2\\2_21_Doctrine.png");
      r2_21.addType(typeRuneRepository.findById(3));
      r2_21.addType(typeRuneRepository.findById(5));
      r2_21.setEffect("เวทแวมไพร์ +0.5% / ต้านทานเวท +3.2");
      runeRepository.save(r2_21);

      //----------------------- Corrosion ------------------------------------
      Rune r2_22 = new Rune();
      r2_22.setLevel(2);
      r2_22.setName("Corrosion");
      r2_22.setImg_rune("..\\Rune\\Level2\\2_22_Corrosion.png");
      r2_22.addType(typeRuneRepository.findById(1));
      r2_22.addType(typeRuneRepository.findById(8));
      r2_22.setEffect("พลังเวท +0.9 / เจาะเกราะเวท +3.8");
      runeRepository.save(r2_22);

      //----------------------- Potential ------------------------------------
      Rune r2_23 = new Rune();
      r2_23.setLevel(2);;
      r2_23.setName("Potential");
      r2_23.setImg_rune("..\\Rune\\Level2\\2_23_Potential.png");
      r2_23.addType(typeRuneRepository.findById(2));
      r2_23.addType(typeRuneRepository.findById(4));
      r2_23.setEffect("พลังชีวิต +15.7 / ฟื้นฟูพลังชีวิต/5 วิ +3.1 / ลดคูลดาวน์ +0.3%");
      runeRepository.save(r2_23);

      //----------------------- Savage ------------------------------------
      Rune r2_24 = new Rune();
      r2_24.setLevel(2);
      r2_24.setName("Savage");
      r2_24.setImg_rune("..\\Rune\\Level2\\2_24_Savage.png");
      r2_24.addType(typeRuneRepository.findById(2));
      r2_24.addType(typeRuneRepository.findById(8));
      r2_24.setEffect("พลังชีวิต +13.5 / เจาะเกราะ +3.8");
      runeRepository.save(r2_24);*/

      //========================== Enchantment Information ==========================
      //=============================================================================
      Stream.of("Afata", "Human", "Lokheim", "Veda").forEach( typeEns -> {
            TypeEn type = new TypeEn();
            type.setTypeEn(typeEns);
            typeEnRepository.save(type);
      });
      //----------------------- River Treader -----------------------------------
      Enchantment e1 = new Enchantment();
      e1.setName("River Treader");
      e1.setImage("..\\Enchantment\\Afata\\ขั้น 1\\AFATA-1.png");
      e1.setDetail(
        "เมื่ออยู่บริเวณแม่น้ำจะได้รับความเร็วเคลื่อนที่ 10 หน่วย พร้อมกับโบนัสฟื้นฟู 20 HP และ 10 MP ทุก 5 วิ"
      );
      e1.setTypeEn(typeEnRepository.findById(1));
      e1.setLevelEn(1);
      enchantmentRepository.save(e1);
      //----------------------- Backstabbing -----------------------------------
      Enchantment e2 = new Enchantment();
      e2.setName("Backstabbing");
      e2.setImage("..\\Enchantment\\Afata\\ขั้น 1\\AFATA-2.png");
      e2.setDetail(
        "หลังจากเข้าพุ่มไม้จะทำให้การโจมตีปกติ ครั้งต่อไปสร้างโบนัสความเสียหายจริง 4% ของ HP ที่เหลืออยู่ โดยเอฟเฟกต์จะมีผล 4 วิ หลังออกจากพุ่มไม้ (คูลดาวน์ 20 วิ)"
      );
      e2.setTypeEn(typeEnRepository.findById(1));
      e2.setLevelEn(1);
      enchantmentRepository.save(e2);
      //----------------------- Tower Blessing -----------------------------------
      Enchantment e3 = new Enchantment();
      e3.setName("Tower Blessing");
      e3.setImage("..\\Enchantment\\Afata\\ขั้น 1\\AFATA-3.png");
      e3.setDetail(
        "เมื่ออยู่ในระยะป้อม จะได้รับการต้านทานสถานะเพิ่มขึ้น 15% พร้อมกับลดความเสียหายที่ได้รับลง 10%"
      );
      e3.setTypeEn(typeEnRepository.findById(1));
      e3.setLevelEn(1);
      enchantmentRepository.save(e3);
      //----------------------- Regrowth -----------------------------------
      Enchantment e4 = new Enchantment();
      e4.setName("Regrowth");
      e4.setImage("..\\Enchantment\\Afata\\ขั้น 2\\AFATA-4.png");
      e4.setDetail(
        "เอฟเฟกต์การฟื้นฟู และโล่เพิ่มขึ้น 10% หาก HP เป้าหมายน้อยกว่า 50% จะทำให้เอฟเฟกต์เพิ่มขึ้น 10%"
      );
      e4.setTypeEn(typeEnRepository.findById(1));
      e4.setLevelEn(2);
      enchantmentRepository.save(e4);
      //----------------------- Nature’s Gift -----------------------------------
      Enchantment e5 = new Enchantment();
      e5.setName("Nature’s Gift");
      e5.setImage("..\\Enchantment\\Afata\\ขั้น 2\\AFATA-5.png");
      e5.setDetail(
        "แต่ละครีปและมอนสเตอร์ป่าที่ตายบริเวณใกล้ๆ จะทำให้ได้รับบัฟ (จำนวนบัฟ: ครีป 1 ครั้ง, มอนสเตอร์ป่า 2 ครั้ง, Epic มอนสเตอร์ 3 ครั้ง) โดยบัฟแต่ละครั้งจะเพิ่ม HP ขึ้น 8 หน่วยจนจบเกม (สูงสุด 100 ครั้ง)"
      );
      e5.setTypeEn(typeEnRepository.findById(1));
      e5.setLevelEn(2);
      enchantmentRepository.save(e5);
      //----------------------- Nature’s Rage -----------------------------------
      Enchantment e6 = new Enchantment();
      e6.setName("Nature’s Rage");
      e6.setImage("..\\Enchantment\\Afata\\ขั้น 3\\Natures-Rage.png");
      e6.setDetail(
        "เมื่อใช้สกิลควบคุม (ยั่วยุ, ลอยขึ้น, ผลัก, สตั๊น, แช่แข็ง ฯลฯ) โดนฮีโร่ จะทำให้ได้รับเอฟเฟกต์เผาไหม้ สร้างความเสียหายเวท 1% HP ทุก 0.5 วิ รวมถึงลดเกราะเวทศัตรูที่โดนเผาลง 30 (LV อัพ+3) คูลดาวน์ 25 วิ"
      );
      e6.setTypeEn(typeEnRepository.findById(1));
      e6.setLevelEn(3);
      enchantmentRepository.save(e6);
      //----------------------- Explosive Shield -----------------------------------
      Enchantment e7 = new Enchantment();
      e7.setName("Explosive Shield");
      e7.setImage("..\\Enchantment\\Afata\\ขั้น 3\\Explosive-Shield.png");
      e7.setDetail(
        "สะสมบัฟเมื่อโนโจมตี หากสะสมครบ 20 ครั้ง จะลบล้างสถานะควบคุมทั้งหมดและระเบิดพลังสร้างความเสียหายเวท 10%  HP สูงสุด พร้อมกับสตั๊น 0.75 วิ รวมถึงได้รับเอฟเฟกต์ฟื้นฟูเพิ่มขึ้น 30% เป็นเวลา 3 วิ"
      );
      e7.setTypeEn(typeEnRepository.findById(1));
      e7.setLevelEn(3);
      enchantmentRepository.save(e7);
      //----------------------- Forest Wanderer -----------------------------------
      Enchantment e8 = new Enchantment();
      e8.setName("Forest Wanderer");
      e8.setImage("..\\Enchantment\\Afata\\ขั้น 3\\Forest-Wanderer.png");
      e8.setDetail(
        "เมื่อไม่ได้ต่อสู้ จะได้รับโบนัสฟื้นฟูพลังชีวิต 20 และมานา 10 หน่วย ทุก 5 วิ การโจมตีปกติครั้งต่อไปจะลดความเร็ว 30% เป็นเวลา 1 วิ และลดพลังโจมตีของศัตรูลง 30% เป็นเวลา 2 วิ"
      );
      e8.setTypeEn(typeEnRepository.findById(1));
      e8.setLevelEn(3);
      enchantmentRepository.save(e8);
      //----------------------- Mark of Frost -----------------------------------
      Enchantment e9 = new Enchantment();
      e9.setName("Forest Wanderer");
      e9.setImage("..\\Enchantment\\Human\\ขั้น 1\\Human-1.png");
      e9.setDetail(
        "หลังจากเริ่มเกม 3 นาที จะได้รับเอฟเฟกต์ Freeze ซึ่งจะทำให้คุณเป็นอมตะ แต่จะไม่สามารถขยับ หรือโจมตีได้"
      );
      e9.setTypeEn(typeEnRepository.findById(2));
      e9.setLevelEn(1);
      enchantmentRepository.save(e9);
      //----------------------- Reaper’s Blessing -----------------------------------
      Enchantment e10 = new Enchantment();
      e10.setName("Reaper’s Blessing");
      e10.setImage("..\\Enchantment\\Human\\ขั้น 1\\Human-2.png");
      e10.setDetail(
        "หลังจากเริ่มเกม 3 นาที จะได้รับเอฟเฟกต์ Death Sickle ป้องกันความเสียหายที่ทำให้ถึงแก่ชีวิต 1 ครั้ง พร้อมกับวิ่งเร็วขึ้น 20% เป็นเวลา 1 วิ (มีผลเพียงครั้งเดียว)"
      );
      e10.setTypeEn(typeEnRepository.findById(2));
      e10.setLevelEn(1);
      enchantmentRepository.save(e10);
      //----------------------- Arcane Whisper -----------------------------------
      Enchantment e11 = new Enchantment();
      e11.setName("Arcane Whisper");
      e11.setImage("..\\Enchantment\\Human\\ขั้น 1\\Human-3.png");
      e11.setDetail("ลดคูลดาวน์สกิลชาเลนเจอร์ลง 15%");
      e11.setTypeEn(typeEnRepository.findById(2));
      e11.setLevelEn(1);
      enchantmentRepository.save(e11);
      //----------------------- Minion Kill -----------------------------------
      Enchantment e12 = new Enchantment();
      e12.setName("Minion Kill");
      e12.setImage("..\\Enchantment\\Human\\ขั้น 2\\Human-4.png");
      e12.setDetail(
        "การโจมตีปกติหรือใช้สกิลจะสามารถสังหารครีปที่เหลือ HP ต่ำกว่า 200 ได้ทันที"
      );
      e12.setTypeEn(typeEnRepository.findById(2));
      e12.setLevelEn(2);
      enchantmentRepository.save(e12);
      //----------------------- Gunslinger -----------------------------------
      Enchantment e13 = new Enchantment();
      e13.setName("Gunslinger");
      e13.setImage("..\\Enchantment\\Human\\ขั้น 2\\Human-5.png");
      e13.setDetail(
        "ได้รับบัฟ Gunslinger 1 ครั้ง และสามารถสะสมเพิ่มได้โดยการ Kill หรือ Assist ซึ่งบัฟแต่ละครั้งจะเพิ่มพลังโจมตี 10 หน่วย และพลังเวท 15 หน่วย"
      );
      e13.setTypeEn(typeEnRepository.findById(2));
      e13.setLevelEn(2);
      enchantmentRepository.save(e13);
      //----------------------- Endless Cycle -----------------------------------
      Enchantment e14 = new Enchantment();
      e14.setName("Endless Cycle");
      e14.setImage("..\\Enchantment\\Human\\ขั้น 3\\Endless-Cycle.png");
      e14.setDetail(
        "หลังจากตายจะได้รับสกิล Resurrection ซึ่งเมื่อใช้แล้วจะสามารถไปเกิดที่บ่อน้ำพุได้ทันที โดย CD จะขึ้นอยู่กับเวลาในเกม (160-300 วิ)"
      );
      e14.setTypeEn(typeEnRepository.findById(2));
      e14.setLevelEn(3);
      enchantmentRepository.save(e14);
      //----------------------- Visceral Boost -----------------------------------
      Enchantment e15 = new Enchantment();
      e15.setName("Visceral Boost");
      e15.setImage("..\\Enchantment\\Human\\ขั้น 3\\Visceral-Boost.png");
      e15.setDetail(
        "เริ่มเกมด้วย LV2 และได้รับ XP เพิ่มขึ้น 50% จนถึง LV12 โดยระหว่างที่เอฟเฟกต์นี้ทำงาน จะทำให้ XP และโกลด์ที่ได้รับจากครีปและมอนสเตอร์ป่าลดลงครึ่งหนึ่ง"
      );
      e15.setTypeEn(typeEnRepository.findById(2));
      e15.setLevelEn(3);
      enchantmentRepository.save(e15);
      //----------------------- Devourer -----------------------------------
      Enchantment e16 = new Enchantment();
      e16.setName("Devourer");
      e16.setImage("..\\Enchantment\\Lokheim\\ขั้น 1\\LOKHEIM-1.png");
      e16.setDetail(
        "หลังจาก Kill หรือ Assist จะฟื้นฟูพลังชีวิต 9% และมานา 15%"
      );
      e16.setTypeEn(typeEnRepository.findById(3));
      e16.setLevelEn(1);
      enchantmentRepository.save(e16);
      //----------------------- Shadow Blade -----------------------------------
      Enchantment e17 = new Enchantment();
      e17.setName("Shadow Blade");
      e17.setImage("..\\Enchantment\\Lokheim\\ขั้น 1\\LOKHEIM-2.png");
      e17.setDetail(
        "หลังจากใช้สกิลเคลื่อนที่ จะได้รับบัฟ 1 ครั้ง เป็นเวลา 2 วิ (สูงสุด 3 ครั้ง) การโจมตีปกติครั้งต่อไปจะใช้งานบัฟที่สะสมอยู่ทั้งหมด โดยบัฟแต่ละครั้งจะสร้างโบนัสความเสียหายกายภาพ 30 (LV อัพ+5)"
      );
      e17.setTypeEn(typeEnRepository.findById(3));
      e17.setLevelEn(1);
      enchantmentRepository.save(e17);
      //----------------------- Raging Inferno -----------------------------------
      Enchantment e18 = new Enchantment();
      e18.setName("Raging Inferno");
      e18.setImage("..\\Enchantment\\Lokheim\\ขั้น 1\\LOKHEIM-3.png");
      e18.setDetail(
        "การโจมตีปกติหรือสกิลจะสร้างเสียหายเวท 50 (LV อัพ+5) (0.25 AP) (0.35 โบนัส AD) แก่ฮีโร่ศัตรู (คูลดาวน์ 8 วิ)"
      );
      e18.setTypeEn(typeEnRepository.findById(3));
      e18.setLevelEn(1);
      enchantmentRepository.save(e18);
      //----------------------- Deadly Claw -----------------------------------
      Enchantment e19 = new Enchantment();
      e19.setName("Deadly Claw");
      e19.setImage("..\\Enchantment\\Lokheim\\ขั้น 2\\Deadly-Claw.png");
      e19.setDetail("ได้รับโบนัสพลังโจมตี 12~40 และพลังเวท 18~60");
      e19.setTypeEn(typeEnRepository.findById(3));
      e19.setLevelEn(2);
      enchantmentRepository.save(e19);
      //----------------------- Bone Cutter -----------------------------------
      Enchantment e20 = new Enchantment();
      e20.setName("Bone Cutter");
      e20.setImage("..\\Enchantment\\Lokheim\\ขั้น 2\\LOKHEIM-5.png");
      e20.setDetail("ต้านทานสถานะเพิ่มขึ้น 10%");
      e20.setTypeEn(typeEnRepository.findById(3));
      e20.setLevelEn(2);
      enchantmentRepository.save(e20);
      //----------------------- Curse of Death -----------------------------------
      Enchantment e21 = new Enchantment();
      e21.setName("Curse of Death");
      e21.setImage("..\\Enchantment\\Lokheim\\ขั้น 3\\Curse-of-Death.png");
      e21.setDetail(
        "เมื่อใช้สกิล/โจมตีโดนฮีโร่ศัตรูจะได้บัฟ 1 ครั้ง เมื่อครบ 3 ครั้ง จะสร้างความเสียหายเวท 50 (LV อัพ+5) (+0.25 Bonus AD) (+0.2AP) เป็นวงกว้าง จากนั้น 1 วิ จะสร้างความเสียหายเวท 100 (LV อัพ+10) (0.5 Bonus AD) (+0.4AP) ซ้ำ (คูลดาวน์ 15 วิ)"
      );
      e21.setTypeEn(typeEnRepository.findById(3));
      e21.setLevelEn(3);
      enchantmentRepository.save(e21);
      //----------------------- Desperate duel -----------------------------------
      Enchantment e22 = new Enchantment();
      e22.setName("Desperate Duel");
      e22.setImage("..\\Enchantment\\Lokheim\\ขั้น 3\\Desperate-Duel.png");
      e22.setDetail(
        "เมื่อโจมตี/สกิลโดนฮีโร่ศัตรู จะได้บัฟและวิ่งเร็วขึ้น 2 หน่วย (ระยะไกลสะสม 1 ครั้ง/ใกล้ 2 ครั้ง) เป็นเวลา 3 วิ เมื่อครบ 10 ครั้งจะฟื้น 15% HP ที่เสียไป เจาะเกราะ/เจาะเกราะเวท +15% (ระยะไกลเพิ่มแค่ 5%)"
      );
      e22.setTypeEn(typeEnRepository.findById(3));
      e22.setLevelEn(3);
      enchantmentRepository.save(e22);
      //----------------------- Devil’s Awakening -----------------------------------
      Enchantment e23 = new Enchantment();
      e23.setName("Devil’s Awakening");
      e23.setImage("..\\Enchantment\\Lokheim\\ขั้น 3\\Devils-Awakening.png");
      e23.setDetail(
        " เมื่อใช้สกิลอัลติเมต จะลดคูลดาวน์ของสกิลธรรมดาลง 50% และลดอัตราการนับคูลดาวน์ลงอีก 20% รวมถึงลดความเสียหายที่ได้รับลง 10% (ขยายระยะเวลาเพิ่ม 3 วิ หากได้ Kill หรือ Assist) คูลดาวน์ 30 วิ"
      );
      e23.setTypeEn(typeEnRepository.findById(3));
      e23.setLevelEn(3);
      enchantmentRepository.save(e23);
      //----------------------- Axe of Sacrifice -----------------------------------
      Enchantment e24 = new Enchantment();
      e24.setName("Axe of Sacrifice");
      e24.setImage("..\\Enchantment\\Veda\\ขั้น 1\\Veda-1.png");
      e24.setDetail(
        "สร้างความเสียหายเพิ่มขึ้น 3% และได้รับความเสียหายแรงขึ้น 2% (ฮีโร่ระยะไกล 1%)"
      );
      e24.setTypeEn(typeEnRepository.findById(4));
      e24.setLevelEn(1);
      enchantmentRepository.save(e24);
      //----------------------- Mana Refill -----------------------------------
      Enchantment e25 = new Enchantment();
      e25.setName("Mana Refill");
      e25.setImage("..\\Enchantment\\Veda\\ขั้น 1\\Veda-2.png");
      e25.setDetail(
        "เมื่อใช้สกิล/โจมตีปกติโดนฮีโร่ศัตรู จะฟื้นฟูมานา 8% (คลูดาวน์ 5 วิ)"
      );
      e25.setTypeEn(typeEnRepository.findById(4));
      e25.setLevelEn(1);
      enchantmentRepository.save(e25);
      //----------------------- Sacred Bead -----------------------------------
      Enchantment e26 = new Enchantment();
      e26.setName("Sacred Bead");
      e26.setImage("..\\Enchantment\\Veda\\ขั้น 1\\Veda-3.png");
      e26.setDetail(
        "คลูดาวน์สกิลอัลติเมตลดลง 10% (ผลจะลดลงหรือไม่ทำงานหากถึงขีดจำกัดการลดคลูดาวน์สูงสุดแล้ว)"
      );
      e26.setTypeEn(typeEnRepository.findById(4));
      e26.setLevelEn(1);
      enchantmentRepository.save(e26);
      //----------------------- Blessing -----------------------------------
      Enchantment e27 = new Enchantment();
      e27.setName("Blessing");
      e27.setImage("..\\Enchantment\\Veda\\ขั้น 2\\Veda-4.png");
      e27.setDetail("โบนัสอัตราคริติคอลจากไอเทม +12% โบนัสพลังเวทจากไอเทม +8%");
      e27.setTypeEn(typeEnRepository.findById(4));
      e27.setLevelEn(2);
      enchantmentRepository.save(e27);
      //----------------------- Holy Verdict -----------------------------------
      Enchantment e28 = new Enchantment();
      e28.setName("Holy Verdict");
      e28.setImage("..\\Enchantment\\Veda\\ขั้น 2\\Veda-5.png");
      e28.setDetail("ได้รับเจาะเกราะ/เจาะเกราะเวท +18 (LV อัพ+3)");
      e28.setTypeEn(typeEnRepository.findById(4));
      e28.setLevelEn(2);
      enchantmentRepository.save(e28);
      //----------------------- Holy Summoner -----------------------------------
      Enchantment e29 = new Enchantment();
      e29.setName("Holy Summoner");
      e29.setImage("..\\Enchantment\\Veda\\ขั้น 3\\Holy-Summoner.png");
      e29.setDetail(
        "เมื่อโจมตีโดนศัตรูครบ 3 ครั้งต่อเนื่อง จะเรียกแฟรี่ออกมาโจมตีเป็นเวลา 5 วิ โดยแฟรี่จะโจมตีเป้าหมาย เดียวกับที่คุณกำลังโจมตีอยู่ด้วยพลังโจมตี 0.4 AD และอัตราเจาะเกราะ 15% (คูลดาวน์ 10 วิ)"
      );
      e29.setTypeEn(typeEnRepository.findById(4));
      e29.setLevelEn(3);
      enchantmentRepository.save(e29);
      //----------------------- Holy Thunder -----------------------------------
      Enchantment e30 = new Enchantment();
      e30.setName("Holy Thunder");
      e30.setImage("..\\Enchantment\\Veda\\ขั้น 3\\Holy-Thunder.png");
      e30.setDetail(
        "การโจมตีหรือใช้สกิลโดนฮีโร่ศัตรูครั้งแรกจะปล่อยสายฟ้าสร้างความเสียหาย 100 (+10 เมื่อ LVอัพ) (0.4 Bonus AS) (0.3 AP) จากนั้นการโจมตีปกติและสกิลครั้งถัดไปจะลดคูลดาวน์เอฟเฟต์นี้ลง 1 วิ (คูลดาวน์ 15 วิ)"
      );
      e30.setTypeEn(typeEnRepository.findById(4));
      e30.setLevelEn(3);
      enchantmentRepository.save(e30);
      //----------------------- Sacred Protection -----------------------------------
      Enchantment e31 = new Enchantment();
      e31.setName("Sacred Protection");
      e31.setImage("..\\Enchantment\\Veda\\ขั้น 3\\Sacred-Protection.png");
      e31.setDetail(
        "หากได้รับความเสียหายเกิน 30% ของ HP สูงสุด ภายใน 3 วิ จะวิ่งเร็วขึ้น 50% เป็นเวลา 1.5 วิ เกราะ 550 (LV อัพ+60) และเวทแวมไพร์ 15% เป็นเวลา 6 วิ ซึ่งหากได้ Kill/Assist จะได้ขยายเวลาเวทแวมไพร์ขึ้น 3 วิ (คูลดาวน์ 30 วิ)"
      );
      e31.setTypeEn(typeEnRepository.findById(4));
      e31.setLevelEn(3);
      enchantmentRepository.save(e31);
      //=========================== Item Information ================================
      //=============================================================================
      Stream.of("โจมตี", "เวท", "ป้องกัน", "เคลื่อนที่", "ป่า", "สนับสนุน")
        .forEach(
          typeItems -> {
            TypeItem type = new TypeItem();
            type.setTypeItem(typeItems);
            typeItemRepository.save(type);
          }
        );

      //----------------------- Short Sword -----------------------------------
      PropertyItem pi1 = new PropertyItem();
      pi1.setEffects(effectRepository.findById(1));
      pi1.setPropertyItem(20);  //พลังโจมตี 20 (id=1)
      propertyItemRepository.save(pi1);

      Item i1 = new Item();
      i1.setName("Short Sword");
      i1.setImg_item("..\\Item\\โจมตี\\Short-Sword.png");
      i1.setTypeItem(typeItemRepository.findById(1));
      i1.setSpecialEffect("-");
      i1.addProperty(propertyItemRepository.findById(1));
      i1.setPriceItem(250);
      itemRepository.save(i1);
      //----------------------- Dagger -----------------------------------
      PropertyItem pi2 = new PropertyItem();
      pi2.setEffects(effectRepository.findById(4));
      pi2.setPropertyItem(10);  //ความเร็วโจมตี +10% (id=2)
      propertyItemRepository.save(pi2);

      Item i2 = new Item();
      i2.setName("Dagger");
      i2.setImg_item("..\\Item\\โจมตี\\Dagger.png");
      i2.setTypeItem(typeItemRepository.findById(1));
      i2.setSpecialEffect("-");
      i2.addProperty(propertyItemRepository.findById(1));
      i2.setPriceItem(250);
      itemRepository.save(i2);
      //----------------------- Gloves -----------------------------------
      PropertyItem pi3 = new PropertyItem();
      pi3.setEffects(effectRepository.findById(2));
      pi3.setPropertyItem(12);  //อัตราคริติคอล +12% (id=3)
      propertyItemRepository.save(pi3);

      Item i3 = new Item();
      i3.setName("Gloves");
      i3.setImg_item("..\\Item\\โจมตี\\Gloves.png");
      i3.setTypeItem(typeItemRepository.findById(1));
      i3.setSpecialEffect("-");
      i3.addProperty(propertyItemRepository.findById(3));
      i3.setPriceItem(420);
      itemRepository.save(i3);
      //----------------------- Bloodied Club -----------------------------------
      PropertyItem pi4 = new PropertyItem();
      pi4.setEffects(effectRepository.findById(1));
      pi4.setPropertyItem(10);  //พลังโจมตี +10 (id=4)
      propertyItemRepository.save(pi4);

      PropertyItem pi5 = new PropertyItem();
      pi5.setEffects(effectRepository.findById(7));
      pi5.setPropertyItem(8);  //ดูดเลือด +8% (id=5)
      propertyItemRepository.save(pi5);

      Item i4 = new Item();
      i4.setName("Bloodied Club");
      i4.setImg_item("..\\Item\\โจมตี\\Bloodied-Club-1.png");
      i4.setTypeItem(typeItemRepository.findById(1));
      i4.setSpecialEffect("-");
      i4.addProperty(propertyItemRepository.findById(4));
      i4.addProperty(propertyItemRepository.findById(5));
      //i4.setEffectItem("+10 พลังโจมตี +8% ดูดเลือด");
      i4.setPriceItem(410);
      itemRepository.save(i4);
      //----------------------- Chain Hammer -----------------------------------
      PropertyItem pi6 = new PropertyItem();
      pi6.setEffects(effectRepository.findById(1));
      pi6.setPropertyItem(40);  //พลังโจมตี +40 (id=6)
      propertyItemRepository.save(pi6);

      Item i5 = new Item();
      i5.setName("Chain Hammer");
      i5.setImg_item("..\\Item\\โจมตี\\Chain-Hammer.png");
      i5.setTypeItem(typeItemRepository.findById(1));
      i5.setSpecialEffect("-");
      i5.addProperty(propertyItemRepository.findById(5));
      //i5.setEffectItem("+40 พลังโจมตี");
      i5.setPriceItem(450);
      itemRepository.save(i5);
      //----------------------- Cleaving Claymore -----------------------------------
      PropertyItem pi7 = new PropertyItem();
      pi7.setEffects(effectRepository.findById(1));
      pi7.setPropertyItem(80);  //พลังโจมตี +80 (id=7)
      propertyItemRepository.save(pi7);

      Item i6 = new Item();
      i6.setName("Cleaving Claymore");
      i6.setImg_item("..\\Item\\โจมตี\\Cleaving-Claymore.png");
      i6.setTypeItem(typeItemRepository.findById(1));
      i6.setSpecialEffect("-");
      i6.addProperty(propertyItemRepository.findById(7));
      //i6.setEffectItem("+80 พลังโจมตี");
      i6.setPriceItem(910);
      itemRepository.save(i6);
      //----------------------- Arcane Hammer -----------------------------------
      PropertyItem pi8 = new PropertyItem();
      pi8.setEffects(effectRepository.findById(1));
      pi8.setPropertyItem(25);  //พลังโจมตี +25 (id=8)
      propertyItemRepository.save(pi8);

      PropertyItem pi9 = new PropertyItem();
      pi9.setEffects(effectRepository.findById(4));
      pi9.setPropertyItem(15);  //ความเร็วโจมตี +15% (id=9)
      propertyItemRepository.save(pi9);

      Item i7 = new Item();
      i7.setName("Arcane Hammer");
      i7.setImg_item("..\\Item\\โจมตี\\Arcane-Hammer.png");
      i7.setTypeItem(typeItemRepository.findById(1));
      i7.setSpecialEffect("สกิลติดตัว - Speed Up: เมื่อทำการโจมตีปกติ รับความเร็วเคลื่อนที่ +10%");
      i7.addProperty(propertyItemRepository.findById(8));
      i7.addProperty(propertyItemRepository.findById(9));
      //i7.setEffectItem("+25 พลังโจมตี +15% ความเร็วโจมตี");
      i7.setPriceItem(740);
      itemRepository.save(i7);
      //----------------------- Tempest Blades -----------------------------------
      PropertyItem pi10 = new PropertyItem();
      pi10.setEffects(effectRepository.findById(15));
      pi10.setPropertyItem(5);  //ความเร็วเคลื่อนที่ +5% (id=10)
      propertyItemRepository.save(pi10);

      PropertyItem pi11 = new PropertyItem();
      pi11.setEffects(effectRepository.findById(4));
      pi11.setPropertyItem(25);  //ความเร็วโจมตี +25% (id=11)
      propertyItemRepository.save(pi11);

      Item i8 = new Item();
      i8.setName("Tempest Blades");
      i8.setImg_item("..\\Item\\โจมตี\\Tempest-Blades.png");
      i8.setTypeItem(typeItemRepository.findById(1));
      i8.setSpecialEffect("-");
      i8.addProperty(propertyItemRepository.findById(10));
      i8.addProperty(propertyItemRepository.findById(11));
      //i8.setEffectItem("+25% ความเร็วโจมตี +5% ความเร็วเคลื่อนที่");
      i8.setPriceItem(780);
      itemRepository.save(i8);
      //----------------------- Astral Spear -----------------------------------
      PropertyItem pi12 = new PropertyItem();
      pi12.setEffects(effectRepository.findById(1));
      pi12.setPropertyItem(50);  //พลังโจมตี +50 (id=12)
      propertyItemRepository.save(pi12);

      Item i9 = new Item();
      i9.setName("Astral Spear");
      i9.setImg_item("..\\Item\\โจมตี\\Astral-Spear.png");
      i9.setTypeItem(typeItemRepository.findById(1));
      i9.setSpecialEffect("สกิลติดตัว: เจาะเกราะ +60");
      i9.addProperty(propertyItemRepository.findById(12));
      //i9.setEffectItem("+50 พลังโจมตี");
      i9.setPriceItem(830);
      itemRepository.save(i9);
      //----------------------- Shuriken -----------------------------------
      PropertyItem pi13 = new PropertyItem();
      pi13.setEffects(effectRepository.findById(4));
      pi13.setPropertyItem(20);  //ความเร็วโจมตี +20% (id=13)
      propertyItemRepository.save(pi13);

      Item i10 = new Item();
      i10.setName("Shuriken");
      i10.setImg_item("..\\Item\\โจมตี\\Shuriken.png");
      i10.setTypeItem(typeItemRepository.findById(1));
      i10.setSpecialEffect("สกิลติดตัว - Heel: การโจมตีปกติสร้างความเสียหายกายภาพขึ้น 20+LV ฮีโร่x1 (ระยะใกล้) / 40+LV ฮีโร่x2 (ระยะไกล) CD 0.3 วิ");
      i10.addProperty(propertyItemRepository.findById(13));
      //i10.setEffectItem("+20% ความเร็วโจมตี");
      i10.setPriceItem(750);
      itemRepository.save(i10);
      //----------------------- Uriel's Brand -----------------------------------
      PropertyItem pi14 = new PropertyItem();
      pi14.setEffects(effectRepository.findById(1));
      pi14.setPropertyItem(60);  //พลังโจมตี +60 (id=14)
      propertyItemRepository.save(pi14);

      PropertyItem pi15 = new PropertyItem();
      pi15.setEffects(effectRepository.findById(4));
      pi15.setPropertyItem(25);  //ความเร็วโจมตี +25% (id=15)
      propertyItemRepository.save(pi15);

      PropertyItem pi16 = new PropertyItem();
      pi16.setEffects(effectRepository.findById(10));
      pi16.setPropertyItem(180);  //ต้านทานเวท +180 (id=16)
      propertyItemRepository.save(pi16);

      Item i11 = new Item();
      i11.setName("Uriel's Brand");
      i11.setImg_item("..\\Item\\โจมตี\\Uriels-Brand.png");
      i11.setTypeItem(typeItemRepository.findById(1));
      i11.setSpecialEffect("สกิลติดตัว - Speed Up: เมื่อทำการโจมตีปกติจะวิ่งเร็วขึ้น 10%");
      i11.addProperty(propertyItemRepository.findById(14));
      i11.addProperty(propertyItemRepository.findById(15));
      i11.addProperty(propertyItemRepository.findById(16));
      i11.setPriceItem(2020);
      itemRepository.save(i11);
      //----------------------- Curse of Death -----------------------------------
      PropertyItem pi17 = new PropertyItem();
      pi17.setEffects(effectRepository.findById(1));
      pi17.setPropertyItem(100);  //พลังโจมตี +100 (id=17)
      propertyItemRepository.save(pi17);

      PropertyItem pi18 = new PropertyItem();
      pi18.setEffects(effectRepository.findById(14));
      pi18.setPropertyItem(10);  //ลดคูลดาวน์ +10% (id=18)
      propertyItemRepository.save(pi18);

      PropertyItem pi19 = new PropertyItem();
      pi19.setEffects(effectRepository.findById(9));
      pi19.setPropertyItem(150);  //เกราะ +150 (id=19)
      propertyItemRepository.save(pi19);

      Item i12 = new Item();
      i12.setName("Curse of Death");
      i12.setImg_item("..\\Item\\โจมตี\\Curse-of-Death.png");
      i12.setTypeItem(typeItemRepository.findById(1));
      i12.setSpecialEffect("สกิลติดตัว - Soul Prison: ลดการฟื้นฟูของเป้าหมายลง 50% เป็นเวลา 2 วิ (หากความเสียหายมาจากการโจมตีปกติจะเพิ่มเป็น 4 วิแทน)");
      i12.addProperty(propertyItemRepository.findById(17));
      i12.addProperty(propertyItemRepository.findById(18));
      i12.addProperty(propertyItemRepository.findById(19));
      i12.setPriceItem(2000);
      itemRepository.save(i12);
      //----------------------- Death Sickle -----------------------------------
      PropertyItem pi20 = new PropertyItem();
      pi20.setEffects(effectRepository.findById(14));
      pi20.setPropertyItem(5);  //ลดคูลดาวน์ +5% (id=20)
      propertyItemRepository.save(pi20);

      Item i13 = new Item();
      i13.setName("Death Sickle");
      i13.setImg_item("..\\Item\\โจมตี\\Death-Sickle.png");
      i13.setTypeItem(typeItemRepository.findById(1));
      i13.setSpecialEffect("สกิลติดตัว - Divine Intervention: อมตะเมื่อ HP ต่ำ และวิ่งเร็วขึ้น 20% เป็นเวลา 1 วิ CD 90 วิ");
      i13.addProperty(propertyItemRepository.findById(14));
      i13.addProperty(propertyItemRepository.findById(20));
      i13.setPriceItem(2000);
      itemRepository.save(i13);
      //----------------------- Bow of Slaughter -----------------------------------
      PropertyItem pi21 = new PropertyItem();
      pi21.setEffects(effectRepository.findById(2));
      pi21.setPropertyItem(15);  //อัตราคริติคอล +15% (id=21)
      propertyItemRepository.save(pi21);

      PropertyItem pi22 = new PropertyItem();
      pi22.setEffects(effectRepository.findById(7));
      pi22.setPropertyItem(15);  //ดูดเลือด +15% (id=22)
      propertyItemRepository.save(pi22);

      Item i14 = new Item();
      i14.setName("Bow of Slaughter");
      i14.setImg_item("..\\Item\\โจมตี\\Bow-of-Slaughter.png");
      i14.setTypeItem(typeItemRepository.findById(1));
      i14.setSpecialEffect("สกิลพิเศษ - [Bloodthirst]: ดูดเลือดเพิ่มขึ้น 90% เป็นเวลา 3 วิ (ระยะไกลเท่านั้น) CD 60 วิ");
      i14.addProperty(propertyItemRepository.findById(17));
      i14.addProperty(propertyItemRepository.findById(21));
      i14.addProperty(propertyItemRepository.findById(22));
      i14.setPriceItem(2550);
      itemRepository.save(i14);
      //----------------------- Spear of Longinus -----------------------------------
      PropertyItem pi23 = new PropertyItem();
      pi23.setEffects(effectRepository.findById(14));
      pi23.setPropertyItem(15);  //ลดคูลดาวน์ +15% (id=23)
      propertyItemRepository.save(pi23);

      PropertyItem pi24 = new PropertyItem();
      pi24.setEffects(effectRepository.findById(5));
      pi24.setPropertyItem(500);  //พลังชีวิต +500 (id=24)
      propertyItemRepository.save(pi24);

      Item i15 = new Item();
      i15.setName("Spear of Longinus");
      i15.setImg_item("..\\Item\\โจมตี\\Spear-of-Longinus.png");
      i15.setTypeItem(typeItemRepository.findById(1));
      i15.setSpecialEffect("สกิลติดตัว - Armor Breaker: การโจมตีจะลดเกราะศัตรูลง 60 หน่วย (สูงสุด 4 ครั้ง) เป็นเวลา 5 วิ");
      i15.addProperty(propertyItemRepository.findById(7));
      i15.addProperty(propertyItemRepository.findById(23));
      i15.addProperty(propertyItemRepository.findById(24));
      i15.setPriceItem(2030);
      itemRepository.save(i15);
      //----------------------- Fafnir's Talon -----------------------------------
      PropertyItem pi25 = new PropertyItem();
      pi25.setEffects(effectRepository.findById(4));
      pi25.setPropertyItem(30);  //ความเร็วโจมตี +30% (id=25)
      propertyItemRepository.save(pi25);

      PropertyItem pi26 = new PropertyItem();
      pi26.setEffects(effectRepository.findById(7));
      pi26.setPropertyItem(10);  //ดูดเลือด +10% (id=26)
      propertyItemRepository.save(pi26);

      Item i16 = new Item();
      i16.setName("Fafnir's Talon");
      i16.setImg_item("..\\Item\\โจมตี\\Fafnirs-Talon.png");
      i16.setTypeItem(typeItemRepository.findById(1));
      i16.setSpecialEffect("สกิลติดตัว - Dragon's Breath: การโจมตีปกติจะสร้าง ความเสียหายกายภาพ เท่ากับ 8% ของ HP ศัตรู (CD 0.3 วิ)");
      i16.addProperty(propertyItemRepository.findById(14));
      i16.addProperty(propertyItemRepository.findById(25));
      i16.addProperty(propertyItemRepository.findById(26));
      i16.setPriceItem(2040);
      itemRepository.save(i16);
      //----------------------- Claves Sancti -----------------------------------
      Item i17 = new Item();
      i17.setName("Claves Sancti");
      i17.setImg_item("..\\Item\\โจมตี\\Claves-Sancti.png");
      i17.setTypeItem(typeItemRepository.findById(1));
      i17.setSpecialEffect("สกิลติดตัว - Gift of the Swift: ความเร็วเคลื่อนที่เพิ่มขึ้น (3-45) เป็นเวลา 1.5 วิ (มีผลเฉพาะฮีโร่ระยะไกล) สกิลติดตัว: โอกาสคริติคอล +25% สกิลติดตัว: ความแรงคริเพิ่มขึ้น 40%");
      i17.addProperty(propertyItemRepository.findById(17));
      i17.setPriceItem(2120);
      itemRepository.save(i17);
      //----------------------- Muramasa -----------------------------------
      PropertyItem pi27 = new PropertyItem();
      pi27.setEffects(effectRepository.findById(1));
      pi27.setPropertyItem(75);  //พลังโจมตี +75 (id=27)
      propertyItemRepository.save(pi27);

      Item i18 = new Item();
      i18.setName("Muramasa");
      i18.setImg_item("..\\Item\\โจมตี\\Muramasa.png");
      i18.setTypeItem(typeItemRepository.findById(1));
      i18.setSpecialEffect("สกิลติดตัว: เจาะเกราะ +45%");
      i18.addProperty(propertyItemRepository.findById(14));
      i18.addProperty(propertyItemRepository.findById(27));
      i18.setPriceItem(2020);
      itemRepository.save(i18);
      //----------------------- The Beast -----------------------------------
      Item i19 = new Item();
      i19.setName("The Beast");
      i19.setImg_item("..\\Item\\โจมตี\\The-Beast.png");
      i19.setTypeItem(typeItemRepository.findById(1));
      i19.setSpecialEffect("สกิลติดตัว: ดูดเลือด +25%");
      i19.addProperty(propertyItemRepository.findById(17));
      i19.setPriceItem(1740);
      itemRepository.save(i19);
      //----------------------- Omni Arms -----------------------------------
      PropertyItem pi28 = new PropertyItem();
      pi28.setEffects(effectRepository.findById(1));
      pi28.setPropertyItem(70);  //พลังโจมตี +70 (id=28)
      propertyItemRepository.save(pi28);

      PropertyItem pi29 = new PropertyItem();
      pi29.setEffects(effectRepository.findById(7));
      pi29.setPropertyItem(8);  //ดูดเลือด +8% (id=29)
      propertyItemRepository.save(pi29);

      PropertyItem pi30 = new PropertyItem();
      pi30.setEffects(effectRepository.findById(5));
      pi30.setPropertyItem(400);  //พลังชีวิต +400 (id=30)
      propertyItemRepository.save(pi30);

      Item i20 = new Item();
      i20.setName("Omni Arms");
      i20.setImg_item("..\\Item\\โจมตี\\Omni-Arms.png");
      i20.setTypeItem(typeItemRepository.findById(1));
      i20.setSpecialEffect("สกิลติดตัว - Five Forces: หลังจากฮีโร่ใช้สกิล จะเพิ่มพลังโจมตีให้กับการโจมตีปกติครั้งต่อไป (CD 2 วิ) สกิลติดตัว - Speed Up: เมื่อทำการโจมตีปกติ รับความเร็วเคลื่อนที่ +10%");
      i20.addProperty(propertyItemRepository.findById(28));
      i20.addProperty(propertyItemRepository.findById(9));
      i20.addProperty(propertyItemRepository.findById(29));
      i20.addProperty(propertyItemRepository.findById(18));
      i20.addProperty(propertyItemRepository.findById(30));
      i20.setPriceItem(2150);
      itemRepository.save(i20);
      //----------------------- Sikk's Sting -----------------------------------
      PropertyItem pi31 = new PropertyItem();
      pi31.setEffects(effectRepository.findById(4));
      pi31.setPropertyItem(35);  //ความเร็วโจมตี +35% (id=31)
      propertyItemRepository.save(pi31);

      PropertyItem pi32 = new PropertyItem();
      pi32.setEffects(effectRepository.findById(2));
      pi32.setPropertyItem(25);  //ดูดเลือด +8% (id=32)
      propertyItemRepository.save(pi32);

      PropertyItem pi33 = new PropertyItem();
      pi33.setEffects(effectRepository.findById(15));
      pi33.setPropertyItem(7);  //ความเร็วเคลื่อนที่ +7% (id=33)
      propertyItemRepository.save(pi33);
      
      Item i21 = new Item();
      i21.setName("Sikk's Sting");
      i21.setImg_item("..\\Item\\โจมตี\\Slikks-Sting.png");
      i21.setTypeItem(typeItemRepository.findById(1));
      i21.setSpecialEffect("สกิลติดตัว - Wind Bless: หลังจากติดคริ จะต้านทานสถานะเพิ่มขึ้น 35% เป็นเวลา 2 วิ");
      i21.addProperty(propertyItemRepository.findById(31));
      i21.addProperty(propertyItemRepository.findById(32));
      i21.addProperty(propertyItemRepository.findById(33));
      i21.setPriceItem(1920);
      itemRepository.save(i21);
      //----------------------- Fenrir's Tooth -----------------------------------
      PropertyItem pi34 = new PropertyItem();
      pi34.setEffects(effectRepository.findById(1));
      pi34.setPropertyItem(200);  //พลังโจมตี +200 (id=34)
      propertyItemRepository.save(pi34);
      
      Item i22 = new Item();
      i22.setName("Fenrir's Tooth");
      i22.setImg_item("..\\Item\\โจมตี\\Fenrirs-Tooth.png");
      i22.setTypeItem(typeItemRepository.findById(1));
      i22.setSpecialEffect("สกิลติดตัว - Fenrir's Tooth: เมื่อ HP ของเป้าหมายต่ำกว่า 50% จะได้รับความเสียหาย +30%");
      i22.addProperty(propertyItemRepository.findById(34));
      i22.setPriceItem(2950);
      itemRepository.save(i22);
      //----------------------- Blitz Blade -----------------------------------
      PropertyItem pi35 = new PropertyItem();
      pi35.setEffects(effectRepository.findById(1));
      pi35.setPropertyItem(50);  //พลังโจมตี +50 (id=35)
      propertyItemRepository.save(pi35);

      PropertyItem pi36 = new PropertyItem();
      pi36.setEffects(effectRepository.findById(1));
      pi36.setPropertyItem(5);  //ความเร็วเคลื่อนที่ +5% (id=36)
      propertyItemRepository.save(pi36);

      Item i23 = new Item();
      i23.setName("Blitz Blade");
      i23.setImg_item("..\\Item\\โจมตี\\Blitz-Blade.png");
      i23.setTypeItem(typeItemRepository.findById(1));
      i23.setSpecialEffect("Electric Arc: ทุก 4 วิ การโจมตีปกติจะปล่อยสายฟ้าสร้าง ความเสียหายเวท 102 (LV อัพ+7) 2 เท่าหากเป็นระยะไกล (การโจมตีปกติจะลด CD 1 วิ)");
      i23.addProperty(propertyItemRepository.findById(35));
      i23.addProperty(propertyItemRepository.findById(31));
      i23.addProperty(propertyItemRepository.findById(36));
      i23.setPriceItem(1780);
      itemRepository.save(i23);
      //----------------------- Ifrit's Claw -----------------------------------
      PropertyItem pi37 = new PropertyItem();
      pi37.setEffects(effectRepository.findById(2));
      pi37.setPropertyItem(20);  //อัตราคริติคอล +20% (id=37)
      propertyItemRepository.save(pi37);

      Item i24 = new Item();
      i24.setName("Ifrit's Claw");
      i24.setImg_item("..\\Item\\โจมตี\\Ifrits-Claw.png");
      i24.setTypeItem(typeItemRepository.findById(1));
      i24.setSpecialEffect("สกิลติดตัว - Flame's Wrath: เมื่อโจมตีปกติโดนเป้าหมาย จะโจมตีเร็วขึ้น 10% เป็นเวลา 2 วิ (5 ครั้ง)");
      i24.addProperty(propertyItemRepository.findById(25));
      i24.addProperty(propertyItemRepository.findById(37));
      i24.addProperty(propertyItemRepository.findById(36));
      i24.setPriceItem(1960); 
      itemRepository.save(i24);
      //----------------------- Broken Spears -----------------------------------
      PropertyItem pi38 = new PropertyItem();
      pi38.setEffects(effectRepository.findById(1));
      pi38.setPropertyItem(110);  //พลังโจมตี +110 (id=38)
      propertyItemRepository.save(pi38);

      Item i25 = new Item();
      i25.setName("Broken Spears");
      i25.setImg_item("..\\Item\\โจมตี\\Broken-Spears.png");
      i25.setTypeItem(typeItemRepository.findById(1));
      i25.setSpecialEffect("สกิลติดตัว - Wind Walk: ความเร็วเคลื่อนที่เพิ่มขึ้น 10% เมื่อไม่ได้ต่อสู้ สกิลติดตัว - Destroyer: เพิ่มเจาะเกราะ 80 (LV อัพ+8)");
      i25.addProperty(propertyItemRepository.findById(38));
      i25.setPriceItem(2020);
      itemRepository.save(i25);
      //////////////////////////   เวท   ///////////////////////////////////////
      //----------------------- Spell Tome -----------------------------------
      PropertyItem pi39 = new PropertyItem();
      pi39.setEffects(effectRepository.findById(3));
      pi39.setPropertyItem(40);  //พลังเวท +40 (id=39)
      propertyItemRepository.save(pi39);

      Item i26 = new Item();
      i26.setName("Spell Tome");
      i26.setImg_item("..\\Item\\เวท\\Spell-Tome.png");
      i26.setTypeItem(typeItemRepository.findById(2));
      i26.setSpecialEffect("-");
      i26.addProperty(propertyItemRepository.findById(39));
      i26.setPriceItem(300);
      itemRepository.save(i26);
      //----------------------- Lapis Ring -----------------------------------
      PropertyItem pi40 = new PropertyItem();
      pi40.setEffects(effectRepository.findById(16));
      pi40.setPropertyItem(300);  //มานาสูงสุด +300 (id=40)
      propertyItemRepository.save(pi40);

      Item i27 = new Item();
      i27.setName("Lapis Ring");
      i27.setImg_item("..\\Item\\เวท\\Lapis-Ring.png");
      i27.setTypeItem(typeItemRepository.findById(2));
      i27.setSpecialEffect("-");
      i27.addProperty(propertyItemRepository.findById(40));
      i27.setPriceItem(220);
      itemRepository.save(i27);
      //----------------------- Pendant of Faith -----------------------------------
      PropertyItem pi41 = new PropertyItem();
      pi41.setEffects(effectRepository.findById(6));
      pi41.setPropertyItem(10);  //ฟื้นฟูมานา/5วิ +10 (id=41)
      propertyItemRepository.save(pi41);

      Item i28 = new Item();
      i28.setName("Pendant of Faith");
      i28.setImg_item("..\\Item\\เวท\\Pendant-of-Faith.png");
      i28.setTypeItem(typeItemRepository.findById(2));
      i28.setSpecialEffect("-");
      i28.addProperty(propertyItemRepository.findById(41));
      i28.setPriceItem(120);
      itemRepository.save(i28);
      //----------------------- Ancient Scriptures -----------------------------------
      PropertyItem pi42 = new PropertyItem();
      pi42.setEffects(effectRepository.findById(1));
      pi42.setPropertyItem(80);  //พลังเวท +80 (id=42)
      propertyItemRepository.save(pi42);

      PropertyItem pi43 = new PropertyItem();
      pi43.setEffects(effectRepository.findById(6));
      pi43.setPropertyItem(20);  //ฟื้นฟูมานา/5วิ +20 (id=43)
      propertyItemRepository.save(pi43);

      Item i29 = new Item();
      i29.setName("Ancient Scriptures");
      i29.setImg_item("..\\Item\\เวท\\Ancient-Scriptures.png");
      i29.setTypeItem(typeItemRepository.findById(2));
      i29.setSpecialEffect("-");
      i29.addProperty(propertyItemRepository.findById(42));
      i29.addProperty(propertyItemRepository.findById(43));
      i29.setPriceItem(540);
      itemRepository.save(i29);
      //----------------------- Magic Ring -----------------------------------
      Item i30 = new Item();
      i30.setName("Magic Ring");
      i30.setImg_item("..\\Item\\เวท\\Magic-Ring.png");
      i30.setTypeItem(typeItemRepository.findById(2));
      i30.setSpecialEffect("สกิลติดตัว: ลดคูลดาวน์ +10%");
      i30.setPriceItem(430);
      itemRepository.save(i30);
      //----------------------- Enchanted Scroll -----------------------------------
      PropertyItem pi44 = new PropertyItem();
      pi44.setEffects(effectRepository.findById(3));
      pi44.setPropertyItem(120);  //พลังเวท +120 (id=44)
      propertyItemRepository.save(pi44);

      Item i31 = new Item();
      i31.setName("Enchanted Scroll");
      i31.setImg_item("..\\Item\\เวท\\Enchanted-Scroll.png");
      i31.setTypeItem(typeItemRepository.findById(2));
      i31.setSpecialEffect("-");
      i31.addProperty(propertyItemRepository.findById(44));
      i31.setPriceItem(820);
      itemRepository.save(i31);
      //----------------------- Trick Blade -----------------------------------
      PropertyItem pi45 = new PropertyItem();
      pi45.setEffects(effectRepository.findById(3));
      pi45.setPropertyItem(60);  //พลังเวท  +60 (id=45)
      propertyItemRepository.save(pi45);

      Item i32 = new Item();
      i32.setName("Trick Blade");
      i32.setImg_item("..\\Item\\เวท\\Trick-Blade.png");
      i32.setTypeItem(typeItemRepository.findById(2));
      i32.setSpecialEffect("สกิลติดตัว - Elemental Edge: เมื่อใช้สกิล การโจมตีปกติครั้งถัดไปจะสร้างโบนัส ความเสียหายเวท (CD 3 วิ)");
      i32.addProperty(propertyItemRepository.findById(45));
      i32.addProperty(propertyItemRepository.findById(18));
      i32.setPriceItem(920);
      itemRepository.save(i32);
      //----------------------- Spooky Mask -----------------------------------
      PropertyItem pi46 = new PropertyItem();
      pi46.setEffects(effectRepository.findById(3));
      pi46.setPropertyItem(100);  //พลังเวท  +100 (id=46)
      propertyItemRepository.save(pi46);

      Item i33 = new Item();
      i33.setName("Spooky Mask");
      i33.setImg_item("..\\Item\\เวท\\Spooky-Mask.png");
      i33.setTypeItem(typeItemRepository.findById(2));
      i33.setSpecialEffect("สกิลติดตัว: เจาะเกราะเวท +75");
      i33.addProperty(propertyItemRepository.findById(46));
      i33.setPriceItem(960);
      itemRepository.save(i33);
      //----------------------- Phoenix Tear -----------------------------------
      Item i34 = new Item();
      i34.setName("Phoenix Tear");
      i34.setImg_item("..\\Item\\เวท\\Phoenix-Tear.png");
      i34.setTypeItem(typeItemRepository.findById(2));
      i34.setSpecialEffect("สกิลติดตัว - From the Ashes: เมื่อฮีโร่เลเวลอัพจะฟื้นฟูมานา 10% และ HP 20% ใน 3 วิ");
      i34.addProperty(propertyItemRepository.findById(45));
      i34.setPriceItem(600);
      itemRepository.save(i34);
      //----------------------- Virtue's Bracelet -----------------------------------
      Item i35 = new Item();
      i35.setName("Virtue's Bracelet");
      i35.setImg_item("..\\Item\\เวท\\Virtues-Bracelet.png");
      i35.setTypeItem(typeItemRepository.findById(2));
      i35.setSpecialEffect("-");
      i35.addProperty(propertyItemRepository.findById(45));
      i35.addProperty(propertyItemRepository.findById(20));
      i35.addProperty(propertyItemRepository.findById(43));
      i35.setPriceItem(720);
      itemRepository.save(i35);
      //----------------------- Vlad's Impaler -----------------------------------
      PropertyItem pi47 = new PropertyItem();
      pi47.setEffects(effectRepository.findById(3));
      pi47.setPropertyItem(90);  //พลังเวท  +90 (id=47)
      propertyItemRepository.save(pi47);

      Item i36 = new Item();
      i36.setName("Vlad's Impaler");
      i36.setImg_item("..\\Item\\เวท\\Vlads-Impaler.png");
      i36.setTypeItem(typeItemRepository.findById(2));
      i36.setSpecialEffect("สกิลติดตัว: เจาะเกราะเวท +40%");
      i36.addProperty(propertyItemRepository.findById(47));
      i36.setPriceItem(1190);
      itemRepository.save(i36);
      //----------------------- Staff of Nuul -----------------------------------
      PropertyItem pi48 = new PropertyItem();
      pi48.setEffects(effectRepository.findById(3));
      pi48.setPropertyItem(180);  //พลังเวท  +180 (id=48)
      propertyItemRepository.save(pi48);

      Item i37 = new Item();
      i37.setName("Staff of Nuul");
      i37.setImg_item("..\\Item\\เวท\\Staff-of-Nuul.png");
      i37.setTypeItem(typeItemRepository.findById(2));
      i37.setSpecialEffect("สกิลติดตัว: เจาะเกราะเวท +40%");
      i37.addProperty(propertyItemRepository.findById(48));
      i37.addProperty(propertyItemRepository.findById(18));
      i37.setPriceItem(2050);
      itemRepository.save(i37);
      //----------------------- Evil Secrets -----------------------------------
      Item i38 = new Item();
      i38.setName("Evil Secrets");
      i38.setImg_item("..\\Item\\เวท\\evils_secret.png");
      i38.setTypeItem(typeItemRepository.findById(2));
      i38.setSpecialEffect("สกิลติดตัว: เจาะเกราะเวท +150");
      i38.addProperty(propertyItemRepository.findById(44));
      i38.addProperty(propertyItemRepository.findById(18));
      i38.addProperty(propertyItemRepository.findById(24));
      i38.setPriceItem(1980);
      itemRepository.save(i38);
      //----------------------- Soul Scroll -----------------------------------
      PropertyItem pi49 = new PropertyItem();
      pi49.setEffects(effectRepository.findById(3));
      pi49.setPropertyItem(220);  //พลังเวท  +220 (id=49)
      propertyItemRepository.save(pi49);

      PropertyItem pi50 = new PropertyItem();
      pi50.setEffects(effectRepository.findById(5));
      pi50.setPropertyItem(300);  //พลังชีวิต  +300 (id=50)
      propertyItemRepository.save(pi50);

      Item i39 = new Item();
      i39.setName("Soul Scroll");
      i39.setImg_item("..\\Item\\เวท\\Soul-Scroll.png");
      i39.setTypeItem(typeItemRepository.findById(2));
      i39.setSpecialEffect("สกิลติดตัว - Soul Prison เมื่อสร้างความเสียหายจะลดอัตราการฟื้นฟูของเป้าหมาย 50% เป็นเวลา 1.5 วิ (หากใช้การโจมตีปกติจะเพิ่มระยะเวลาเป็น 3 วิ)");
      i39.addProperty(propertyItemRepository.findById(49));
      i39.addProperty(propertyItemRepository.findById(18));
      i39.addProperty(propertyItemRepository.findById(43));
      i39.addProperty(propertyItemRepository.findById(50));
      i39.setPriceItem(2000);
      itemRepository.save(i39);
      //----------------------- Virtue's Necklace -----------------------------------
      PropertyItem pi51 = new PropertyItem();
      pi51.setEffects(effectRepository.findById(3));
      pi51.setPropertyItem(160);  //พลังเวท +160 (id=51)
      propertyItemRepository.save(pi51);

      PropertyItem pi52 = new PropertyItem();
      pi52.setEffects(effectRepository.findById(6));
      pi52.setPropertyItem(25);  //ฟื้นฟูมานา/5วิ +25 (id=52)
      propertyItemRepository.save(pi52);

      Item i40 = new Item();
      i40.setName("Virtue's Necklace");
      i40.setImg_item("..\\Item\\เวท\\Virtues-Necklace.png");
      i40.setTypeItem(typeItemRepository.findById(2));
      i40.setSpecialEffect("สกิลติดตัว - Enlightened: ฟื้นฟูมานา 1% ต่อวิ");
      i40.addProperty(propertyItemRepository.findById(51));
      i40.addProperty(propertyItemRepository.findById(23));
      i40.addProperty(propertyItemRepository.findById(52));
      i40.setPriceItem(1980);
      itemRepository.save(i40);
      //----------------------- Boomstick -----------------------------------
      PropertyItem pi53 = new PropertyItem();
      pi53.setEffects(effectRepository.findById(3));
      pi53.setPropertyItem(240);  //พลังเวท +240 (id=53)
      propertyItemRepository.save(pi53);

      PropertyItem pi54 = new PropertyItem();
      pi54.setEffects(effectRepository.findById(6));
      pi54.setPropertyItem(30);  //ฟื้นฟูมานา/5วิ +30 (id=54)
      propertyItemRepository.save(pi54);

      Item i41 = new Item();
      i41.setName("Boomstick");
      i41.setImg_item("..\\Item\\เวท\\Boomstick.png");
      i41.setTypeItem(typeItemRepository.findById(2));
      i41.setSpecialEffect("สกิลติดตัว - Echo: เมื่อใช้สกิล สร้าง ความเสียหายเวท 100 (+40%โบนัสเวท) CD 5 วิ");
      i41.addProperty(propertyItemRepository.findById(53));
      i41.addProperty(propertyItemRepository.findById(54));
      i41.setPriceItem(2000);
      itemRepository.save(i41);
      //----------------------- Hecate's Diadem -----------------------------------
      Item i42 = new Item();
      i42.setName("Hecate's Diadem");
      i42.setImg_item("..\\Item\\เวท\\Hecates-Diadem.png");
      i42.setTypeItem(typeItemRepository.findById(2));
      i42.setSpecialEffect("สกิลติดตัว - Kich: พลังเวทเพิ่มขึ้น 35%");
      i42.addProperty(propertyItemRepository.findById(53));
      i42.setPriceItem(2300);
      itemRepository.save(i42);
      //----------------------- Orb of the Magi -----------------------------------
      PropertyItem pi55 = new PropertyItem();
      pi55.setEffects(effectRepository.findById(3));
      pi55.setPropertyItem(140);  //พลังเวท +140 (id=55)
      propertyItemRepository.save(pi55);

      Item i43 = new Item();
      i43.setName("Orb of the Magi");
      i43.setImg_item("..\\Item\\เวท\\Orb-of-the-Magi.png");
      i43.setTypeItem(typeItemRepository.findById(2));
      i43.setSpecialEffect("สกิลติดตัว - Bide: ทุก 30 วิ รับพลังเวท 12 หน่วย พลังชีวิตสูงสุด 110 หน่วย (สูงสุด 10 ครั้ง) สกิลติดตัว - From the Ashes: เมื่อฮีโร่เลเวลอัพจะฟื้นฟูมานา 20% และ 600 HP (LV อัพ+30) ใน 3 วิ");
      i43.addProperty(propertyItemRepository.findById(55));
      i43.addProperty(propertyItemRepository.findById(18));
      i43.setPriceItem(2010);
      itemRepository.save(i43);
      //----------------------- Rhea's Blessing -----------------------------------
      Item i44 = new Item();
      i44.setName("Rhea's Blessing");
      i44.setImg_item("..\\Item\\เวท\\Rheas-Blessing.png");
      i44.setTypeItem(typeItemRepository.findById(2));
      i44.setSpecialEffect("สกิลติดตัว - Mana Shield: เมื่อ HP ต่ำกว่า 40% จะสร้างโล่ (450+LV ฮีโร่x50) (+40% โบนัสเวท) เป็นเวลา 4 วิ CD 75 วิ สกิลติดตัว - Bloodthirst: เวทแวมไพร์ +25%");
      i44.addProperty(propertyItemRepository.findById(55));
      i44.addProperty(propertyItemRepository.findById(18));
      i44.setPriceItem(2220);
      itemRepository.save(i44);
      //----------------------- Zweihander -----------------------------------
      PropertyItem pi56 = new PropertyItem();
      pi56.setEffects(effectRepository.findById(3));
      pi56.setPropertyItem(180);  //พลังเวท +180 (id=56)
      propertyItemRepository.save(pi56);

      PropertyItem pi57 = new PropertyItem();
      pi57.setEffects(effectRepository.findById(16));
      pi57.setPropertyItem(400);  //มานาสูงสุด +400 (id=57)
      propertyItemRepository.save(pi57);

      PropertyItem pi58 = new PropertyItem();
      pi58.setEffects(effectRepository.findById(3));
      pi58.setPropertyItem(8);  //ความเร็วเคลื่อนที่ +8% (id=58)
      propertyItemRepository.save(pi58);

      Item i45 = new Item();
      i45.setName("Zweihander");
      i45.setImg_item("..\\Item\\เวท\\Zweihander.png");
      i45.setTypeItem(typeItemRepository.findById(2));
      i45.setSpecialEffect("สกิลติดตัว - Sudden Strike: เมื่อโจมตีปกติจะ +ตีเร็ว 50% เป็นเวลา 4 วิ (CD 10 วิ) \n สกิลติดตัว - Scorching: การโจมตีปกติสร้างความเสียหายเวทเพิ่ม 20%");
      i45.addProperty(propertyItemRepository.findById(56));
      i45.addProperty(propertyItemRepository.findById(57));
      i45.addProperty(propertyItemRepository.findById(58));
      i45.setPriceItem(1970);
      itemRepository.save(i45);
      //----------------------- Frosty's Revenge -----------------------------------
      PropertyItem pi59 = new PropertyItem();
      pi59.setEffects(effectRepository.findById(5));
      pi59.setPropertyItem(850);  //พลังชีวิต +850 (id=59)
      propertyItemRepository.save(pi59);

      Item i46 = new Item();
      i46.setName("Frosty's Revenge");
      i46.setImg_item("..\\Item\\เวท\\Frostys-Revenge.png");
      i46.setTypeItem(typeItemRepository.findById(2));
      i46.setSpecialEffect("สกิลติดตัว - Frost: สกิลที่สร้างความเสียหายจะลดความเร็วเคลื่อนที่ 20% เป็นเวลา 2 วิ");
      i46.addProperty(propertyItemRepository.findById(55));
      i46.addProperty(propertyItemRepository.findById(59));
      i46.addProperty(propertyItemRepository.findById(10));
      i46.setPriceItem(2020);
      itemRepository.save(i46);
      //----------------------- Berith's Agony -----------------------------------
      PropertyItem pi60 = new PropertyItem();
      pi60.setEffects(effectRepository.findById(6));
      pi60.setPropertyItem(30);  //ฟื้นฟูมานา/5วิ +30 (id=60)
      propertyItemRepository.save(pi60);

      PropertyItem pi61 = new PropertyItem();
      pi61.setEffects(effectRepository.findById(6));
      pi61.setPropertyItem(255);  //เกราะ +255 (id=61)
      propertyItemRepository.save(pi61);

      Item i47 = new Item();
      i47.setName("Berith's Agony");
      i47.setImg_item("..\\Item\\เวท\\Beriths-Agony.png");
      i47.setTypeItem(typeItemRepository.findById(2));
      i47.setSpecialEffect("สกิลติดตัว - Torture: สกิลจะสร้าง ความเสียหายเวท เท่ากับ (2% +60 HP ปัจจุบัน) เป็นเวลา 3 วิ (สูงสุด 80 หากโจมตีมอนสเตอร์ป่า)");
      i47.addProperty(propertyItemRepository.findById(55));
      i47.addProperty(propertyItemRepository.findById(18));
      i47.addProperty(propertyItemRepository.findById(60));
      i47.addProperty(propertyItemRepository.findById(61));
      i47.setPriceItem(2120);
      itemRepository.save(i47);
      //----------------------- Apocalypse -----------------------------------
      PropertyItem pi62 = new PropertyItem();
      pi62.setEffects(effectRepository.findById(3));
      pi62.setPropertyItem(200);  //พลังเวท +200 (id=62)
      propertyItemRepository.save(pi62);

      Item i48 = new Item();
      i48.setName("Apocalypse");
      i48.setImg_item("..\\Item\\เวท\\Apocalypse.png");
      i48.setTypeItem(typeItemRepository.findById(2));
      i48.setSpecialEffect("Elemental Edge: หลังใช้สกิล การโจมตีปกติถัดไปจะ +เวท 30% ของกายภาพ (+80% โบนัสเวท)");
      i48.addProperty(propertyItemRepository.findById(62));
      i48.addProperty(propertyItemRepository.findById(18));
      i48.addProperty(propertyItemRepository.findById(60));
      i48.setPriceItem(2190);
      itemRepository.save(i48);
      //----------------------- Soaring Aura -----------------------------------
      PropertyItem pi63 = new PropertyItem();
      pi63.setEffects(effectRepository.findById(5));
      pi63.setPropertyItem(1050);  //พลังชีวิต +1050 (id=63)
      propertyItemRepository.save(pi63);

      Item i49 = new Item();
      i49.setName("Soaring Aura");
      i49.setImg_item("..\\Item\\เวท\\Soaring-Aura.png");
      i49.setTypeItem(typeItemRepository.findById(2));
      i49.setSpecialEffect("Enchantment: ลดเกราะเวทศัตรูในระยะลง 80-150 หน่วย (เพิ่มตามเลเวลฮีโร่)");
      i49.addProperty(propertyItemRepository.findById(55));
      i49.addProperty(propertyItemRepository.findById(63));
      i49.setPriceItem(2100);
      itemRepository.save(i49);
      //----------------------- Holy of Holies -----------------------------------
      PropertyItem pi64 = new PropertyItem();
      pi64.setEffects(effectRepository.findById(3));
      pi64.setPropertyItem(400);  //พลังเวท +400 (id=64)
      propertyItemRepository.save(pi64);

      Item i50 = new Item();
      i50.setName("Holy of Holies");
      i50.setImg_item("..\\Item\\เวท\\Holy-of-Holies.png");
      i50.setTypeItem(typeItemRepository.findById(2));
      i50.setSpecialEffect("สกิลติดตัว - Enlightenment: เพิ่มพลังชีวิตสูงสุด 1400");
      i50.addProperty(propertyItemRepository.findById(64));
      i50.setPriceItem(2990);
      itemRepository.save(i50);
      //----------------------- Artic Orb -----------------------------------
      PropertyItem pi65 = new PropertyItem();
      pi65.setEffects(effectRepository.findById(3));
      pi65.setPropertyItem(220);  //พลังเวท +220 (id=65)
      propertyItemRepository.save(pi65);

      Item i51 = new Item();
      i51.setName("Artic Orb");
      i51.setImg_item("..\\Item\\เวท\\Arctic-Orb.png");
      i51.setTypeItem(typeItemRepository.findById(2));
      i51.setSpecialEffect("สกิลพิเศษ - [Solidify]: เป็นอมตะ 2 วิ ระหว่างนั้นจะไม่สามารถเคลื่อนที่ โจมตี หรือใช้สกิลได้ เมื่อสิ้นสุดจะได้โล่ 500 (LV อัพ +40) (0.5 AP) 1 วิ (คูลดาวน์ 75 วิ)");
      i51.addProperty(propertyItemRepository.findById(65));
      i51.setPriceItem(2000);
      itemRepository.save(i51);
      //----------------------- Frostguard -----------------------------------
      Item i52 = new Item();
      i52.setName("Frostguard");
      i52.setImg_item("..\\Item\\เวท\\frostguard.png");
      i52.setTypeItem(typeItemRepository.findById(2));
      i52.setSpecialEffect("สกิลติดตัว - Ice Blast: หากถูกโจมตีครั้งเดียวมากกว่า 10% ของ HP ปัจจุบัน จะปล่อยคลื่นพลัง สร้าง ความเสียหายเวท 80 (+LVx20) (0.3 AP) พร้อมทำให้วิ่งและโจมตีช้าลง 30% เป็นเวลา 2 วิ (CD 2 วิ)");
      i52.addProperty(propertyItemRepository.findById(51));
      i52.addProperty(propertyItemRepository.findById(61));
      i52.setPriceItem(2150);
      itemRepository.save(i52);
      //=============================== Mode Infomation =================================
      //=================================================================================
      Stream.of( "..\\mode\\Map\\map.png","..\\mode\\Map\\3v3.jpg",
                 "..\\mode\\Map\\abyssal.png","..\\mode\\Map\\1v1.png",
                 "..\\mode\\Map\\10v10.jpg","..\\mode\\Map\\football.jpg",
                 "..\\mode\\Map\\hookwar.jpg" ).forEach( maps -> {
          Map map = new Map();
          map.setMap(maps);
          mapRepository.save(map);
      });
      Stream.of( "โหมดทั่วไป","โหมดบันเทิง","โหมดพิเศษ").forEach( typeM -> {
          TypeMode type = new TypeMode();
          type.setTypeMode(typeM);
          typeModeRepository.save(type);
      });

      Monster mons1 = new Monster();
      mons1.setName("Sentry Hawk");
      mons1.setImg_monster("..\\mode\\Monster\\sentry_hawk.png");
      mons1.setTime_start(30);
      mons1.setTime_period(60);
      monsterRepository.save(mons1);

      Mode m1 = new Mode();
      m1.setName("5v5");
      m1.setInformation("โหมดที่คนนิยมในการเล่นมากที่สุดเนื่องจากไม่จำเป็นต้องซีเรียสมาก นิยมในการทดลองฮีโร่ใหม่หรือ ฮีโร่ฟรี");
      m1.setImg_mode("..\\mode\\5v5.jpg");
      m1.setTypeMode(typeModeRepository.findById(1));
      m1.setMap(mapRepository.findById(1));
      m1.addMonster(monsterRepository.findById(1));
      modeRepository.save(m1);

      Mode m2 = new Mode();
      m2.setName("3v3");
      m2.setInformation("โหมดที่คนนิยมในการเล่นมากที่สุดเนื่องจากไม่จำเป็นต้องซีเรียสมาก นิยมในการทดลองฮีโร่ใหม่หรือ ฮีโร่ฟรี");
      m2.setImg_mode("..\\mode\\3v3.jpg");
      m2.setTypeMode(typeModeRepository.findById(1));
      m2.setMap(mapRepository.findById(2));
      //m2.addMonster(monsterRepository.findById(1));
      modeRepository.save(m2);

      Mode m3 = new Mode();
      m3.setName("1v1");
      m3.setInformation("โหมดที่คนนิยมในการเล่นมากที่สุดเนื่องจากไม่จำเป็นต้องซีเรียสมาก นิยมในการทดลองฮีโร่ใหม่หรือ ฮีโร่ฟรี");
      m3.setImg_mode("..\\mode\\1v1.jpg");
      m3.setTypeMode(typeModeRepository.findById(1));
      m3.setMap(mapRepository.findById(4));
      //m3.addMonster(monsterRepository.findById(1));
      modeRepository.save(m3);

      /*Mode m4 = new Mode();
      m4.setName("5v5");
      m4.setInformation("โหมดที่คนนิยมในการเล่นมากที่สุดเนื่องจากไม่จำเป็นต้องซีเรียสมาก นิยมในการทดลองฮีโร่ใหม่หรือ ฮีโร่ฟรี");
      m4.setImg_mode("..\\mode\\5v5.jpg");
      m4.setTypeMode(typeModeRepository.findById(2));
      m4.setMap(mapRepository.findById(1));
      //m4.addMonster(monsterRepository.findById(1));
      modeRepository.save(m4);*/

      //=============================== Skin Infomation =================================
      //=================================================================================
      Stream.of( "Heroic" , "Epic" , "Ultimate" , "Legend" , "SUPREME" , "VALOR" , 
                 "EVO" , "Limited" , "HALLOWEEN" , "RANKED MATCH" , "SNOW FESTIVAL" ,
                 "Valentine" , "Miracle" , "ESTEEM" , "Mythical" , "DIMENSION BREAKER" , 
                 "PRIME" , "true" ).forEach( typeSk -> {
          TypeSkin typeSS  = new TypeSkin();
          typeSS.setTypeSkin(typeSk);
          typeSkinRepository.save(typeSS);
      });
      Stream.of( "175 คูปอง" , "270 คูปอง" ,"375 คูปอง" , "510 คูปอง" , "710 คูปอง" , 
                 "910 คูปอง" , "1200 คูปอง" , "1450 คูปอง" , "2000 คูปอง" , 
                 "รับได้ใน Valor Pass" , "จำกัดเฉพาะกิจกรรม" , "รับได้ในกิจกรรม" , 
                 "รางวัลจัดอันดับ" , "ได้รับจากวงแหวนเวทอัญเชิญ" , "ร้านค้าพเนจร" , 
                 "รับในลอดเตอรี่" , "ได้รับจากการเลื่อนขั้น" , "สำหรับ RoV PRIME เท่านั้น" ).forEach( hows-> {
          Receive how = new Receive();
          how.setReceive(hows);
          receiveRepository.save(how);    
      });

      Skin airi_s1 = new Skin();
      airi_s1.setName("Viper");
      airi_s1.setImg_small("..\\Heroes\\Airi\\Skin\\Viper-s.jpg");
      airi_s1.setImg_big("..\\Heroes\\Airi\\Skin\\Viper.png");
      airi_s1.setTypeSkin(typeSkinRepository.findById(1));
      airi_s1.setHowto(receiveRepository.findById(3));
      skinRepository.save(airi_s1);

      //=============================== Post Infomation =================================
      //=================================================================================
      LocalDateTime date = LocalDateTime.now();
      DateTimeFormatter format = DateTimeFormatter.ofPattern("dd MMMM yyyy - HH:mm:ss");
      String dateTime = date.format(format);
      
      Post post1 = new Post();
      post1.setInformationPost("Nattapol Panta B6015107 RoV Information Web Application for Vue.js");
      post1.setCreatedBy(userRepository.findById(1));
      post1.setDate(dateTime);
      postRepository.save(post1);

      Comment comment1 = new Comment();
      comment1.setInformationComment("Nattapol Panta B6015107 RoV Information Web Application for Vue.js");
      comment1.setCreatedBy(userRepository.findById(1));
      comment1.setPost(postRepository.findById(1));
      comment1.setDate(dateTime);
      commentRepository.save(comment1);

      Comment comment2 = new Comment();
      comment2.setInformationComment("Vue.js");
      comment2.setCreatedBy(userRepository.findById(1));
      comment2.setPost(postRepository.findById(1));
      comment2.setDate(dateTime);
      commentRepository.save(comment2);


      userRepository.findAll().forEach(System.out::println);
    };
  }
}
