package fr.mildlyusefulsoftware.cutedolphins.activity;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.util.Log;
import fr.mildlyusefulsoftware.imageviewer.service.DatabaseHelper;
import fr.mildlyusefulsoftware.imageviewer.service.Picture;

public class ViewPictureActivity extends fr.mildlyusefulsoftware.imageviewer.activity.ViewPictureActivity {

	@Override
	protected String getAdMobId() {
		return "a14ff838df97bce";
	}

	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//putNewPictures();
	}
	
	private void putNewPictures(){
		String[] url =new String[]{
		"http://cache2.allpostersimages.com/p/LRG/15/1543/LMQBD00Z/affiches/himani-dolphin-kiss.jpg",
		"http://2.bp.blogspot.com/-nXptOjeKhcY/TWB634HXuTI/AAAAAAAAA6A/lJpWXSGGVEI/s1600/Dolphin.jpg",
		"http://4.bp.blogspot.com/-HkWZ7Adg9PU/TukasM-8jbI/AAAAAAAADFQ/0WHIFnDXueA/s1600/bottlenose-dolphin-picture-2-480.jpeg",
		"http://www.fond-ecran-gratuit.biz/data/media/360/Dolphin_10.jpg",
		"http://jkdolphin.j.k.pic.centerblog.net/o/cd05ceca.jpg",
		"http://www.follybeach.com/Dolphin-face.jpg",
		"http://1.bp.blogspot.com/-wklhu2wiPOk/TWB649Y0b4I/AAAAAAAAA6E/P5neLbTlRCQ/s1600/dolphinn.jpg",
		"http://www.answersingenesis.org/assets/images/articles/aqua/Bottlenose_Dolphin.jpg",
		"http://www.saildolphincruises.com/assets/2009/private_charters/dolphins-poster-l.jpg",
		"http://2.bp.blogspot.com/-PSWWcf56n8U/TWB650Y-THI/AAAAAAAAA6I/Z_BcypgsLCw/s1600/dolphinp.jpg",
		"http://animal.discovery.com/mammals/dolphin/pictures/dolphin-picture.jpg",
		"http://www.dolphinheartworld.com/images/dolphin_facing.jpg",
		"http://www.infj.com/DelphinusCrunch2.jpg",
		"http://www.jigzone.com/p/jz/cbx/Dolphin.jpg",
		"http://images.yourdictionary.com/images/definitions/lg/dolphin.jpg",
		"http://oceanworld.org.uk/wp-content/uploads/2012/04/Dolphin.jpg",
		"http://myecoaction.com/wp-content/uploads/2010/03/dolphin-cruelty.jpg",
		"http://www.animalpictures1.com/data/media/51/dolphin-4.jpg",
		"http://www.calacademy.org/sciencetoday/wp-content/uploads/2010/02/DolphinCayusa.jpg",
		"http://www.thewallpapers.org/wallpapers/2/261/thumb/600_dolphin-jumping.jpg",
		"http://w3.shorecrest.org/~Lisa_Peck/MarineBio/syllabus/ch9vertebrates/mammals/mammalwp/class_of_2005/alexw/Dolphin-m.jpg",
		"http://www.cbc.ca/documentaries/doczone/2008/dolphindealer/gfx/dolphindealer_title.jpg",
		"http://cache2.artprintimages.com/lrg/29/2912/A3PPD00Z.jpg",
		"http://news.discovery.com/animals/2010/01/22/dolphin-278x225.jpg",
		"http://www.pieway.com/wp-content/uploads/2012/02/Chinese-River-Dolphin.gif",
		"http://www.sharmelsheikhexcursions.com/sharmelsheikhtours/img/p/127-195-large.jpg",
		"http://www.oxfordschoolblogs.co.uk/psychcompanion/blog/wp-content/uploads/2009/09/dolphin.jpg",
		"http://www.prijatelji-zivotinja.hr/data/image_2_2933.jpg",
		"http://www.deviantart.com/download/38398680/Dolphin_by_JTDOeNVK.jpg",
		"http://www.dolphins-world.com/images/dolphin_picture_2.jpg",
		"http://3.bp.blogspot.com/-OGn49Al5rM4/TWPoJNCBnEI/AAAAAAAAA8s/IECIIoOHEzg/s1600/p4672pc.jpg",
		"http://static.guim.co.uk/sys-images/Environment/Pix/pictures/2009/7/30/1248957236659/dolphins-rampant-001.jpg",
		"http://www.talismancoins.com/catalog/Dolphin.jpg",
		"http://www.eaglewingtours.com/userimages/Image/dolphin.jpg",
		"http://www.dolphins-world.com/images/bottlenose_dolphin_picture.jpg",
		"http://petcaregt.com/blog/wp-content/uploads/2008/11/common-dolphin.jpg",
		"http://www.molon.de/galleries/Singapore/Sentosa/images01/17%20Dolphin%20show.jpg",
		"http://barrybland.typepad.com/my_weblog/images/2008/08/22/dolphin_bubbles_19.jpg",
		"http://www.moonshadow.com.au/photographs/210406144907dolphin_common.jpg",
		"http://images3.wikia.nocookie.net/__cb20070212085230/uncyclopedia/images/7/73/Dolphin_Jumping.jpg"
		};
		int i=40;
		List<Picture> pictures=new ArrayList<Picture>();
		for (int j=0;j<url.length;j++){
			try {
				Log.i("cutedolphins",url[j]);
				Picture p = new Picture(j+i, url[j],Picture.getPictureThumbnail(url[j]));
				pictures.add(p);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		DatabaseHelper.connect(this).putPictures(pictures);
	}


}
