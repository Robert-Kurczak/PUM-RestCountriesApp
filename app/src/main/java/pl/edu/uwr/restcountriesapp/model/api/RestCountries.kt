package pl.edu.uwr.restcountriesapp.model.api

class RestCountries : ArrayList<RestCountriesItem>()

data class RestCountriesItem(
    val altSpellings: List<String>,
    val capital: List<String>,
    val flag: String,
    val name: Name
)

data class Name(
    val common: String,
    val nativeName: NativeName,
    val official: String
)

data class NativeName(
    val afr: Afr,
    val amh: Amh,
    val ara: Ara,
    val arc: Arc,
    val aym: Aym,
    val aze: Aze,
    val bar: Bar,
    val bel: Bel,
    val ben: Ben,
    val ber: Ber,
    val bis: Bis,
    val bjz: Bjz,
    val bos: Bos,
    val bul: Bul,
    val bwg: Bwg,
    val cal: Cal,
    val cat: Cat,
    val ces: Ces,
    val cha: Cha,
    val ckb: Ckb,
    val cnr: Cnr,
    val crs: Crs,
    val dan: Dan,
    val deu: Deu,
    val div: Div,
    val dzo: Dzo,
    val ell: Ell,
    val eng: Eng,
    val est: Est,
    val fao: Fao,
    val fas: Fas,
    val fij: Fij,
    val fil: Fil,
    val fin: Fin,
    val fra: Fra,
    val gil: Gil,
    val gle: Gle,
    val glv: Glv,
    val grn: Grn,
    val gsw: Gsw,
    val hat: Hat,
    val heb: Heb,
    val her: Her,
    val hgm: Hgm,
    val hif: Hif,
    val hin: Hin,
    val hmo: Hmo,
    val hrv: Hrv,
    val hun: Hun,
    val hye: Hye,
    val ind: Ind,
    val isl: Isl,
    val ita: Ita,
    val jam: Jam,
    val jpn: Jpn,
    val kal: Kal,
    val kat: Kat,
    val kaz: Kaz,
    val kck: Kck,
    val khi: Khi,
    val khm: Khm,
    val kin: Kin,
    val kir: Kir,
    val kon: Kon,
    val kor: Kor,
    val kwn: Kwn,
    val lao: Lao,
    val lat: Lat,
    val lav: Lav,
    val lin: Lin,
    val lit: Lit,
    val loz: Loz,
    val ltz: Ltz,
    val lua: Lua,
    val mah: Mah,
    val mey: Mey,
    val mfe: Mfe,
    val mkd: Mkd,
    val mlg: Mlg,
    val mlt: Mlt,
    val mon: Mon,
    val mri: Mri,
    val msa: Msa,
    val mya: Mya,
    val nau: Nau,
    val nbl: Nbl,
    val ndc: Ndc,
    val nde: Nde,
    val ndo: Ndo,
    val nep: Nep,
    val nfr: Nfr,
    val niu: Niu,
    val nld: Nld,
    val nno: Nno,
    val nob: Nob,
    val nor: Nor,
    val nrf: Nrf,
    val nso: Nso,
    val nya: Nya,
    val nzs: Nzs,
    val pap: Pap,
    val pau: Pau,
    val pih: Pih,
    val pol: Pol,
    val por: Por,
    val pov: Pov,
    val prs: Prs,
    val pus: Pus,
    val que: Que,
    val rar: Rar,
    val roh: Roh,
    val ron: Ron,
    val run: Run,
    val rus: Rus,
    val sag: Sag,
    val sin: Sin,
    val slk: Slk,
    val slv: Slv,
    val smi: Smi,
    val smo: Smo,
    val sna: Sna,
    val som: Som,
    val sot: Sot,
    val spa: Spa,
    val sqi: Sqi,
    val srp: Srp,
    val ssw: Ssw,
    val swa: Swa,
    val swe: Swe,
    val tam: Tam,
    val tet: Tet,
    val tgk: Tgk,
    val tha: Tha,
    val tir: Tir,
    val tkl: Tkl,
    val toi: Toi,
    val ton: Ton,
    val tpi: Tpi,
    val tsn: Tsn,
    val tso: Tso,
    val tuk: Tuk,
    val tur: Tur,
    val tvl: Tvl,
    val ukr: Ukr,
    val urd: Urd,
    val uzb: Uzb,
    val ven: Ven,
    val vie: Vie,
    val xho: Xho,
    val zdj: Zdj,
    val zho: Zho,
    val zib: Zib,
    val zul: Zul
)

data class Afr(
    val common: String,
    val official: String
)

data class Amh(
    val common: String,
    val official: String
)

data class Ara(
    val common: String,
    val official: String
)

data class Arc(
    val common: String,
    val official: String
)

data class Aym(
    val common: String,
    val official: String
)

data class Aze(
    val common: String,
    val official: String
)

data class Bar(
    val common: String,
    val official: String
)

data class Bel(
    val common: String,
    val official: String
)

data class Ben(
    val common: String,
    val official: String
)

data class Ber(
    val common: String,
    val official: String
)

data class Bis(
    val common: String,
    val official: String
)

data class Bjz(
    val common: String,
    val official: String
)

data class Bos(
    val common: String,
    val official: String
)

data class Bul(
    val common: String,
    val official: String
)

data class Bwg(
    val common: String,
    val official: String
)

data class Cal(
    val common: String,
    val official: String
)

data class Cat(
    val common: String,
    val official: String
)

data class Ces(
    val common: String,
    val official: String
)

data class Cha(
    val common: String,
    val official: String
)

data class Ckb(
    val common: String,
    val official: String
)

data class Cnr(
    val common: String,
    val official: String
)

data class Crs(
    val common: String,
    val official: String
)

data class Dan(
    val common: String,
    val official: String
)

data class Deu(
    val common: String,
    val official: String
)

data class Div(
    val common: String,
    val official: String
)

data class Dzo(
    val common: String,
    val official: String
)

data class Ell(
    val common: String,
    val official: String
)

data class Eng(
    val common: String,
    val official: String
)

data class Est(
    val common: String,
    val official: String
)

data class Fao(
    val common: String,
    val official: String
)

data class Fas(
    val common: String,
    val official: String
)

data class Fij(
    val common: String,
    val official: String
)

data class Fil(
    val common: String,
    val official: String
)

data class Fin(
    val common: String,
    val official: String
)

data class Fra(
    val common: String,
    val official: String
)

data class Gil(
    val common: String,
    val official: String
)

data class Gle(
    val common: String,
    val official: String
)

data class Glv(
    val common: String,
    val official: String
)

data class Grn(
    val common: String,
    val official: String
)

data class Gsw(
    val common: String,
    val official: String
)

data class Hat(
    val common: String,
    val official: String
)

data class Heb(
    val common: String,
    val official: String
)

data class Her(
    val common: String,
    val official: String
)

data class Hgm(
    val common: String,
    val official: String
)

data class Hif(
    val common: String,
    val official: String
)

data class Hin(
    val common: String,
    val official: String
)

data class Hmo(
    val common: String,
    val official: String
)

data class Hrv(
    val common: String,
    val official: String
)

data class Hun(
    val common: String,
    val official: String
)

data class Hye(
    val common: String,
    val official: String
)

data class Ind(
    val common: String,
    val official: String
)

data class Isl(
    val common: String,
    val official: String
)

data class Ita(
    val common: String,
    val official: String
)

data class Jam(
    val common: String,
    val official: String
)

data class Jpn(
    val common: String,
    val official: String
)

data class Kal(
    val common: String,
    val official: String
)

data class Kat(
    val common: String,
    val official: String
)

data class Kaz(
    val common: String,
    val official: String
)

data class Kck(
    val common: String,
    val official: String
)

data class Khi(
    val common: String,
    val official: String
)

data class Khm(
    val common: String,
    val official: String
)

data class Kin(
    val common: String,
    val official: String
)

data class Kir(
    val common: String,
    val official: String
)

data class Kon(
    val common: String,
    val official: String
)

data class Kor(
    val common: String,
    val official: String
)

data class Kwn(
    val common: String,
    val official: String
)

data class Lao(
    val common: String,
    val official: String
)

data class Lat(
    val common: String,
    val official: String
)

data class Lav(
    val common: String,
    val official: String
)

data class Lin(
    val common: String,
    val official: String
)

data class Lit(
    val common: String,
    val official: String
)

data class Loz(
    val common: String,
    val official: String
)

data class Ltz(
    val common: String,
    val official: String
)

data class Lua(
    val common: String,
    val official: String
)

data class Mah(
    val common: String,
    val official: String
)

data class Mey(
    val common: String,
    val official: String
)

data class Mfe(
    val common: String,
    val official: String
)

data class Mkd(
    val common: String,
    val official: String
)

data class Mlg(
    val common: String,
    val official: String
)

data class Mlt(
    val common: String,
    val official: String
)

data class Mon(
    val common: String,
    val official: String
)

data class Mri(
    val common: String,
    val official: String
)

data class Msa(
    val common: String,
    val official: String
)

data class Mya(
    val common: String,
    val official: String
)

data class Nau(
    val common: String,
    val official: String
)

data class Nbl(
    val common: String,
    val official: String
)

data class Ndc(
    val common: String,
    val official: String
)

data class Nde(
    val common: String,
    val official: String
)

data class Ndo(
    val common: String,
    val official: String
)

data class Nep(
    val common: String,
    val official: String
)

data class Nfr(
    val common: String,
    val official: String
)

data class Niu(
    val common: String,
    val official: String
)

data class Nld(
    val common: String,
    val official: String
)

data class Nno(
    val common: String,
    val official: String
)

data class Nob(
    val common: String,
    val official: String
)

data class Nor(
    val common: String,
    val official: String
)

data class Nrf(
    val common: String,
    val official: String
)

data class Nso(
    val common: String,
    val official: String
)

data class Nya(
    val common: String,
    val official: String
)

data class Nzs(
    val common: String,
    val official: String
)

data class Pap(
    val common: String,
    val official: String
)

data class Pau(
    val common: String,
    val official: String
)

data class Pih(
    val common: String,
    val official: String
)

data class Pol(
    val common: String,
    val official: String
)

data class Por(
    val common: String,
    val official: String
)

data class Pov(
    val common: String,
    val official: String
)

data class Prs(
    val common: String,
    val official: String
)

data class Pus(
    val common: String,
    val official: String
)

data class Que(
    val common: String,
    val official: String
)

data class Rar(
    val common: String,
    val official: String
)

data class Roh(
    val common: String,
    val official: String
)

data class Ron(
    val common: String,
    val official: String
)

data class Run(
    val common: String,
    val official: String
)

data class Rus(
    val common: String,
    val official: String
)

data class Sag(
    val common: String,
    val official: String
)

data class Sin(
    val common: String,
    val official: String
)

data class Slk(
    val common: String,
    val official: String
)

data class Slv(
    val common: String,
    val official: String
)

data class Smi(
    val common: String,
    val official: String
)

data class Smo(
    val common: String,
    val official: String
)

data class Sna(
    val common: String,
    val official: String
)

data class Som(
    val common: String,
    val official: String
)

data class Sot(
    val common: String,
    val official: String
)

data class Spa(
    val common: String,
    val official: String
)

data class Sqi(
    val common: String,
    val official: String
)

data class Srp(
    val common: String,
    val official: String
)

data class Ssw(
    val common: String,
    val official: String
)

data class Swa(
    val common: String,
    val official: String
)

data class Swe(
    val common: String,
    val official: String
)

data class Tam(
    val common: String,
    val official: String
)

data class Tet(
    val common: String,
    val official: String
)

data class Tgk(
    val common: String,
    val official: String
)

data class Tha(
    val common: String,
    val official: String
)

data class Tir(
    val common: String,
    val official: String
)

data class Tkl(
    val common: String,
    val official: String
)

data class Toi(
    val common: String,
    val official: String
)

data class Ton(
    val common: String,
    val official: String
)

data class Tpi(
    val common: String,
    val official: String
)

data class Tsn(
    val common: String,
    val official: String
)

data class Tso(
    val common: String,
    val official: String
)

data class Tuk(
    val common: String,
    val official: String
)

data class Tur(
    val common: String,
    val official: String
)

data class Tvl(
    val common: String,
    val official: String
)

data class Ukr(
    val common: String,
    val official: String
)

data class Urd(
    val common: String,
    val official: String
)

data class Uzb(
    val common: String,
    val official: String
)

data class Ven(
    val common: String,
    val official: String
)

data class Vie(
    val common: String,
    val official: String
)

data class Xho(
    val common: String,
    val official: String
)

data class Zdj(
    val common: String,
    val official: String
)

data class Zho(
    val common: String,
    val official: String
)

data class Zib(
    val common: String,
    val official: String
)

data class Zul(
    val common: String,
    val official: String
)