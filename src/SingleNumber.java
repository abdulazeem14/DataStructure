import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static void main(String args[]) {
        int nums[]={2,3,2,3,9};
        int result=singleNumber(nums);
        System.out.println(result);

    }
    public static int singleNumber (int[] nums){
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else{
                hm.put(nums[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> map:hm.entrySet()){
            int key=map.getKey();
            int val=map.getValue();
            if(val==1){
                return key;
            }
        }
        return -1;

    }
//    public static void testTreeView() {
//        enterEditFieldValue(VA03SapObjectRepo.documentNum, "6133866587");
//        clickButton(VA03SapObjectRepo.displayDocumentFlowButton);
//        TreeView object = VA03SapObjectRepo.documentFlowTree;
//        TreeViewNode treeViewNode = null;
//        String nodepath = null;
//        boolean flag = false;
//        try {
//            nodepath = object.buildNodePath(1, 1, 5, 2);
//            treeViewNode = object.getNode(nodepath);
//            object.selectNode(treeViewNode);
//            flag = object.getSelectedNodePath().contains("6133878846");
//            ArrayList<String> arr = new ArrayList<>(Arrays.asList("6133880645", "6637254328"));
//            int j = 0;
//            while (flag && j < arr.size()) {
//                int i = 1;
//                nodepath = object.buildNodePath(nodepath, i);
//                treeViewNode = object.getNode(nodepath);
//                object.selectNode(treeViewNode);
//                object.getNode("").getPath();
//                if (!object.getSelectedNodePath().contains(arr.get(j))) {
//                    flag = false;
//                }
//                j++;
//            }
//
//        } catch (GeneralLeanFtException e) {
//            e.printStackTrace();
//        }
//
////        String delivery = "Delivery ";
////        delivery.concat(getTestDataRead().get(TestData.ASN_DELIVERY));
////        TreeView object = VA03SapObjectRepo.documentFlowTree;
////        TreeViewNode treeViewNode = null;
////        String nodePath = null;
////        String status = null;
////        NativeObject statusVal = null;
////        try {
////            status = object.getNativeObject().invokeMethod("GetColumnHeaders", NativeObject.class).getItem(String.class,
////                    3);
////            statusVal = object.getNativeObject().invokeMethod("GetColumnCol", NativeObject.class, status);
////        } catch (Exception e) {
////            LOGGER.error(getExceptionName(), e);
////        }
////        int j = 2;
////        for (int i = 1; i < j; i++) {
////            try {
////                nodePath = object.buildNodePath(1, i);
////                treeViewNode = object.getNode(nodePath);
////                object.selectNode(treeViewNode);
////                String nodeVal = object.getSelectedNodePath();
////                if (nodeVal.contains(delivery)) {
////                    String val = statusVal.getItem(String.class, i);
////                    validateAssert(val.equalsIgnoreCase(verifyStatus), "failed object");
////                    break;
////                }
////            } catch (GeneralLeanFtException e) {
////                objectFailed(e);
////            }
////            j++;
////        }
//
//
//    }
//
//    public static void testTreeViewcommon() {
//        enterEditFieldValue(VA03SapObjectRepo.documentNum, "6133866587");
//        clickButton(VA03SapObjectRepo.displayDocumentFlowButton);
//        TreeView object = VA03SapObjectRepo.documentFlowTree;
//        TreeViewNode treeViewNode = null;
//        String nodepath = null;
//        boolean flag = false;
//        String nodePath = null;
//        boolean returnAuth, returnOrder, returnDel;
//        returnAuth = returnOrder = returnDel = false;
//        int index = 0;
//        try {
//
//            nodepath = object.buildNodePath(1, 1, 5);
//            treeViewNode = object.getNode(nodepath);
//            object.selectNode(treeViewNode);
//
//            try {
//                while (true) {
//                    index++;
//                    String nodes = object.buildNodePath(nodepath, index);
//                    treeViewNode = object.getNode(nodes);
//                    object.selectNode(treeViewNode);
//                    if (object.getSelectedNodePath().contains("6133878846")) {
//                        returnAuth = true;
//                        nodePath = object.buildNodePath(nodePath, 1);
//                        treeViewNode = object.getNode(nodePath);
//                        object.selectNode(treeViewNode);
//                        returnOrder = object.getSelectedNodePath().contains("6133880645");
//                        if (!returnOrder) {
//                            break;
//                        }
//                        clickButton(VA03SapObjectRepo.displayDocumentButton);
//                        selectTabControl(VA03SapObjectRepo.tabSalesOrder, "AFS Item overview");
//                        validateAssert(VA03SapObjectRepo.tableControl.getRows().get(0).getCells().get(3).getValue().equals("GM0317"), "Object failed");
//                        clickButton(GenericSapObjectRepo.backButton);
//                        nodePath = object.buildNodePath(nodePath, 1);
//                        treeViewNode = object.getNode(nodePath);
//                        object.selectNode(treeViewNode);
//                        returnDel = object.getSelectedNodePath().contains("6637254328");
//                        break;
//                    }
//                }
//                validateAssert(returnAuth && returnDel && returnOrder, "object failed");
//            } catch (GeneralLeanFtException e) {
//                validateAssert(false, "return order not found");
//            }
//
//        } catch (GeneralLeanFtException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//    public static void treeviewtest() {
//        try {
//            enterEditFieldValue(VA03SapObjectRepo.documentNum, "6133866587");
//            clickButton(VA03SapObjectRepo.displayDocumentFlowButton);
//            TreeView object = VA03SapObjectRepo.documentFlowTree;
//            String path = object.buildNodePath("Global Return Order 6133880645");
//            TreeViewNode tn = object.getNode(new Regex(".*" + path).toString());
//            String s = new Regex(".*" + path).toString();
//            String nodepath = null;//object.buildNodePath(new Regex(".*"+path));
////            System.out.println(nodepath);
//            nodepath = object.buildNodePath(new RegExpProperty(".*Global Return Order 6133880645"));
//            System.out.println("a:" + nodepath);
//            object.selectNode(nodepath);
//        } catch (GeneralLeanFtException e) {
//            objectFailed(e);
//        }
//
//
//    }

}

