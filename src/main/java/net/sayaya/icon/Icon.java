package net.sayaya.icon;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.Scheduler;
import com.google.gwt.dom.client.Element;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.user.client.ui.HTML;

public class Icon extends HTML {
	private static final Resource RESOURCE = GWT.create(Resource.class);
	public static final Resource.Style GSS = RESOURCE.style();

	static {
		RESOURCE.style().ensureInjected();
	}

	private String code = null;
	private String style = null;

	public Icon() {
		setStyleName(Resource.instance.style().icon());
	}

	public Icon(String icon) {
		this();
		setIcon(icon);
	}

	public static Icon create(String gss) {
		return new Icon(gss);
	}

	public native static String getCode(Element em) /*-{
		return $wnd.getComputedStyle(em, ':before').getPropertyValue("content");
	}-*/;

	public String getCode() {
		return code;
	}

	public String getIcon() {
		return style;
	}

	public Icon setIcon(String icon) {
		if (style != null) removeStyleName(style);
		if (icon != null) {
			addStyleName(icon);
			addAttachHandler(evt -> {
				if (!evt.isAttached()) return;
				Scheduler.get().scheduleDeferred(() -> code = getCode(getElement()).replace("\"", ""));
			});
		}
		style = icon;
		return this;
	}

	public interface Resource extends ClientBundle {
		Resource instance = GWT.create(Resource.class);

		@Source("Icon.gss")
		Style style();

		interface Style extends CssResource {
			String icon();

			String regular();

			String light();

			String solid();

			@ClassName("align-center")
			String alignCenter();

			@ClassName("align-justify")
			String alignJustify();

			@ClassName("align-left")
			String alignLeft();

			@ClassName("align-right")
			String alignRight();

			String asterisk();

			String at();

			String atlas();

			String atom();

			@ClassName("atom-alt")
			String atomAlt();

			String award();

			String ban();

			String barcode();

			@ClassName("barcode-alt")
			String barcodeAlt();

			@ClassName("barcode-read")
			String barcodeRead();

			@ClassName("barcode-scan")
			String barcodeScan();

			String blog();

			String bold();

			String bong();

			String box();

			@ClassName("box-check")
			String boxCheck();

			String boxes();

			String calendar();

			@ClassName("calendar-alt")
			String calendarAlt();

			@ClassName("calendar-check")
			String calendarCheck();

			@ClassName("calendar-edit")
			String calendarEdit();

			@ClassName("calendar-exclamation")
			String calendarExclamation();

			@ClassName("calendar-minus")
			String calendarMinus();

			@ClassName("calendar-plus")
			String calendarPlus();

			@ClassName("calendar-times")
			String calendarTimes();

			@ClassName("caret-circle-down")
			String caretCircleDown();

			@ClassName("caret-circle-left")
			String caretCircleLeft();

			@ClassName("caret-circle-right")
			String caretCircleRight();

			@ClassName("caret-circle-up")
			String caretCircleUp();

			@ClassName("caret-down")
			String caretDown();

			@ClassName("caret-left")
			String caretLeft();

			@ClassName("caret-right")
			String caretRight();

			@ClassName("caret-up")
			String caretUp();

			@ClassName("caret-square-down")
			String caretSquareDown();

			@ClassName("caret-square-left")
			String caretSquareLeft();

			@ClassName("caret-square-right")
			String caretSquareRight();

			@ClassName("caret-square-up")
			String caretSquareUp();

			@ClassName("cart-arrow-down")
			String cartArrowDown();

			@ClassName("cart-plus")
			String cartPlus();

			@ClassName("check")
			String check();

			@ClassName("check-circle")
			String checkCircle();

			@ClassName("check-square")
			String checkSquare();

			@ClassName("chevron-double-down")
			String chevronDoubleDown();

			@ClassName("chevron-double-left")
			String chevronDoubleLeft();

			@ClassName("chevron-double-right")
			String chevronDoubleRight();

			@ClassName("chevron-double-up")
			String chevronDoubleUp();

			@ClassName("chevron-down")
			String chevronDown();

			@ClassName("chevron-left")
			String chevronLeft();

			@ClassName("chevron-right")
			String chevronRight();

			@ClassName("chevron-up")
			String chevronUp();

			String circle();

			String clipboard();

			@ClassName("clipboard-check")
			String clipboardCheck();

			@ClassName("clipboard-list")
			String clipboardList();

			String clone();

			@ClassName("cloud-download")
			String cloudDownload();

			@ClassName("cloud-download-alt")
			String cloudDownloadAlt();

			String code();

			String cog();

			String cogs();

			String columns();

			String comment();

			@ClassName("comment-alt")
			String commentAlt();

			String compress();

			@ClassName("compress-arrows-alt")
			String compressArrowsAlt();

			String copy();

			String cut();

			String dna();

			String edit();

			@ClassName("ellipsis-h")
			String ellipsisH();

			@ClassName("ellipsis-v")
			String ellipsisV();

			String envelope();

			@ClassName("envelope-open")
			String envelopeOpen();

			String eraser();

			String exclamation();

			@ClassName("exclamation-triangle")
			String exclamationTriangle();

			@ClassName("exclamation-square")
			String exclamationSquare();

			@ClassName("exclamation-circle")
			String exclamationCircle();

			String expand();

			@ClassName("expand-arrows")
			String expandArrows();

			@ClassName("expand-arrows-alt")
			String expandArrowsAlt();

			@ClassName("eye-dropper")
			String eyeDropper();

			@ClassName("file")
			String file();

			@ClassName("file-alt")
			String fileAlt();

			@ClassName("file-download")
			String fileDownload();

			@ClassName("file-excel")
			String fileExcel();

			@ClassName("file-invoice")
			String fileInvoice();

			@ClassName("file-medical")
			String fileMedical();

			@ClassName("file-medical-alt")
			String fileMedicalAlt();

			@ClassName("file-pdf")
			String filePdf();

			@ClassName("file-plus")
			String filePlus();

			String filter();

			String font();

			String glasses();

			String globe();

			String h1();

			String h2();

			String h3();

			@ClassName("hand-holding-box")
			String handHoldingBox();

			String hashtag();

			String heading();

			String heart();

			String highlighter();

			String home();

			@ClassName("i-cursor")
			String iCursor();

			@ClassName("id-badge")
			String idBadge();

			@ClassName("id-card")
			String idCard();

			@ClassName("id-card-alt")
			String idCardAlt();

			String image();

			String images();

			String indent();

			String info();

			@ClassName("info-square")
			String infoSquare();

			@ClassName("info-circle")
			String infoCircle();

			String italic();

			String key();

			@ClassName("layer-group")
			String layerGroup();

			@ClassName("layer-plus")
			String layerPlus();

			@ClassName("layer-minus")
			String layerMinus();

			String link();

			String list();

			@ClassName("list-alt")
			String listAlt();

			@ClassName("list-ol")
			String listOl();

			@ClassName("list-ul")
			String listUl();

			String lock();

			@ClassName("lock-alt")
			String lockAlt();

			@ClassName("lock-open")
			String lockOpen();

			@ClassName("lock-open-alt")
			String lockOpenAlt();

			String marker();

			String microscope();

			@ClassName("mortar-pestle")
			String mortarPestle();

			String outdent();

			String palette();

			@ClassName("paper-plane")
			String paperPlane();

			String paperclip();

			String paragraph();

			String paste();

			String pause();

			@ClassName("pause-circle")
			String pauseCircle();

			String pen();

			@ClassName("pen-alt")
			String penAlt();

			@ClassName("pen-fancy")
			String penFancy();

			@ClassName("pen-nib")
			String penNib();

			String pencil();

			String play();

			@ClassName("play-circle")
			String playCircle();

			String plus();

			@ClassName("plus-circle")
			String plusCircle();

			String prescription();

			@ClassName("prescription-bottle")
			String prescriptionBottle();

			@ClassName("prescription-bottle-alt")
			String prescriptionBottleAlt();

			String print();

			@ClassName("puzzle-piece")
			String puzzlePiece();

			@ClassName("quote-left")
			String quoteLeft();

			@ClassName("quote-right")
			String quoteRight();

			String redo();

			@ClassName("redo-alt")
			String redoAlt();

			String repeat();

			@ClassName("repeat-alt")
			String repeatAlt();

			String reply();

			@ClassName("reply-alt")
			String replyAlt();

			String rss();

			@ClassName("rss-square")
			String rssSquare();

			String save();

			String search();

			String scanner();

			@ClassName("scanner-keyboard")
			String scannerKeyboard();

			@ClassName("scanner-touchscreen")
			String scannerTouchscreen();

			String share();

			@ClassName("share-all")
			String shareAll();

			@ClassName("share-alt")
			String shareAlt();

			@ClassName("share-square")
			String shareSquare();

			@ClassName("share-alt-square")
			String shareAltSquare();

			@ClassName("shopping-bag")
			String shoppingBag();

			@ClassName("shopping-basket")
			String shoppingBasket();

			@ClassName("shopping-cart")
			String shoppingCart();

			@ClassName("sign-in")
			String signoIn();

			@ClassName("sign-in-alt")
			String signoInAlt();

			@ClassName("sign-out")
			String signoOut();

			@ClassName("sign-out-alt")
			String signoOutAlt();

			String sitemap();

			String square();

			String stop();

			@ClassName("stop-circle")
			String stopCircle();

			@ClassName("step-backward")
			String stepBackward();

			@ClassName("step-forward")
			String stepForward();

			String strikethrough();

			String subscript();

			String superscript();

			String sync();

			@ClassName("sync-alt")
			String syncAlt();

			String table();

			String tag();

			String tags();

			String tasks();

			@ClassName("text-height")
			String textHeight();

			@ClassName("text-width")
			String textWidth();

			String th();

			@ClassName("th-large")
			String thLarge();

			@ClassName("th-list")
			String thList();

			String thumbtack();

			String tools();

			String toolbox();

			String trash();

			@ClassName("trash-alt")
			String trashAlt();

			@ClassName("times")
			String times();

			@ClassName("times-circle")
			String timesCircle();

			@ClassName("times-square")
			String timesSquare();

			String underline();

			String undo();

			@ClassName("undo-alt")
			String undoAlt();

			String unlock();

			@ClassName("unlock-alt")
			String unlockAlt();

			String unlink();

			String user();

			@ClassName("user-chart")
			String userChart();

			@ClassName("user-circle")
			String userCircle();

			@ClassName("user-class")
			String userClass();

			@ClassName("user-lock")
			String userLock();

			@ClassName("user-tag")
			String userTag();

			String vial();

			String vials();

			String wranch();
		}
	}
}
