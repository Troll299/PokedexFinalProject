package e.mkrivoshea.pokedexfinalproject;

/**
 * Created by m.krivoshea on 5/28/2018.
 */

public class Entry {
    public String name;
    public String dex;
    public String number;

    public static final Entry[] entries = {
            new Entry("Bulbasaur", "A strange seed was planted on its back at birth. The plant sprouts and grows with this Pokémon", "1"),
            new Entry("Ivysaur", "When the bulb on its back grows large, it appears to lose the ability to stand on its hind legs.", "2"),
            new Entry("Venusaur", "The plant blooms when it is absorbing solar energy. It stays on the move to seek sunlight.", "3"),
            new Entry("Carmander", "Obviously prefers hot places. When it rains, steam is said to spout from the tip of its tail.", "4"),
            new Entry("Charmeleon", "When it swings its burning tail, it elevates the temperature to unbearably high levels.", "5"),
            new Entry("Charizard", "Spits fire that is hot enough to melt boulders. Known to cause forest fires unintentionally.", "6"),
            new Entry("Squirtle", "After birth, its back swells and hardens into a shell. Powerfully sprays foam from its mouth.", "7"),
            new Entry("Wartortle", "Often hides in water to stalk unwary prey. For swimming fast, it moves its ears to maintain balance.", "8"),
            new Entry("Blastoise", "A brutal Pokémon with pressurized water jets on its shell. They are used for high speed tackles.", "9"),
            new Entry("Caterpie", "Its short feet are tipped with suction pads that enable it to tirelessly climb slopes and walls.", "10"),
            new Entry("Metapod", "This Pokémon is vulnerable to attack while its shell is soft, exposing its weak and tender body.", "11"),
            new Entry("Butterfree", "In battle, it flaps its wings at high speed to release highly toxic dust into the air.", "12"),
            new Entry("Weedle", "Often found in forests, eating leaves. It has a sharp venomous stinger on its head.", "13"),
            new Entry("Kakuna", "Almost incapable of moving, this Pokémon can only harden its shell to protect itself from predators.", "14"),
            new Entry("Beedrill", "Flies at high speed and attacks using its large venomous stingers on its forelegs and tail.", "15"),
            new Entry("Pidgey", "A common sight in forests and woods. It flaps its wings at ground level to kick up blinding sand.", "16"),
            new Entry("Pidgeotto", "Very protective of its sprawling territorial area, this Pokémon will fiercely peck at any intruder.", "17"),
            new Entry("Pidgeot", "When hunting, it skims the surface of water at high speed to pick off unwary prey such as Magikarp.", "18"),
            new Entry("Rattata", "Bites anything when it attacks. Small and very quick, it is a common sight in many places.", "19"),
            new Entry("Raticate", "It uses its whiskers to maintain its balance. It apparently slows down if they are cut off.", "20"),
            new Entry("Spearow", "Eats bugs in grassy areas. It has to flap its short wings at high speed to stay airborne.", "21"),
            new Entry("Fearow", "With its huge and magnificent wings, it can keep aloft without ever having to land for rest.", "22"),
            new Entry("Ekans", "Moves silently and stealthily. Eats the eggs of birds, such as Pidgey and Spearow, whole.", "23"),
            new Entry("Arbok", "It is rumored that the ferocious warning markings on its belly differ from area to area.", "24"),
            new Entry("Pikachu", "When several of these Pokémon gather, their electricity could build and cause lightning storms.", "25"),
            new Entry("Riachu", "Its long tail serves as a ground to protect itself from its own high voltage power.", "26"),
            new Entry("Sandshrew", "Burrows deep underground in arid locations far from water. It only emerges to hunt for food.", "27"),
            new Entry("Sandslash", "Curls up into a spiny ball when threatened. It can roll while curled up to attack or escape.", "28"),
            new Entry("Nidoran♀", "Although small, its venomous barbs render this Pokémon dangerous. The female has smaller horns.", "29"),
            new Entry("Nidorina", "The female's horn develops slowly. Prefers physical attacks such as clawing and biting.", "30"),
            new Entry("Nidoqueen", "Its hard scales provide strong protection. It uses its hefty bulk to execute powerful moves.", "31"),
            new Entry("Nidoran♂", "Stiffens its ears to sense danger. The larger its horns, the more powerful its secreted venom.", "32"),
            new Entry("Nidorino", "An aggressive Pokémon that is quick to attack. The horn on its head secretes a powerful venom.", "33"),
            new Entry("Nidoking", "It uses its powerful tail in battle to smash, constrict, then break the prey's bones.", "34"),
            new Entry("Clefairy", "Its magical and cute appeal has many admirers. It is rare and found only in certain areas.", "35"),
            new Entry("Clefable", "A timid fairy Pokémon that is rarely seen. It will run and hide the moment it senses people.", "36"),
            new Entry("Vulpix", "At the time of birth, it has just one tail. The tail splits from its tip as it grows older.", "37"),
            new Entry("Ninetales", "Very smart and very vengeful. Grabbing one of its many tails could result in a 1000-year curse.", "38"),
            new Entry("Jigglypuff", "When its huge eyes light up, it sings a mysteriously soothing melody that lulls its enemies to sleep.", "39"),
            new Entry("Wigglytuff", "The body is soft and rubbery. When angered, it will suck in air and inflate itself to an enormous size.", "40"),
            new Entry("Zubat", "Forms colonies in perpetually dark places. Uses ultrasonic waves to identify and approach targets.", "41"),
            new Entry("Golbat", "Once it strikes, it will not stop draining energy from the victim even if it gets too heavy to fly.", "42"),
            new Entry("Oddish", "During the day, it keeps its face buried in the ground. At night, it wanders around sowing its seeds.", "43"),
            new Entry("Gloom", "The fluid that oozes from its mouth isn't drool. It is a nectar that is used to attract prey.", "44"),
            new Entry("Vileplume", "The larger its petals, the more toxic pollen it contains. Its big head is heavy and hard to hold up.", "45"),
            new Entry("Paras", "Burrows to suck tree roots. The mushrooms on its back grow by drawing nutrients from the bug host.", "46"),
            new Entry("Parasect", "A host-parasite pair in which the parasite mushroom has taken over the host bug. Prefers damp places.", "47"),
            new Entry("Venonat", "Lives in the shadows of tall trees where it eats insects. It is attracted by light at night.", "48"),
            new Entry("Venomoth", "The dust-like scales covering its wings are color coded to indicate the kinds of poison it has.", "49"),
            new Entry("Diglett", "Lives about one yard underground where it feeds on plant roots. It sometimes appears above ground.", "50"),
            new Entry("Dugtrio", "A team of Diglett triplets. It triggers huge earthquakes by burrowing 60 miles underground.", "51"),
            new Entry("Meowth", "Adores circular objects. Wanders the streets on a nightly basis to look for dropped loose change.", "52"),
            new Entry("Persian", "Although its fur has many admirers, it is tough to raise as a pet because of its fickle meanness.", "53"),
            new Entry("Psyduck", "While lulling its enemies with its vacant look, this wily Pokémon will use psychokinetic powers.", "54"),
            new Entry("Golduck", "Often seen swimming elegantly by lake shores. It is often mistaken for the Japanese monster, Kappa.", "55"),
            new Entry("Mankey", "Extremely quick to anger. It could be docile one moment then thrashing away the next instant.", "56"),
            new Entry("Primape", "Always furious and tenacious to boot. It will not abandon chasing its quarry until it is caught.", "57"),
            new Entry("Growlithe", "Very protective of its territory. It will bark and bite to repel intruders from its space.", "58"),
            new Entry("Arkanine", "A Pokémon that has been admired since the past for its beauty. It runs agilely as if on wings.", "59"),
            new Entry("Poliwag", "Its newly grown legs prevent it from running. It appears to prefer swimming than trying to stand.", "60"),
            new Entry("Poliwhirl", "Capable of living in or out of water. When out of water, it sweats to keep its body slimy.", "61"),
            new Entry("Poliwrath", "An adept swimmer at both the front crawl and breast stroke. Easily overtakes the best human swimmers.", "62"),
            new Entry("Abra", "Using its ability to read minds, it will identify impending danger and Teleport to safety.", "63"),
            new Entry("Kadabra", "It emits special alpha waves from its body that induce headaches just by being close by.", "64"),
            new Entry("Alakazam", "Its brain can outperform a super-computer. Its intelligence quotient is said to be 5,000.", "65"),
            new Entry("Machop", "Loves to build its muscles. It trains in all styles of martial arts to become even stronger.", "66"),
            new Entry("Machoke", "Its muscular body is so powerful, it must wear a power save belt to be able to regulate its motions.", "67"),
            new Entry("Machamp", "Using its heavy muscles, it throws powerful punches that can send the victim clear over the horizon.", "68"),
            new Entry("Bellsprout", "A carnivorous Pokémon that traps and eats bugs. It uses its root feet to soak up needed moisture.", "69"),
            new Entry("Weepinbell", "It spits out PoisonPowder to immobilize the enemy and then finishes it with a spray of Acid.", "70"),
            new Entry("Victreebell", "Said to live in huge colonies deep in jungles, although no one has ever returned from there.", "71"),
            new Entry("Tentacool", "Drifts in shallow seas. Anglers who hook them by accident are often punished by its stinging acid.", "72"),
            new Entry("Tentacruel", "The tentacles are normally kept short. On hunts, they are extended to ensnare and immobilize prey.", "73"),
            new Entry("Geodude", "Found in fields and mountains. Mistaking them for boulders, people often step or trip on them.", "74"),
            new Entry("Graveler", "Rolls down slopes to move. It rolls over any obstacle without slowing or changing its direction.", "75"),
            new Entry("Golem", "Its boulder-like body is extremely hard. It can easily withstand dynamite blasts without damage.", "76"),
            new Entry("Ponyta", "Its hooves are 10 times harder than diamonds. It can trample anything completely flat in little time.", "77"),
            new Entry("Rapidash", "Very competitive, this Pokémon will chase anything that moves fast in the hopes of racing it.", "78"),
            new Entry("Slowpoke", "Incredibly slow and dopey. It takes 5 seconds for it to feel pain when under attack", "79"),
            new Entry("Slowbro", "The Shellder that is latched onto Slowpoke's tail is said to feed on the host's left over scraps.", "80"),
            new Entry("Magnemite", "Uses anti-gravity to stay suspended. Appears without warning and uses Thunder Wave and similar moves.", "81"),
            new Entry("Magneton", "Formed by several Magnemites linked together. They frequently appear when sunspots flare up.", "82"),
            new Entry("Farfetch'd", "The sprig of green onions it holds is its weapon. It is used much like a metal sword.", "83"),
            new Entry("Doduo", "A bird that makes up for its poor flying with its fast foot speed. Leaves giant footprints.", "84"),
            new Entry("Dodrio", "Uses its three brains to execute complex plans. While two heads sleep, one head stays awake.", "85"),
            new Entry("Seel", "The protruding horn on its head is very hard. It is used for bashing through thick ice.", "86"),
            new Entry("Dewgong", "Stores thermal energy in its body. Swims at a steady 8 knots even in intensely cold waters.", "87"),
            new Entry("Grimer", "Appears in filthy areas. Thrives by sucking up polluted sludge that is pumped out of factories.", "88"),
            new Entry("Muk", "Thickly covered with a filthy, vile sludge. It is so toxic, even its footprints contain poison.", "89"),
            new Entry("Shelder", "Its hard shell repels any kind of attack. It is vulnerable only when its shell is open.", "90"),
            new Entry("Cloyster", "When attacked, it launches its horns in quick volleys. Its innards have never been seen.", "91"),
            new Entry("Gastly", "Almost invisible, this gaseous Pokémon cloaks the target and puts it to sleep without notice.", "92"),
            new Entry("Haunter", "Because of its ability to slip through block walls, it is said to be from another dimension.", "93"),
            new Entry("Gengar", "Under a full moon, this Pokémon likes to mimic the shadows of people and laugh at their fright.", "94"),
            new Entry("Onix", "As it grows, the stone portions of its body harden to become similar to a diamond, but colored black.", "95"),
            new Entry("Drowzee", "Puts enemies to sleep then eats their dreams. Occasionally gets sick from eating bad dreams.", "96"),
            new Entry("Hypno", "When it locks eyes with an enemy, it will use a mix of PSI moves such as Hypnosis and Confusion.", "97"),
            new Entry("Krabby", "Its pincers are not only powerful weapons, they are used for balance when walking sideways.", "98"),
            new Entry("Kingler", "The large pincer has 10000 hp of crushing power. However, its huge size makes it unwieldy to use.", "99"),
            new Entry("Voltorb", "Usually found in power plants. Easily mistaken for a Poké Ball, they have zapped many people.", "100"),
            new Entry("Electrode", "It stores electric energy under very high pressure. It often explodes with little or no provocation.", "101"),
            new Entry("Exeggcute", "Often mistaken for eggs. When disturbed, they quickly gather and attack in swarms.", "102"),
            new Entry("Exeggutor", "Legend has it that on rare occasions, one of its heads will drop off and continue on as an Exeggcute.", "103"),
            new Entry("Cubone", "Because it never removes its skull helmet, no one has ever seen this Pokémon's real face.", "104"),
            new Entry("Marowak", "The bone it holds is its key weapon. It throws the bone skillfully like a boomerang to KO targets.", "105"),
            new Entry("Hitmonlee", "When in a hurry, its legs lengthen progressively. It runs smoothly with extra long, loping strides.", "106"),
            new Entry("Hitmonchan", "While apparently doing nothing, it fires punches in lightning fast volleys that are impossible to see.", "107"),
            new Entry("Lickitung", "Its tongue can be extended like a chameleon's. It leaves a tingling sensation when it licks enemies.", "108"),
            new Entry("Koffing", "Because it stores several kinds of toxic gases in its body, it is prone to exploding without warning.", "109"),
            new Entry("Weezing", "Where two kinds of poison gases meet, 2 Koffings can fuse into a Weezing over many years.", "110"),
            new Entry("Rhyhorn", "Its massive bones are 1000 times harder than human bones. It can easily knock a trailer flying.", "111"),
            new Entry("Rhydon", "Protected by an armor-like hide, it is capable of living in molten lava of 3,600 degrees.", "112"),
            new Entry("Chansey", "A rare and elusive Pokémon that is said to bring happiness to those who manage to get it.", "113"),
            new Entry("Tangela", "The whole body is swathed with wide vines that are similar to seaweed. Its vines shake as it walks.", "114"),
            new Entry("Kangaskhan", "The infant rarely ventures out of its mother's protective pouch until it is 3 years old.", "115"),
            new Entry("Horsea", "Known to shoot down flying bugs with precision blasts of ink from the surface of the water.", "116"),
            new Entry("Seadra", "Capable of swimming backwards by rapidly flapping its wing-like pectoral fins and stout tail.", "117"),
            new Entry("Goldeen", "Its tail fin billows like an elegant ballroom dress, giving it the nickname of the Water Queen.", "118"),
            new Entry("Seaking", "In the autumn spawning season, they can be seen swimming powerfully up rivers and creeks.", "119"),
            new Entry("Staryu", "An enigmatic Pokémon that can effortlessly regenerate any appendage it loses in battle.", "120"),
            new Entry("Starmie", "Its central core glows with the seven colors of the rainbow. Some people value the core as a gem.", "121"),
            new Entry("Mr. mime", "If interrupted while it is miming, it will slap around the offender with its broad hands.", "122"),
            new Entry("Scyther", "With ninja-like agility and speed, it can create the illusion that there is more than one.", "123"),
            new Entry("Jynx", "It seductively wiggles its hips as it walks. It can cause people to dance in unison with it.", "124"),
            new Entry("Electabuzz", "Normally found near power plants, they can wander away and cause major blackouts in cities.", "125"),
            new Entry("Magmar", "Its body always burns with an orange glow that enables it to hide perfectly among flames.", "126"),
            new Entry("Pinsir", "If it fails to crush the victim in its pincers, it will swing it around and toss it hard.", "127"),
            new Entry("Tauros", "When it targets an enemy, it charges furiously while whipping its body with its long tails.", "128"),
            new Entry("Magikarp", "In the distant past, it was somewhat stronger than the horribly weak descendants that exist today.", "129"),
            new Entry("Gyarados", "Rarely seen in the wild. Huge and vicious, it is capable of destroying entire cities in a rage.", "130"),
            new Entry("Lapras", "A Pokémon that has been overhunted almost to extinction. It can ferry people across the water.", "131"),
            new Entry("Ditto", "Capable of copying an enemy's genetic code to instantly transform itself into a duplicate of the enemy.", "132"),
            new Entry("Eevee", "Its genetic code is irregular. It may mutate if it is exposed to radiation from element Stones.", "133"),
            new Entry("Vaporeon", "Lives close to water. Its long tail is ridged with a fin which is often mistaken for a mermaid's.", "134"),
            new Entry("Jolteon", "It accumulates negative ions in the atmosphere to blast out 10000-volt lightning bolts.", "135"),
            new Entry("Flareon", "When storing thermal energy in its body, its temperature could soar to over 1600 degrees.", "136"),
            new Entry("Porygon", "A Pokémon that consists entirely of programming code. Capable of moving freely in cyberspace.", "137"),
            new Entry("Omanyte", "Although long extinct, in rare cases, it can be genetically resurrected from fossils.", "138"),
            new Entry("Omastar", "A prehistoric Pokémon that died out when its heavy shell made it impossible to catch prey.", "139"),
            new Entry("Kabuto", "A Pokémon that was resurrected from a fossil found in what was once the ocean floor eons ago.", "140"),
            new Entry("Kabutops", "Its sleek shape is perfect for swimming. It slashes prey with its claws and drains the body fluids.", "141"),
            new Entry("Aerodactyl", "A ferocious, prehistoric Pokémon that goes for the enemy's throat with its serrated saw-like fangs", "142"),
            new Entry("Snorlax", "Very lazy. Just eats and sleeps. As its rotund bulk builds, it becomes steadily more slothful.", "143"),
            new Entry("Articuno", "A legendary bird Pokémon that is said to appear to doomed people who are lost in icy mountains.", "144"),
            new Entry("Zapados", "A legendary bird Pokémon that is said to appear from clouds while dropping enormous lightning bolts.", "145"),
            new Entry("Moltres", "Known as the legendary bird of fire. Every flap of its wings creates a dazzling flash of flames.", "146"),
            new Entry("Dratini", "Long considered a mythical Pokémon until recently when a small colony was found living underwater.", "147"),
            new Entry("Dragonair", "A mystical Pokémon that exudes a gentle aura. Has the ability to change climate conditions.", "148"),
            new Entry("Dragonite", "An extremely rarely seen marine Pokémon. Its intelligence is said to match that of humans.", "149"),
            new Entry("Mewtwo", "It was created by a scientist after years of horrific gene splicing and DNA engineering experiments.", "150"),
            new Entry("Mew", "So rare that it is still said to be a mirage by many experts. Only a few people have seen it worldwide.", "151"),

    };

    public Entry(String pokemonName, String dexEntry, String pokemonNumber) {
        name = pokemonName;
        dex = dexEntry;
        number = pokemonNumber;

    }

    public String getName() {
        return name;
    }

    public String getDex() {
        return dex;
    }

    public String getNumber() {return number;}


    public String toString() {
        return getName();
    }
}
