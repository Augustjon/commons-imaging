/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.sanselan.formats.tiff.constants;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.commons.sanselan.formats.tiff.taginfos.TagInfo;
import org.apache.commons.sanselan.formats.tiff.taginfos.TagInfoAny;
import org.apache.commons.sanselan.formats.tiff.taginfos.TagInfoAscii;
import org.apache.commons.sanselan.formats.tiff.taginfos.TagInfoByte;
import org.apache.commons.sanselan.formats.tiff.taginfos.TagInfoByteOrShort;
import org.apache.commons.sanselan.formats.tiff.taginfos.TagInfoDouble;
import org.apache.commons.sanselan.formats.tiff.taginfos.TagInfoFloat;
import org.apache.commons.sanselan.formats.tiff.taginfos.TagInfoGpsText;
import org.apache.commons.sanselan.formats.tiff.taginfos.TagInfoLong;
import org.apache.commons.sanselan.formats.tiff.taginfos.TagInfoRational;
import org.apache.commons.sanselan.formats.tiff.taginfos.TagInfoSLong;
import org.apache.commons.sanselan.formats.tiff.taginfos.TagInfoSRational;
import org.apache.commons.sanselan.formats.tiff.taginfos.TagInfoSShort;
import org.apache.commons.sanselan.formats.tiff.taginfos.TagInfoShort;
import org.apache.commons.sanselan.formats.tiff.taginfos.TagInfoShortOrLong;
import org.apache.commons.sanselan.formats.tiff.taginfos.TagInfoShortOrLongOrRational;
import org.apache.commons.sanselan.formats.tiff.taginfos.TagInfoShortOrRational;
import org.apache.commons.sanselan.formats.tiff.taginfos.TagInfoUndefined;
import org.apache.commons.sanselan.formats.tiff.taginfos.TagInfoUnknown;
import org.apache.commons.sanselan.formats.tiff.taginfos.TagInfoXpString;

/**
 * References:
 * http://www.sno.phy.queensu.ca/~phil/exiftool/TagNames/EXIF.html
 * http://tiki-lounge.com/~raf/tiff/fields.html
 * http://www.awaresystems.be/imaging/tiff/tifftags.html
 * http://cool.conservation-us.org/bytopic/imaging/std/tiff-f.html
 * 
 * DNG: http://wwwimages.adobe.com/www.adobe.com/content/dam/Adobe/en/products/photoshop/pdfs/dng_spec.pdf
 * 
 * "Stonits": http://www.anyhere.com/gward/pixformat/tiffluv.html
 * Alias Sketchbook Pro multi-layer TIFF: http://www.awaresystems.be/imaging/tiff/tifftags/docs/alias.html
 */
public interface ExifTagConstants
        extends
            TiffFieldTypeConstants
{
    public static final TagInfoAscii EXIF_TAG_INTEROP_INDEX = new TagInfoAscii(
            "Interop Index", 0x0001, 1,
            TiffDirectoryType.EXIF_DIRECTORY_INTEROP_IFD);
    public static final TagInfoUndefined EXIF_TAG_INTEROP_VERSION = new TagInfoUndefined(
            "Interop Version", 0x0002, 1,
            TiffDirectoryType.EXIF_DIRECTORY_INTEROP_IFD);
    public static final TagInfoAscii EXIF_TAG_PROCESSING_SOFTWARE = new TagInfoAscii(
            "Processing Software", 0x000b, 1,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final TagInfoLong EXIF_TAG_SUBFILE_TYPE = new TagInfoLong(
            "Subfile Type", 0x00fe, 1, TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final int SUBFILE_TYPE_VALUE_FULL_RESOLUTION_IMAGE = 0;
    public static final int SUBFILE_TYPE_VALUE_REDUCED_RESOLUTION_IMAGE = 1;
    public static final int SUBFILE_TYPE_VALUE_SINGLE_PAGE_OF_MULTI_PAGE_IMAGE = 2;
    public static final int SUBFILE_TYPE_VALUE_SINGLE_PAGE_OF_MULTI_PAGE_REDUCED_RESOLUTION_IMAGE = 3;
    public static final int SUBFILE_TYPE_VALUE_TRANSPARENCY_MASK = 4;
    public static final int SUBFILE_TYPE_VALUE_TRANSPARENCY_MASK_OF_REDUCED_RESOLUTION_IMAGE = 5;
    public static final int SUBFILE_TYPE_VALUE_TRANSPARENCY_MASK_OF_MULTI_PAGE_IMAGE = 6;
    public static final int SUBFILE_TYPE_VALUE_TRANSPARENCY_MASK_OF_REDUCED_RESOLUTION_MULTI_PAGE_IMAGE = 7;
    public static final TagInfoShort EXIF_TAG_OLD_SUBFILE_TYPE = new TagInfoShort(
            "Old Subfile Type", 0x00ff, 1,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final int OLD_SUBFILE_TYPE_VALUE_FULL_RESOLUTION_IMAGE = 1;
    public static final int OLD_SUBFILE_TYPE_VALUE_REDUCED_RESOLUTION_IMAGE = 2;
    public static final int OLD_SUBFILE_TYPE_VALUE_SINGLE_PAGE_OF_MULTI_PAGE_IMAGE = 3;
    public static final TagInfoLong EXIF_TAG_IMAGE_WIDTH_IFD0 = new TagInfoLong(
            "Image Width", 0x0100, 1, TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final TagInfoLong EXIF_TAG_IMAGE_HEIGHT_IFD0 = new TagInfoLong(
            "Image Height", 0x0101, 1, TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final TagInfoShort EXIF_TAG_BITS_PER_SAMPLE = new TagInfoShort(
            "Bits Per Sample", 0x0102, -1,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final TagInfoShort EXIF_TAG_COMPRESSION = new TagInfoShort(
            "Compression", 0x0103, 1, TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final int COMPRESSION_VALUE_UNCOMPRESSED = 1;
    public static final int COMPRESSION_VALUE_CCITT_1D = 2;
    public static final int COMPRESSION_VALUE_T4_GROUP_3_FAX = 3;
    public static final int COMPRESSION_VALUE_T6_GROUP_4_FAX = 4;
    public static final int COMPRESSION_VALUE_LZW = 5;
    public static final int COMPRESSION_VALUE_JPEG_OLD_STYLE = 6;
    public static final int COMPRESSION_VALUE_JPEG = 7;
    public static final int COMPRESSION_VALUE_ADOBE_DEFLATE = 8;
    public static final int COMPRESSION_VALUE_JBIG_B_AND_W = 9;
    public static final int COMPRESSION_VALUE_JBIG_COLOR = 10;
    public static final int COMPRESSION_VALUE_NEXT = 32766;
    public static final int COMPRESSION_VALUE_EPSON_ERF_COMPRESSED = 32769;
    public static final int COMPRESSION_VALUE_CCIRLEW = 32771;
    public static final int COMPRESSION_VALUE_PACK_BITS = 32773;
    public static final int COMPRESSION_VALUE_THUNDERSCAN = 32809;
    public static final int COMPRESSION_VALUE_IT8CTPAD = 32895;
    public static final int COMPRESSION_VALUE_IT8LW = 32896;
    public static final int COMPRESSION_VALUE_IT8MP = 32897;
    public static final int COMPRESSION_VALUE_IT8BL = 32898;
    public static final int COMPRESSION_VALUE_PIXAR_FILM = 32908;
    public static final int COMPRESSION_VALUE_PIXAR_LOG = 32909;
    public static final int COMPRESSION_VALUE_DEFLATE = 32946;
    public static final int COMPRESSION_VALUE_DCS = 32947;
    public static final int COMPRESSION_VALUE_JBIG = 34661;
    public static final int COMPRESSION_VALUE_SGILOG = 34676;
    public static final int COMPRESSION_VALUE_SGILOG_24 = 34677;
    public static final int COMPRESSION_VALUE_JPEG_2000 = 34712;
    public static final int COMPRESSION_VALUE_NIKON_NEF_COMPRESSED = 34713;
    public static final int COMPRESSION_VALUE_KODAK_DCR_COMPRESSED = 65000;
    public static final int COMPRESSION_VALUE_PENTAX_PEF_COMPRESSED = 65535;
    public static final TagInfoShort EXIF_TAG_PHOTOMETRIC_INTERPRETATION = new TagInfoShort(
            "Photometric Interpretation", 0x0106, 1,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final int PHOTOMETRIC_INTERPRETATION_VALUE_WHITE_IS_ZERO = 0;
    public static final int PHOTOMETRIC_INTERPRETATION_VALUE_BLACK_IS_ZERO = 1;
    public static final int PHOTOMETRIC_INTERPRETATION_VALUE_RGB = 2;
    public static final int PHOTOMETRIC_INTERPRETATION_VALUE_RGB_PALETTE = 3;
    public static final int PHOTOMETRIC_INTERPRETATION_VALUE_TRANSPARENCY_MASK = 4;
    public static final int PHOTOMETRIC_INTERPRETATION_VALUE_CMYK = 5;
    public static final int PHOTOMETRIC_INTERPRETATION_VALUE_YCB_CR = 6;
    public static final int PHOTOMETRIC_INTERPRETATION_VALUE_CIELAB = 8;
    public static final int PHOTOMETRIC_INTERPRETATION_VALUE_ICCLAB = 9;
    public static final int PHOTOMETRIC_INTERPRETATION_VALUE_ITULAB = 10;
    public static final int PHOTOMETRIC_INTERPRETATION_VALUE_COLOR_FILTER_ARRAY = 32803;
    public static final int PHOTOMETRIC_INTERPRETATION_VALUE_PIXAR_LOG_L = 32844;
    public static final int PHOTOMETRIC_INTERPRETATION_VALUE_PIXAR_LOG_LUV = 32845;
    public static final int PHOTOMETRIC_INTERPRETATION_VALUE_LINEAR_RAW = 34892;
    public static final TagInfoShort EXIF_TAG_THRESHOLDING = new TagInfoShort(
            "Thresholding", 0x0107, 1, TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final int THRESHOLDING_VALUE_NO_DITHERING_OR_HALFTONING = 1;
    public static final int THRESHOLDING_VALUE_ORDERED_DITHER_OR_HALFTONE = 2;
    public static final int THRESHOLDING_VALUE_RANDOMIZED_DITHER = 3;
    public static final TagInfoShort EXIF_TAG_CELL_WIDTH = new TagInfoShort("Cell Width",
            0x0108, 1, TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final TagInfoShort EXIF_TAG_CELL_LENGTH = new TagInfoShort(
            "Cell Length", 0x0109, 1, TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final TagInfoShort EXIF_TAG_FILL_ORDER = new TagInfoShort("Fill Order",
            0x010a, 1, TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final int FILL_ORDER_VALUE_NORMAL = 1;
    public static final int FILL_ORDER_VALUE_REVERSED = 2;
    public static final TagInfoAscii EXIF_TAG_DOCUMENT_NAME = new TagInfoAscii(
            "Document Name", 0x010d, 1, TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final TagInfoAscii EXIF_TAG_IMAGE_DESCRIPTION = new TagInfoAscii(
            "Image Description", 0x010e, 1,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final TagInfoAscii EXIF_TAG_MAKE = new TagInfoAscii(
            "Make", 0x010f, 1, TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final TagInfoAscii EXIF_TAG_MODEL = new TagInfoAscii(
            "Model", 0x0110, 1, TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    // public static final TagInfo2 EXIF_TAG_STRIP_OFFSETS = new TagInfo2( "StripOffsets", 0x0111, , 1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoLong EXIF_TAG_PREVIEW_IMAGE_START_IFD0 = new TagInfoLong(
            "Preview Image Start", 0x0111, 1,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0, true);
    public static final TagInfoLong EXIF_TAG_PREVIEW_IMAGE_START_SUB_IFD1 = new TagInfoLong(
            "Preview Image Start", 0x0111, 1,
            TiffDirectoryType.EXIF_DIRECTORY_SUB_IFD1, true);
    public static final TagInfoLong EXIF_TAG_JPG_FROM_RAW_START_SUB_IFD2 = new TagInfoLong(
            "Jpg From Raw Start", 0x0111, 1,
            TiffDirectoryType.EXIF_DIRECTORY_SUB_IFD2, true);
    public static final TagInfoShort EXIF_TAG_ORIENTATION = new TagInfoShort(
            "Orientation", 0x0112, 1, TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final int ORIENTATION_VALUE_HORIZONTAL_NORMAL = 1;
    public static final int ORIENTATION_VALUE_MIRROR_HORIZONTAL = 2;
    public static final int ORIENTATION_VALUE_ROTATE_180 = 3;
    public static final int ORIENTATION_VALUE_MIRROR_VERTICAL = 4;
    public static final int ORIENTATION_VALUE_MIRROR_HORIZONTAL_AND_ROTATE_270_CW = 5;
    public static final int ORIENTATION_VALUE_ROTATE_90_CW = 6;
    public static final int ORIENTATION_VALUE_MIRROR_HORIZONTAL_AND_ROTATE_90_CW = 7;
    public static final int ORIENTATION_VALUE_ROTATE_270_CW = 8;
    public static final TagInfoShort EXIF_TAG_SAMPLES_PER_PIXEL = new TagInfoShort(
            "Samples Per Pixel", 0x0115, 1,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final TagInfoLong EXIF_TAG_ROWS_PER_STRIP = new TagInfoLong(
            "Rows Per Strip", 0x0116, 1, TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    // poly tag public static final TagInfo2 EXIF_TAG_STRIP_BYTE_COUNTS = new TagInfo2( "StripByteCounts", 0x0117, , 1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoLong EXIF_TAG_PREVIEW_IMAGE_LENGTH_IFD0 = new TagInfoLong(
            "Preview Image Length", 0x0117, 1,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final TagInfoLong EXIF_TAG_PREVIEW_IMAGE_LENGTH_SUB_IFD1 = new TagInfoLong(
            "Preview Image Length", 0x0117, 1,
            TiffDirectoryType.EXIF_DIRECTORY_SUB_IFD1);
    public static final TagInfoLong EXIF_TAG_JPG_FROM_RAW_LENGTH_SUB_IFD2 = new TagInfoLong(
            "Jpg From Raw Length", 0x0117, 1,
            TiffDirectoryType.EXIF_DIRECTORY_SUB_IFD2);
    public static final TagInfoShort EXIF_TAG_MIN_SAMPLE_VALUE = new TagInfoShort(
            "Min Sample Value", 0x0118, 1,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final TagInfoShort EXIF_TAG_MAX_SAMPLE_VALUE = new TagInfoShort(
            "Max Sample Value", 0x0119, 1,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final TagInfoRational EXIF_TAG_XRESOLUTION = new TagInfoRational(
            "XResolution", 0x011a, 1, TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final TagInfoRational EXIF_TAG_YRESOLUTION = new TagInfoRational(
            "YResolution", 0x011b, 1, TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final TagInfoShort EXIF_TAG_PLANAR_CONFIGURATION = new TagInfoShort(
            "Planar Configuration", 0x011c, 1,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final int PLANAR_CONFIGURATION_VALUE_CHUNKY = 1;
    public static final int PLANAR_CONFIGURATION_VALUE_PLANAR = 2;
    public static final TagInfoAscii EXIF_TAG_PAGE_NAME = new TagInfoAscii("Page Name",
            0x011d, 1, TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final TagInfoRational EXIF_TAG_XPOSITION = new TagInfoRational("XPosition",
            0x011e, 1, TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final TagInfoRational EXIF_TAG_YPOSITION = new TagInfoRational("YPosition",
            0x011f, 1, TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final TagInfoLong EXIF_TAG_FREE_OFFSETS = new TagInfoLong(
            "Free Offsets", 0x0120, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoLong EXIF_TAG_FREE_BYTE_COUNTS = new TagInfoLong(
            "Free Byte Counts", 0x0121, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoShort EXIF_TAG_GRAY_RESPONSE_UNIT = new TagInfoShort(
            "Gray Response Unit", 0x0122, 1,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final int GRAY_RESPONSE_UNIT_VALUE_0_1 = 1;
    public static final int GRAY_RESPONSE_UNIT_VALUE_0_001 = 2;
    public static final int GRAY_RESPONSE_UNIT_VALUE_0_0001 = 3;
    public static final int GRAY_RESPONSE_UNIT_VALUE_1E_05 = 4;
    public static final int GRAY_RESPONSE_UNIT_VALUE_1E_06 = 5;
    public static final TagInfoShort EXIF_TAG_GRAY_RESPONSE_CURVE = new TagInfoShort(
            "Gray Response Curve", 0x0123, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoLong EXIF_TAG_T4OPTIONS = new TagInfoLong("T4 Options",
            0x0124, 1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoLong EXIF_TAG_T6OPTIONS = new TagInfoLong("T6 Options",
            0x0125, 1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoShort EXIF_TAG_RESOLUTION_UNIT = new TagInfoShort(
            "Resolution Unit", 0x0128, 1, TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final int RESOLUTION_UNIT_VALUE_NONE = 1;
    public static final int RESOLUTION_UNIT_VALUE_INCHES = 2;
    public static final int RESOLUTION_UNIT_VALUE_CM = 3;
    public static final TagInfoShort EXIF_TAG_PAGE_NUMBER = new TagInfoShort(
            "Page Number", 0x0129, 2, TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final TagInfoShort EXIF_TAG_COLOR_RESPONSE_UNIT = new TagInfoShort(
            "Color Response Unit", 0x012c, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoShort EXIF_TAG_TRANSFER_FUNCTION = new TagInfoShort(
            "Transfer Function", 0x012d, 3*256,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoAscii EXIF_TAG_SOFTWARE = new TagInfoAscii("Software",
            0x0131, 1, TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final TagInfoAscii EXIF_TAG_MODIFY_DATE = new TagInfoAscii(
            "Modify Date", 0x0132, 1, TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final TagInfoAscii EXIF_TAG_ARTIST = new TagInfoAscii("Artist", 0x013b,
            1, TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final TagInfoAscii EXIF_TAG_HOST_COMPUTER = new TagInfoAscii(
            "Host Computer", 0x013c, 1, TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final TagInfoShort EXIF_TAG_PREDICTOR = new TagInfoShort("Predictor",
            0x013d, 1, TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final int PREDICTOR_VALUE_NONE = 1;
    public static final int PREDICTOR_VALUE_HORIZONTAL_DIFFERENCING = 2;
    public static final TagInfoRational EXIF_TAG_WHITE_POINT = new TagInfoRational(
            "White Point", 0x013e, 2, TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final TagInfoRational EXIF_TAG_PRIMARY_CHROMATICITIES = new TagInfoRational(
            "Primary Chromaticities", 0x013f, 6,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final TagInfoShort EXIF_TAG_COLOR_MAP = new TagInfoShort("Color Map",
            0x0140, -1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoShort EXIF_TAG_HALFTONE_HINTS = new TagInfoShort(
            "Halftone Hints", 0x0141, 2, TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final TagInfoShortOrLong EXIF_TAG_TILE_WIDTH = new TagInfoShortOrLong("Tile Width",
            0x0142, 1, TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final TagInfoShortOrLong EXIF_TAG_TILE_LENGTH = new TagInfoShortOrLong(
            "Tile Length", 0x0143, 1, TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final TagInfoLong EXIF_TAG_TILE_OFFSETS = new TagInfoLong(
            "Tile Offsets", 0x0144, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoShortOrLong EXIF_TAG_TILE_BYTE_COUNTS = new TagInfoShortOrLong(
            "Tile Byte Counts", 0x0145, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoShortOrLong EXIF_TAG_BAD_FAX_LINES = new TagInfoShortOrLong(
            "Bad Fax Lines", 0x0146, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoShort EXIF_TAG_CLEAN_FAX_DATA = new TagInfoShort(
            "Clean Fax Data", 0x0147, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final int CLEAN_FAX_DATA_VALUE_CLEAN = 0;
    public static final int CLEAN_FAX_DATA_VALUE_REGENERATED = 1;
    public static final int CLEAN_FAX_DATA_VALUE_UNCLEAN = 2;
    public static final TagInfoShortOrLong EXIF_TAG_CONSECUTIVE_BAD_FAX_LINES = new TagInfoShortOrLong(
            "Consecutive Bad Fax Lines", 0x0148,
            1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoLong EXIF_TAG_SUB_IFD = new TagInfoLong("Sub IFD",
            0x014a, -1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN, true);
    public static final TagInfoShort EXIF_TAG_INK_SET = new TagInfoShort("Ink Set",
            0x014c, 1, TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final int INK_SET_VALUE_CMYK = 1;
    public static final int INK_SET_VALUE_NOT_CMYK = 2;
    public static final TagInfoAscii EXIF_TAG_INK_NAMES = new TagInfoAscii("Ink Names",
            0x014d, -1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoShort EXIF_TAG_NUMBEROF_INKS = new TagInfoShort(
            "Numberof Inks", 0x014e, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoByteOrShort EXIF_TAG_DOT_RANGE = new TagInfoByteOrShort("Dot Range",
            0x0150, 1, TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final TagInfoAscii EXIF_TAG_TARGET_PRINTER = new TagInfoAscii(
            "Target Printer", 0x0151, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoShort EXIF_TAG_EXTRA_SAMPLES = new TagInfoShort(
            "Extra Samples", 0x0152, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoShort EXIF_TAG_SAMPLE_FORMAT = new TagInfoShort(
            "Sample Format", 0x0153, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final int SAMPLE_FORMAT_VALUE_UNSIGNED_INTEGER = 1;
    public static final int SAMPLE_FORMAT_VALUE_TWOS_COMPLEMENT_SIGNED_INTEGER = 2;
    public static final int SAMPLE_FORMAT_VALUE_IEEE_FLOATING_POINT = 3;
    public static final int SAMPLE_FORMAT_VALUE_UNDEFINED = 4;
    public static final int SAMPLE_FORMAT_VALUE_COMPLEX_INTEGER = 5;
    public static final int SAMPLE_FORMAT_VALUE_IEEE_FLOATING_POINT_1 = 6;
    public static final TagInfoAny EXIF_TAG_SMIN_SAMPLE_VALUE = new TagInfoAny(
            "SMin Sample Value", 0x0154, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoAny EXIF_TAG_SMAX_SAMPLE_VALUE = new TagInfoAny(
            "SMax Sample Value", 0x0155, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoShort EXIF_TAG_TRANSFER_RANGE = new TagInfoShort(
            "Transfer Range", 0x0156, 6,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoByte EXIF_TAG_CLIP_PATH = new TagInfoByte("Clip Path",
            0x0157, -1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoLong EXIF_TAG_XCLIP_PATH_UNITS = new TagInfoLong(
            "XClip Path Units", 0x0158, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoLong EXIF_TAG_YCLIP_PATH_UNITS = new TagInfoLong(
            "YClip Path Units", 0x0159, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoShort EXIF_TAG_INDEXED = new TagInfoShort("Indexed",
            0x015a, 1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final int INDEXED_VALUE_NOT_INDEXED = 0;
    public static final int INDEXED_VALUE_INDEXED = 1;
    public static final TagInfoUndefined EXIF_TAG_JPEGTABLES = new TagInfoUndefined("JPEGTables",
            0x015b, -1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoShort EXIF_TAG_OPIPROXY = new TagInfoShort("OPIProxy",
            0x015f, 1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final int OPIPROXY_VALUE_HIGHER_RESOLUTION_IMAGE_DOES_NOT_EXIST = 0;
    public static final int OPIPROXY_VALUE_HIGHER_RESOLUTION_IMAGE_EXISTS = 1;
    public static final TagInfoLong EXIF_TAG_GLOBAL_PARAMETERS_IFD = new TagInfoLong(
            "Global Parameters IFD", 0x0190, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN, true);
    public static final TagInfoLong EXIF_TAG_PROFILE_TYPE = new TagInfoLong(
            "Profile Type", 0x0191, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final int PROFILE_TYPE_VALUE_UNSPECIFIED = 0;
    public static final int PROFILE_TYPE_VALUE_GROUP_3_FAX = 1;
    public static final TagInfoByte EXIF_TAG_FAX_PROFILE = new TagInfoByte(
            "Fax Profile", 0x0192, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final int FAX_PROFILE_VALUE_UNKNOWN = 0;
    public static final int FAX_PROFILE_VALUE_MINIMAL_B_AND_W_LOSSLESS_S = 1;
    public static final int FAX_PROFILE_VALUE_EXTENDED_B_AND_W_LOSSLESS_F = 2;
    public static final int FAX_PROFILE_VALUE_LOSSLESS_JBIG_B_AND_W_J = 3;
    public static final int FAX_PROFILE_VALUE_LOSSY_COLOR_AND_GRAYSCALE_C = 4;
    public static final int FAX_PROFILE_VALUE_LOSSLESS_COLOR_AND_GRAYSCALE_L = 5;
    public static final int FAX_PROFILE_VALUE_MIXED_RASTER_CONTENT_M = 6;
    public static final TagInfoLong EXIF_TAG_CODING_METHODS = new TagInfoLong(
            "Coding Methods", 0x0193, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoByte EXIF_TAG_VERSION_YEAR = new TagInfoByte(
            "Version Year", 0x0194, 4,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoByte EXIF_TAG_MODE_NUMBER = new TagInfoByte(
            "Mode Number", 0x0195, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoRational EXIF_TAG_DECODE = new TagInfoRational("Decode", 0x01b1,
            -1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoShort EXIF_TAG_DEFAULT_IMAGE_COLOR = new TagInfoShort(
            "Default Image Color", 0x01b2, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoShort EXIF_TAG_JPEGPROC = new TagInfoShort("JPEGProc",
            0x0200, 1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final int JPEGPROC_VALUE_BASELINE = 1;
    public static final int JPEGPROC_VALUE_LOSSLESS = 14;
    // poly tag public static final TagInfo2 EXIF_TAG_THUMBNAIL_OFFSET = new TagInfo2( "ThumbnailOffset", 0x0201, , 1, TiffDirectoryType.EXIF_DIRECTORY_IFD1);
    public static final TagInfoLong EXIF_TAG_PREVIEW_IMAGE_START_MAKER_NOTES = new TagInfoLong(
            "Preview Image Start", 0x0201, 1,
            TiffDirectoryType.EXIF_DIRECTORY_MAKER_NOTES);
    public static final TagInfoLong EXIF_TAG_JPG_FROM_RAW_START_SUB_IFD = new TagInfoLong(
            "Jpg From Raw Start", 0x0201, 1,
            TiffDirectoryType.EXIF_DIRECTORY_SUB_IFD, true);
    public static final TagInfoLong EXIF_TAG_JPG_FROM_RAW_START_IFD2 = new TagInfoLong(
            "Jpg From Raw Start", 0x0201, 1,
            TiffDirectoryType.EXIF_DIRECTORY_IFD2, true);
    public static final TagInfoLong EXIF_TAG_OTHER_IMAGE_START = new TagInfoLong(
            "Other Image Start", 0x0201, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN, true);
    // poly tag public static final TagInfo2 EXIF_TAG_THUMBNAIL_LENGTH = new TagInfo2( "ThumbnailLength", 0x0202, , 1, TiffDirectoryType.EXIF_DIRECTORY_IFD1);
    public static final TagInfoLong EXIF_TAG_PREVIEW_IMAGE_LENGTH_MAKER_NOTES = new TagInfoLong(
            "Preview Image Length", 0x0202, 1,
            TiffDirectoryType.EXIF_DIRECTORY_MAKER_NOTES);
    public static final TagInfoLong EXIF_TAG_JPG_FROM_RAW_LENGTH_SUB_IFD = new TagInfoLong(
            "Jpg From Raw Length", 0x0202, 1,
            TiffDirectoryType.EXIF_DIRECTORY_SUB_IFD);
    public static final TagInfoLong EXIF_TAG_JPG_FROM_RAW_LENGTH_IFD2 = new TagInfoLong(
            "Jpg From Raw Length", 0x0202, 1,
            TiffDirectoryType.EXIF_DIRECTORY_IFD2);
    public static final TagInfoLong EXIF_TAG_OTHER_IMAGE_LENGTH = new TagInfoLong(
            "Other Image Length", 0x0202, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoShort EXIF_TAG_JPEGRESTART_INTERVAL = new TagInfoShort(
            "JPEGRestart Interval", 0x0203, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoShort EXIF_TAG_JPEGLOSSLESS_PREDICTORS = new TagInfoShort(
            "JPEGLossless Predictors", 0x0205, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoShort EXIF_TAG_JPEGPOINT_TRANSFORMS = new TagInfoShort(
            "JPEGPoint Transforms", 0x0206, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoLong EXIF_TAG_JPEGQTABLES = new TagInfoLong(
            "JPEGQTables", 0x0207, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoLong EXIF_TAG_JPEGDCTABLES = new TagInfoLong(
            "JPEGDCTables", 0x0208, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoLong EXIF_TAG_JPEGACTABLES = new TagInfoLong(
            "JPEGACTables", 0x0209, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoRational EXIF_TAG_YCBCR_COEFFICIENTS = new TagInfoRational(
            "YCbCr Coefficients", 0x0211, 3,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final TagInfoShort EXIF_TAG_YCBCR_SUB_SAMPLING = new TagInfoShort(
            "YCbCr Sub Sampling", 0x0212, 2,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final TagInfoShort EXIF_TAG_YCBCR_POSITIONING = new TagInfoShort(
            "YCbCr Positioning", 0x0213, 1,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final int YCB_CR_POSITIONING_VALUE_CENTERED = 1;
    public static final int YCB_CR_POSITIONING_VALUE_CO_SITED = 2;
    public static final TagInfoRational EXIF_TAG_REFERENCE_BLACK_WHITE = new TagInfoRational(
            "Reference Black White", 0x0214, 6,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final TagInfoLong EXIF_TAG_STRIP_ROW_COUNTS = new TagInfoLong(
            "Strip Row Counts", 0x022f, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoByte EXIF_TAG_APPLICATION_NOTES = new TagInfoByte(
            "Application Notes", 0x02bc, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoAscii EXIF_TAG_RELATED_IMAGE_FILE_FORMAT = new TagInfoAscii(
            "Related Image File Format", 0x1000, 1,
            TiffDirectoryType.EXIF_DIRECTORY_INTEROP_IFD);
    public static final TagInfoShort EXIF_TAG_RELATED_IMAGE_WIDTH = new TagInfoShort(
            "Related Image Width", 0x1001, 1,
            TiffDirectoryType.EXIF_DIRECTORY_INTEROP_IFD);
    public static final TagInfoShort EXIF_TAG_RELATED_IMAGE_LENGTH = new TagInfoShort(
            "Related Image Length", 0x1002, 1,
            TiffDirectoryType.EXIF_DIRECTORY_INTEROP_IFD);
    public static final TagInfoShort EXIF_TAG_RATING = new TagInfoShort("Rating", 0x4746,
            1, TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final TagInfoShort EXIF_TAG_RATING_PERCENT = new TagInfoShort(
            "Rating Percent", 0x4749, 1, TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final TagInfoAscii EXIF_TAG_IMAGE_ID = new TagInfoAscii("Image ID",
            0x800d, -1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoByte EXIF_TAG_WANG_ANNOTATION = new TagInfoByte(
            "Wang Annotation", 0x80a4, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoUnknown EXIF_TAG_MATTEING = new TagInfoUnknown("Matteing",
            0x80e3, -1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoUnknown EXIF_TAG_DATA_TYPE = new TagInfoUnknown("Data Type",
            0x80e4, -1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoUnknown EXIF_TAG_IMAGE_DEPTH = new TagInfoUnknown(
            "Image Depth", 0x80e5, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoUnknown EXIF_TAG_TILE_DEPTH = new TagInfoUnknown("Tile Depth",
            0x80e6, -1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoUnknown EXIF_TAG_MODEL_2 = new TagInfoUnknown("Model 2",
            0x827d, -1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoShort EXIF_TAG_CFAREPEAT_PATTERN_DIM = new TagInfoShort(
            "CFARepeat Pattern Dim", 0x828d, 2,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoByte EXIF_TAG_CFAPATTERN_2 = new TagInfoByte(
            "CFAPattern 2", 0x828e, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    // FIXME: rational or ascii!!! N4378
    public static final TagInfoRational EXIF_TAG_BATTERY_LEVEL = new TagInfoRational(
            "Battery Level", 0x828f, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoAscii EXIF_TAG_COPYRIGHT = new TagInfoAscii("Copyright",
            0x8298, 1, TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final TagInfoRational EXIF_TAG_EXPOSURE_TIME = new TagInfoRational(
            "Exposure Time", 0x829a, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoRational EXIF_TAG_FNUMBER = new TagInfoRational("FNumber",
            0x829d, 1, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoLong EXIF_TAG_MDFILE_TAG = new TagInfoLong("MDFile Tag",
            0x82a5, 1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoRational EXIF_TAG_MDSCALE_PIXEL = new TagInfoRational(
            "MDScale Pixel", 0x82a6, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoShort EXIF_TAG_MDCOLOR_TABLE = new TagInfoShort(
            "MDColor Table", 0x82a7, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoAscii EXIF_TAG_MDLAB_NAME = new TagInfoAscii("MDLab Name",
            0x82a8, -1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoAscii EXIF_TAG_MDSAMPLE_INFO = new TagInfoAscii(
            "MDSample Info", 0x82a9, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoAscii EXIF_TAG_MDPREP_DATE = new TagInfoAscii(
            "MDPrep Date", 0x82aa, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoAscii EXIF_TAG_MDPREP_TIME = new TagInfoAscii(
            "MDPrep Time", 0x82ab, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoAscii EXIF_TAG_MDFILE_UNITS = new TagInfoAscii(
            "MDFile Units", 0x82ac, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoDouble EXIF_TAG_PIXEL_SCALE = new TagInfoDouble(
            "Pixel Scale", 0x830e, 3,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    // FIXME: other types?
    public static final TagInfoLong EXIF_TAG_IPTC_NAA = new TagInfoLong("IPTC-NAA",
            0x83bb, 1, TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final TagInfoShort EXIF_TAG_INTERGRAPH_PACKET_DATA = new TagInfoShort(
            "Intergraph Packet Data", 0x847e,
            -1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoLong EXIF_TAG_INTERGRAPH_FLAG_REGISTERS = new TagInfoLong(
            "Intergraph Flag Registers", 0x847f,
            16, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoDouble EXIF_TAG_INTERGRAPH_MATRIX = new TagInfoDouble(
            "Intergraph Matrix", 0x8480, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoDouble EXIF_TAG_MODEL_TIE_POINT = new TagInfoDouble(
            "Model Tie Point", 0x8482, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoAscii EXIF_TAG_SITE = new TagInfoAscii("Site", 0x84e0,
            -1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoAscii EXIF_TAG_COLOR_SEQUENCE = new TagInfoAscii(
            "Color Sequence", 0x84e1, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoAscii EXIF_TAG_IT8HEADER = new TagInfoAscii("IT8 Header",
            0x84e2, -1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoShort EXIF_TAG_RASTER_PADDING = new TagInfoShort(
            "Raster Padding", 0x84e3, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoShort EXIF_TAG_BITS_PER_RUN_LENGTH = new TagInfoShort(
            "Bits Per Run Length", 0x84e4, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoShort EXIF_TAG_BITS_PER_EXTENDED_RUN_LENGTH = new TagInfoShort(
            "Bits Per Extended Run Length", 0x84e5,
            1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoByte EXIF_TAG_COLOR_TABLE = new TagInfoByte(
            "Color Table", 0x84e6, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoByte EXIF_TAG_IMAGE_COLOR_INDICATOR = new TagInfoByte(
            "Image Color Indicator", 0x84e7, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoByte EXIF_TAG_BACKGROUND_COLOR_INDICATOR = new TagInfoByte(
            "Background Color Indicator", 0x84e8,
            1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoByte EXIF_TAG_IMAGE_COLOR_VALUE = new TagInfoByte(
            "Image Color Value", 0x84e9, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoByte EXIF_TAG_BACKGROUND_COLOR_VALUE = new TagInfoByte(
            "Background Color Value", 0x84ea,
            -1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoByte EXIF_TAG_PIXEL_INTENSITY_RANGE = new TagInfoByte(
            "Pixel Intensity Range", 0x84eb, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoByte EXIF_TAG_TRANSPARENCY_INDICATOR = new TagInfoByte(
            "Transparency Indicator", 0x84ec,
            1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoAscii EXIF_TAG_COLOR_CHARACTERIZATION = new TagInfoAscii(
            "Color Characterization", 0x84ed, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoShortOrLong EXIF_TAG_HCUSAGE = new TagInfoShortOrLong("HCUsage",
            0x84ee, 1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoAscii EXIF_TAG_SEMINFO = new TagInfoAscii("SEMInfo",
            0x8546, 1, TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final TagInfoLong EXIF_TAG_AFCP_IPTC = new TagInfoLong("AFCP_IPTC",
            0x8568, 1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoDouble EXIF_TAG_MODEL_TRANSFORM = new TagInfoDouble(
            "Model Transform", 0x85d8, 16,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoLong EXIF_TAG_LEAF_DATA = new TagInfoLong("Leaf Data",
            0x8606, 1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoByte EXIF_TAG_PHOTOSHOP_SETTINGS = new TagInfoByte(
            "Photoshop Settings", 0x8649, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoLong EXIF_TAG_EXIF_OFFSET = new TagInfoLong(
            "Exif Offset", 0x8769, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN, true);
    public static final TagInfoUndefined EXIF_TAG_ICC_PROFILE = new TagInfoUndefined(
            "ICC_ Profile", 0x8773, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoShortOrLong EXIF_TAG_IMAGE_LAYER = new TagInfoShortOrLong(
            "Image Layer", 0x87ac, 2,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoShort EXIF_TAG_GEO_TIFF_DIRECTORY = new TagInfoShort(
            "Geo Tiff Directory", 0x87af, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoDouble EXIF_TAG_GEO_TIFF_DOUBLE_PARAMS = new TagInfoDouble(
            "Geo Tiff Double Params", 0x87b0,
            -1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoAscii EXIF_TAG_GEO_TIFF_ASCII_PARAMS = new TagInfoAscii(
            "Geo Tiff Ascii Params", 0x87b1, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoShort EXIF_TAG_EXPOSURE_PROGRAM = new TagInfoShort(
            "Exposure Program", 0x8822, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final int EXPOSURE_PROGRAM_VALUE_MANUAL = 1;
    public static final int EXPOSURE_PROGRAM_VALUE_PROGRAM_AE = 2;
    public static final int EXPOSURE_PROGRAM_VALUE_APERTURE_PRIORITY_AE = 3;
    public static final int EXPOSURE_PROGRAM_VALUE_SHUTTER_SPEED_PRIORITY_AE = 4;
    public static final int EXPOSURE_PROGRAM_VALUE_CREATIVE_SLOW_SPEED = 5;
    public static final int EXPOSURE_PROGRAM_VALUE_ACTION_HIGH_SPEED = 6;
    public static final int EXPOSURE_PROGRAM_VALUE_PORTRAIT = 7;
    public static final int EXPOSURE_PROGRAM_VALUE_LANDSCAPE = 8;
    public static final TagInfoAscii EXIF_TAG_SPECTRAL_SENSITIVITY = new TagInfoAscii(
            "Spectral Sensitivity", 0x8824, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoLong EXIF_TAG_GPSINFO = new TagInfoLong(
            "GPSInfo", 0x8825, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN, true);
    public static final TagInfoShort EXIF_TAG_ISO = new TagInfoShort("ISO", 0x8827,
            1, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoUndefined EXIF_TAG_OPTO__ELECTRIC_CONV_FACTOR = new TagInfoUndefined(
            "Opto - Electric Conv Factor", 0x8828,
            -1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoShort EXIF_TAG_INTERLACE = new TagInfoShort("Interlace",
            0x8829, 1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoSShort EXIF_TAG_TIME_ZONE_OFFSET = new TagInfoSShort(
            "Time Zone Offset", 0x882a, -1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoShort EXIF_TAG_SELF_TIMER_MODE = new TagInfoShort(
            "Self Timer Mode", 0x882b, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoLong EXIF_TAG_FAX_RECV_PARAMS = new TagInfoLong(
            "Fax Recv Params", 0x885c, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoAscii EXIF_TAG_FAX_SUB_ADDRESS = new TagInfoAscii(
            "Fax Sub Address", 0x885d, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoLong EXIF_TAG_FAX_RECV_TIME = new TagInfoLong(
            "Fax Recv Time", 0x885e, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoLong EXIF_TAG_LEAF_SUB_IFD = new TagInfoLong(
            "Leaf Sub IFD", 0x888a, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoUndefined EXIF_TAG_EXIF_VERSION = new TagInfoUndefined(
            "Exif Version", 0x9000, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoAscii EXIF_TAG_DATE_TIME_ORIGINAL = new TagInfoAscii(
            "Date Time Original", 0x9003, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoAscii EXIF_TAG_CREATE_DATE = new TagInfoAscii(
            "Create Date", 0x9004, 1, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoUndefined EXIF_TAG_COMPONENTS_CONFIGURATION = new TagInfoUndefined(
            "Components Configuration", 0x9101, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoRational EXIF_TAG_COMPRESSED_BITS_PER_PIXEL = new TagInfoRational(
            "Compressed Bits Per Pixel", 0x9102, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoSRational EXIF_TAG_SHUTTER_SPEED_VALUE = new TagInfoSRational(
            "Shutter Speed Value", 0x9201, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoRational EXIF_TAG_APERTURE_VALUE = new TagInfoRational(
            "Aperture Value", 0x9202, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoSRational EXIF_TAG_BRIGHTNESS_VALUE = new TagInfoSRational(
            "Brightness Value", 0x9203, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoSRational EXIF_TAG_EXPOSURE_COMPENSATION = new TagInfoSRational(
            "Exposure Compensation", 0x9204, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoRational EXIF_TAG_MAX_APERTURE_VALUE = new TagInfoRational(
            "Max Aperture Value", 0x9205, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoRational EXIF_TAG_SUBJECT_DISTANCE = new TagInfoRational(
            "Subject Distance", 0x9206, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoShort EXIF_TAG_METERING_MODE = new TagInfoShort(
            "Metering Mode", 0x9207, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final int METERING_MODE_VALUE_AVERAGE = 1;
    public static final int METERING_MODE_VALUE_CENTER_WEIGHTED_AVERAGE = 2;
    public static final int METERING_MODE_VALUE_SPOT = 3;
    public static final int METERING_MODE_VALUE_MULTI_SPOT = 4;
    public static final int METERING_MODE_VALUE_MULTI_SEGMENT = 5;
    public static final int METERING_MODE_VALUE_PARTIAL = 6;
    public static final int METERING_MODE_VALUE_OTHER = 255;
    public static final TagInfoShort EXIF_TAG_LIGHT_SOURCE = new TagInfoShort(
            "Light Source", 0x9208, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final int LIGHT_SOURCE_VALUE_DAYLIGHT = 1;
    public static final int LIGHT_SOURCE_VALUE_FLUORESCENT = 2;
    public static final int LIGHT_SOURCE_VALUE_TUNGSTEN = 3;
    public static final int LIGHT_SOURCE_VALUE_FLASH = 4;
    public static final int LIGHT_SOURCE_VALUE_FINE_WEATHER = 9;
    public static final int LIGHT_SOURCE_VALUE_CLOUDY = 10;
    public static final int LIGHT_SOURCE_VALUE_SHADE = 11;
    public static final int LIGHT_SOURCE_VALUE_DAYLIGHT_FLUORESCENT = 12;
    public static final int LIGHT_SOURCE_VALUE_DAY_WHITE_FLUORESCENT = 13;
    public static final int LIGHT_SOURCE_VALUE_COOL_WHITE_FLUORESCENT = 14;
    public static final int LIGHT_SOURCE_VALUE_WHITE_FLUORESCENT = 15;
    public static final int LIGHT_SOURCE_VALUE_STANDARD_LIGHT_A = 17;
    public static final int LIGHT_SOURCE_VALUE_STANDARD_LIGHT_B = 18;
    public static final int LIGHT_SOURCE_VALUE_STANDARD_LIGHT_C = 19;
    public static final int LIGHT_SOURCE_VALUE_D55 = 20;
    public static final int LIGHT_SOURCE_VALUE_D65 = 21;
    public static final int LIGHT_SOURCE_VALUE_D75 = 22;
    public static final int LIGHT_SOURCE_VALUE_D50 = 23;
    public static final int LIGHT_SOURCE_VALUE_ISO_STUDIO_TUNGSTEN = 24;
    public static final int LIGHT_SOURCE_VALUE_OTHER = 255;
    public static final TagInfoShort EXIF_TAG_FLASH = new TagInfoShort("Flash", 0x9209,
            1, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final int FLASH_VALUE_NO_FLASH = 0x0;
    public static final int FLASH_VALUE_FIRED = 0x1;
    public static final int FLASH_VALUE_FIRED_RETURN_NOT_DETECTED = 0x5;
    public static final int FLASH_VALUE_FIRED_RETURN_DETECTED = 0x7;
    public static final int FLASH_VALUE_ON_DID_NOT_FIRE = 0x8;
    public static final int FLASH_VALUE_ON = 0x9;
    public static final int FLASH_VALUE_ON_RETURN_NOT_DETECTED = 0xd;
    public static final int FLASH_VALUE_ON_RETURN_DETECTED = 0xf;
    public static final int FLASH_VALUE_OFF = 0x10;
    public static final int FLASH_VALUE_OFF_DID_NOT_FIRE_RETURN_NOT_DETECTED = 0x14;
    public static final int FLASH_VALUE_AUTO_DID_NOT_FIRE = 0x18;
    public static final int FLASH_VALUE_AUTO_FIRED = 0x19;
    public static final int FLASH_VALUE_AUTO_FIRED_RETURN_NOT_DETECTED = 0x1d;
    public static final int FLASH_VALUE_AUTO_FIRED_RETURN_DETECTED = 0x1f;
    public static final int FLASH_VALUE_NO_FLASH_FUNCTION = 0x20;
    public static final int FLASH_VALUE_OFF_NO_FLASH_FUNCTION = 0x30;
    public static final int FLASH_VALUE_FIRED_RED_EYE_REDUCTION = 0x41;
    public static final int FLASH_VALUE_FIRED_RED_EYE_REDUCTION_RETURN_NOT_DETECTED = 0x45;
    public static final int FLASH_VALUE_FIRED_RED_EYE_REDUCTION_RETURN_DETECTED = 0x47;
    public static final int FLASH_VALUE_ON_RED_EYE_REDUCTION = 0x49;
    public static final int FLASH_VALUE_ON_RED_EYE_REDUCTION_RETURN_NOT_DETECTED = 0x4d;
    public static final int FLASH_VALUE_ON_RED_EYE_REDUCTION_RETURN_DETECTED = 0x4f;
    public static final int FLASH_VALUE_OFF_RED_EYE_REDUCTION = 0x50;
    public static final int FLASH_VALUE_AUTO_DID_NOT_FIRE_RED_EYE_REDUCTION = 0x58;
    public static final int FLASH_VALUE_AUTO_FIRED_RED_EYE_REDUCTION = 0x59;
    public static final int FLASH_VALUE_AUTO_FIRED_RED_EYE_REDUCTION_RETURN_NOT_DETECTED = 0x5d;
    public static final int FLASH_VALUE_AUTO_FIRED_RED_EYE_REDUCTION_RETURN_DETECTED = 0x5f;
    public static final TagInfoRational EXIF_TAG_FOCAL_LENGTH = new TagInfoRational(
            "Focal Length", 0x920a, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoRational EXIF_TAG_FLASH_ENERGY = new TagInfoRational(
            "Flash Energy", 0x920b, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoUndefined EXIF_TAG_SPATIAL_FREQUENCY_RESPONSE_1 = new TagInfoUndefined(
            "Spatial Frequency Response", 0x920c,
            -1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoUndefined EXIF_TAG_NOISE_1 = new TagInfoUndefined("Noise", 0x920d,
            -1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoRational EXIF_TAG_FOCAL_PLANE_XRESOLUTION = new TagInfoRational(
            "Focal Plane XResolution", 0x920e,
            1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoRational EXIF_TAG_FOCAL_PLANE_YRESOLUTION = new TagInfoRational(
            "Focal Plane YResolution", 0x920f,
            1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoShort EXIF_TAG_FOCAL_PLANE_RESOLUTION_UNIT = new TagInfoShort(
            "Focal Plane Resolution Unit", 0x9210,
            1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final int FOCAL_PLANE_RESOLUTION_UNIT_VALUE_NONE = 1;
    public static final int FOCAL_PLANE_RESOLUTION_UNIT_VALUE_INCHES = 2;
    public static final int FOCAL_PLANE_RESOLUTION_UNIT_VALUE_CM = 3;
    public static final int FOCAL_PLANE_RESOLUTION_UNIT_VALUE_MM = 4;
    public static final int FOCAL_PLANE_RESOLUTION_UNIT_VALUE_UM = 5;
    public static final TagInfoLong EXIF_TAG_IMAGE_NUMBER_EXIF_IFD = new TagInfoLong(
            "Image Number", 0x9211, 1, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoAscii EXIF_TAG_SECURITY_CLASSIFICATION_EXIF_IFD = new TagInfoAscii(
            "Security Classification", 0x9212, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoAscii EXIF_TAG_IMAGE_HISTORY_EXIF_IFD = new TagInfoAscii(
            "Image History", 0x9213, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoShort EXIF_TAG_SUBJECT_LOCATION_1 = new TagInfoShort(
            "Subject Location", 0x9214, 4,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoRational EXIF_TAG_EXPOSURE_INDEX = new TagInfoRational(
            "Exposure Index", 0x9215, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoByte EXIF_TAG_TIFF_EPSTANDARD_ID_1 = new TagInfoByte(
            "TIFF- EPStandard ID", 0x9216, 4,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoShort EXIF_TAG_SENSING_METHOD = new TagInfoShort(
            "Sensing Method", 0x9217, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final int SENSING_METHOD_VALUE_MONOCHROME_AREA = 1;
    public static final int SENSING_METHOD_VALUE_ONE_CHIP_COLOR_AREA = 2;
    public static final int SENSING_METHOD_VALUE_TWO_CHIP_COLOR_AREA = 3;
    public static final int SENSING_METHOD_VALUE_THREE_CHIP_COLOR_AREA = 4;
    public static final int SENSING_METHOD_VALUE_COLOR_SEQUENTIAL_AREA = 5;
    public static final int SENSING_METHOD_VALUE_MONOCHROME_LINEAR = 6;
    public static final int SENSING_METHOD_VALUE_TRILINEAR = 7;
    public static final int SENSING_METHOD_VALUE_COLOR_SEQUENTIAL_LINEAR = 8;
    public static final TagInfoDouble EXIF_TAG_STO_NITS = new TagInfoDouble("Sto Nits",
            0x923f, 1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    //     skipping Maker Note!
    public static final TagInfoUndefined EXIF_TAG_MAKER_NOTE = new TagInfoUndefined("Maker Note",
            0x927c, 1, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoGpsText EXIF_TAG_USER_COMMENT = new TagInfoGpsText(
            "UserComment", 0x9286, FIELD_TYPE_UNDEFINED, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoAscii EXIF_TAG_SUB_SEC_TIME = new TagInfoAscii(
            "Sub Sec Time", 0x9290, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoAscii EXIF_TAG_SUB_SEC_TIME_ORIGINAL = new TagInfoAscii(
            "Sub Sec Time Original", 0x9291, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoAscii EXIF_TAG_SUB_SEC_TIME_DIGITIZED = new TagInfoAscii(
            "Sub Sec Time Digitized", 0x9292, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoUndefined EXIF_TAG_IMAGE_SOURCE_DATA = new TagInfoUndefined(
            "Image Source Data", 0x935c, 1,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final TagInfoXpString EXIF_TAG_XPTITLE = new TagInfoXpString("XPTitle",
            0x9c9b, -1, TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final TagInfoXpString EXIF_TAG_XPCOMMENT = new TagInfoXpString("XPComment",
            0x9c9c, -1, TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final TagInfoXpString EXIF_TAG_XPAUTHOR = new TagInfoXpString("XPAuthor",
            0x9c9d, -1, TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final TagInfoXpString EXIF_TAG_XPKEYWORDS = new TagInfoXpString("XPKeywords",
            0x9c9e, -1, TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final TagInfoXpString EXIF_TAG_XPSUBJECT = new TagInfoXpString("XPSubject",
            0x9c9f, -1, TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final TagInfoUndefined EXIF_TAG_FLASHPIX_VERSION = new TagInfoUndefined(
            "Flashpix Version", 0xa000, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoShort EXIF_TAG_COLOR_SPACE = new TagInfoShort(
            "Color Space", 0xa001, 1, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final int COLOR_SPACE_VALUE_SRGB = 1;
    public static final int COLOR_SPACE_VALUE_ADOBE_RGB = 2;
    public static final int COLOR_SPACE_VALUE_UNCALIBRATED = 65535;
    public static final TagInfoShort EXIF_TAG_EXIF_IMAGE_WIDTH = new TagInfoShort(
            "Exif Image Width", 0xa002, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoShort EXIF_TAG_EXIF_IMAGE_LENGTH = new TagInfoShort(
            "Exif Image Length", 0xa003, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoAscii EXIF_TAG_RELATED_SOUND_FILE = new TagInfoAscii(
            "Related Sound File", 0xa004, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoLong EXIF_TAG_INTEROP_OFFSET = new TagInfoLong(
            "Interop Offset", 0xa005, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN, true);
    public static final TagInfoRational EXIF_TAG_FLASH_ENERGY_EXIF_IFD = new TagInfoRational(
            "Flash Energy", 0xa20b, -1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoUndefined EXIF_TAG_SPATIAL_FREQUENCY_RESPONSE_2 = new TagInfoUndefined(
            "Spatial Frequency Response", 0xa20c,
            -1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoUnknown EXIF_TAG_NOISE_2 = new TagInfoUnknown("Noise", 0xa20d,
            -1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoRational EXIF_TAG_FOCAL_PLANE_XRESOLUTION_EXIF_IFD = new TagInfoRational(
            "Focal Plane XResolution", 0xa20e, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoRational EXIF_TAG_FOCAL_PLANE_YRESOLUTION_EXIF_IFD = new TagInfoRational(
            "Focal Plane YResolution", 0xa20f, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoShort EXIF_TAG_FOCAL_PLANE_RESOLUTION_UNIT_EXIF_IFD = new TagInfoShort(
            "Focal Plane Resolution Unit", 0xa210, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final int FOCAL_PLANE_RESOLUTION_UNIT_EXIF_IFD_VALUE_NONE = 1;
    public static final int FOCAL_PLANE_RESOLUTION_UNIT_EXIF_IFD_VALUE_INCHES = 2;
    public static final int FOCAL_PLANE_RESOLUTION_UNIT_EXIF_IFD_VALUE_CM = 3;
    public static final int FOCAL_PLANE_RESOLUTION_UNIT_EXIF_IFD_VALUE_MM = 4;
    public static final int FOCAL_PLANE_RESOLUTION_UNIT_EXIF_IFD_VALUE_UM = 5;
    public static final TagInfoUnknown EXIF_TAG_IMAGE_NUMBER = new TagInfoUnknown(
            "Image Number", 0xa211, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoUnknown EXIF_TAG_SECURITY_CLASSIFICATION = new TagInfoUnknown(
            "Security Classification", 0xa212,
            -1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoUnknown EXIF_TAG_IMAGE_HISTORY = new TagInfoUnknown(
            "Image History", 0xa213, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoShort EXIF_TAG_SUBJECT_LOCATION_2 = new TagInfoShort(
            "Subject Location", 0xa214, 2,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoRational EXIF_TAG_EXPOSURE_INDEX_EXIF_IFD = new TagInfoRational(
            "Exposure Index", 0xa215, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoUnknown EXIF_TAG_TIFF_EPSTANDARD_ID_2 = new TagInfoUnknown(
            "TIFF-EPStandard ID", 0xa216, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoShort EXIF_TAG_SENSING_METHOD_EXIF_IFD = new TagInfoShort(
            "Sensing Method", 0xa217, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final int SENSING_METHOD_EXIF_IFD_VALUE_NOT_DEFINED = 1;
    public static final int SENSING_METHOD_EXIF_IFD_VALUE_ONE_CHIP_COLOR_AREA = 2;
    public static final int SENSING_METHOD_EXIF_IFD_VALUE_TWO_CHIP_COLOR_AREA = 3;
    public static final int SENSING_METHOD_EXIF_IFD_VALUE_THREE_CHIP_COLOR_AREA = 4;
    public static final int SENSING_METHOD_EXIF_IFD_VALUE_COLOR_SEQUENTIAL_AREA = 5;
    public static final int SENSING_METHOD_EXIF_IFD_VALUE_TRILINEAR = 7;
    public static final int SENSING_METHOD_EXIF_IFD_VALUE_COLOR_SEQUENTIAL_LINEAR = 8;
    public static final TagInfoUndefined EXIF_TAG_FILE_SOURCE = new TagInfoUndefined(
            "File Source", 0xa300, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final int FILE_SOURCE_VALUE_FILM_SCANNER = 1;
    public static final int FILE_SOURCE_VALUE_REFLECTION_PRINT_SCANNER = 2;
    public static final int FILE_SOURCE_VALUE_DIGITAL_CAMERA = 3;
    public static final TagInfoUndefined EXIF_TAG_SCENE_TYPE = new TagInfoUndefined("Scene Type",
            0xa301, 1, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoUndefined EXIF_TAG_CFAPATTERN = new TagInfoUndefined("CFAPattern",
            0xa302, 1, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoShort EXIF_TAG_CUSTOM_RENDERED = new TagInfoShort(
            "Custom Rendered", 0xa401, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final int CUSTOM_RENDERED_VALUE_NORMAL = 0;
    public static final int CUSTOM_RENDERED_VALUE_CUSTOM = 1;
    public static final TagInfoShort EXIF_TAG_EXPOSURE_MODE = new TagInfoShort(
            "Exposure Mode", 0xa402, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final int EXPOSURE_MODE_VALUE_AUTO = 0;
    public static final int EXPOSURE_MODE_VALUE_MANUAL = 1;
    public static final int EXPOSURE_MODE_VALUE_AUTO_BRACKET = 2;
    public static final TagInfoShort EXIF_TAG_WHITE_BALANCE_1 = new TagInfoShort(
            "White Balance", 0xa403, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final int WHITE_BALANCE_1_VALUE_AUTO = 0;
    public static final int WHITE_BALANCE_1_VALUE_MANUAL = 1;
    public static final TagInfoRational EXIF_TAG_DIGITAL_ZOOM_RATIO = new TagInfoRational(
            "Digital Zoom Ratio", 0xa404, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoShort EXIF_TAG_FOCAL_LENGTH_IN_35MM_FORMAT = new TagInfoShort(
            "Focal Length In 3 5mm Format", 0xa405, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoShort EXIF_TAG_SCENE_CAPTURE_TYPE = new TagInfoShort(
            "Scene Capture Type", 0xa406, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final int SCENE_CAPTURE_TYPE_VALUE_STANDARD = 0;
    public static final int SCENE_CAPTURE_TYPE_VALUE_LANDSCAPE = 1;
    public static final int SCENE_CAPTURE_TYPE_VALUE_PORTRAIT = 2;
    public static final int SCENE_CAPTURE_TYPE_VALUE_NIGHT = 3;
    public static final TagInfoShort EXIF_TAG_GAIN_CONTROL = new TagInfoShort(
            "Gain Control", 0xa407, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final int GAIN_CONTROL_VALUE_NONE = 0;
    public static final int GAIN_CONTROL_VALUE_LOW_GAIN_UP = 1;
    public static final int GAIN_CONTROL_VALUE_HIGH_GAIN_UP = 2;
    public static final int GAIN_CONTROL_VALUE_LOW_GAIN_DOWN = 3;
    public static final int GAIN_CONTROL_VALUE_HIGH_GAIN_DOWN = 4;
    public static final TagInfoShort EXIF_TAG_CONTRAST_1 = new TagInfoShort("Contrast",
            0xa408, 1, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final int CONTRAST_1_VALUE_NORMAL = 0;
    public static final int CONTRAST_1_VALUE_LOW = 1;
    public static final int CONTRAST_1_VALUE_HIGH = 2;
    public static final TagInfoShort EXIF_TAG_SATURATION_1 = new TagInfoShort(
            "Saturation", 0xa409, 1, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final int SATURATION_1_VALUE_NORMAL = 0;
    public static final int SATURATION_1_VALUE_LOW = 1;
    public static final int SATURATION_1_VALUE_HIGH = 2;
    public static final TagInfoShort EXIF_TAG_SHARPNESS_1 = new TagInfoShort("Sharpness",
            0xa40a, 1, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final int SHARPNESS_1_VALUE_NORMAL = 0;
    public static final int SHARPNESS_1_VALUE_SOFT = 1;
    public static final int SHARPNESS_1_VALUE_HARD = 2;
    public static final TagInfoUndefined EXIF_TAG_DEVICE_SETTING_DESCRIPTION = new TagInfoUndefined(
            "Device Setting Description", 0xa40b,
            -1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoShort EXIF_TAG_SUBJECT_DISTANCE_RANGE = new TagInfoShort(
            "Subject Distance Range", 0xa40c, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final int SUBJECT_DISTANCE_RANGE_VALUE_MACRO = 1;
    public static final int SUBJECT_DISTANCE_RANGE_VALUE_CLOSE = 2;
    public static final int SUBJECT_DISTANCE_RANGE_VALUE_DISTANT = 3;
    public static final TagInfoAscii EXIF_TAG_IMAGE_UNIQUE_ID = new TagInfoAscii(
            "Image Unique ID", 0xa420, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoAscii EXIF_TAG_GDALMETADATA = new TagInfoAscii(
            "GDALMetadata", 0xa480, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoAscii EXIF_TAG_GDALNO_DATA = new TagInfoAscii(
            "GDALNo Data", 0xa481, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoRational EXIF_TAG_GAMMA = new TagInfoRational("Gamma", 0xa500,
            1, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoByte EXIF_TAG_PIXEL_FORMAT = new TagInfoByte(
            "Pixel Format", 0xbc01, 16,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    // FIXME: convert to GUIDs
    public static final int PIXEL_FORMAT_VALUE_BLACK_AND_WHITE = 0x5;
    public static final int PIXEL_FORMAT_VALUE_8_BIT_GRAY = 0x8;
    public static final int PIXEL_FORMAT_VALUE_16_BIT_BGR555 = 0x9;
    public static final int PIXEL_FORMAT_VALUE_16_BIT_BGR565 = 0xa;
    public static final int PIXEL_FORMAT_VALUE_16_BIT_GRAY = 0xb;
    public static final int PIXEL_FORMAT_VALUE_24_BIT_BGR = 0xc;
    public static final int PIXEL_FORMAT_VALUE_24_BIT_RGB = 0xd;
    public static final int PIXEL_FORMAT_VALUE_32_BIT_BGR = 0xe;
    public static final int PIXEL_FORMAT_VALUE_32_BIT_BGRA = 0xf;
    public static final int PIXEL_FORMAT_VALUE_32_BIT_PBGRA = 0x10;
    public static final int PIXEL_FORMAT_VALUE_32_BIT_GRAY_FLOAT = 0x11;
    public static final int PIXEL_FORMAT_VALUE_48_BIT_RGB_FIXED_POINT = 0x12;
    public static final int PIXEL_FORMAT_VALUE_32_BIT_BGR101010 = 0x13;
    public static final int PIXEL_FORMAT_VALUE_48_BIT_RGB = 0x15;
    public static final int PIXEL_FORMAT_VALUE_64_BIT_RGBA = 0x16;
    public static final int PIXEL_FORMAT_VALUE_64_BIT_PRGBA = 0x17;
    public static final int PIXEL_FORMAT_VALUE_96_BIT_RGB_FIXED_POINT = 0x18;
    public static final int PIXEL_FORMAT_VALUE_128_BIT_RGBA_FLOAT = 0x19;
    public static final int PIXEL_FORMAT_VALUE_128_BIT_PRGBA_FLOAT = 0x1a;
    public static final int PIXEL_FORMAT_VALUE_128_BIT_RGB_FLOAT = 0x1b;
    public static final int PIXEL_FORMAT_VALUE_32_BIT_CMYK = 0x1c;
    public static final int PIXEL_FORMAT_VALUE_64_BIT_RGBA_FIXED_POINT = 0x1d;
    public static final int PIXEL_FORMAT_VALUE_128_BIT_RGBA_FIXED_POINT = 0x1e;
    public static final int PIXEL_FORMAT_VALUE_64_BIT_CMYK = 0x1f;
    public static final int PIXEL_FORMAT_VALUE_24_BIT_3_CHANNELS = 0x20;
    public static final int PIXEL_FORMAT_VALUE_32_BIT_4_CHANNELS = 0x21;
    public static final int PIXEL_FORMAT_VALUE_40_BIT_5_CHANNELS = 0x22;
    public static final int PIXEL_FORMAT_VALUE_48_BIT_6_CHANNELS = 0x23;
    public static final int PIXEL_FORMAT_VALUE_56_BIT_7_CHANNELS = 0x24;
    public static final int PIXEL_FORMAT_VALUE_64_BIT_8_CHANNELS = 0x25;
    public static final int PIXEL_FORMAT_VALUE_48_BIT_3_CHANNELS = 0x26;
    public static final int PIXEL_FORMAT_VALUE_64_BIT_4_CHANNELS = 0x27;
    public static final int PIXEL_FORMAT_VALUE_80_BIT_5_CHANNELS = 0x28;
    public static final int PIXEL_FORMAT_VALUE_96_BIT_6_CHANNELS = 0x29;
    public static final int PIXEL_FORMAT_VALUE_112_BIT_7_CHANNELS = 0x2a;
    public static final int PIXEL_FORMAT_VALUE_128_BIT_8_CHANNELS = 0x2b;
    public static final int PIXEL_FORMAT_VALUE_40_BIT_CMYK_ALPHA = 0x2c;
    public static final int PIXEL_FORMAT_VALUE_80_BIT_CMYK_ALPHA = 0x2d;
    public static final int PIXEL_FORMAT_VALUE_32_BIT_3_CHANNELS_ALPHA = 0x2e;
    public static final int PIXEL_FORMAT_VALUE_40_BIT_4_CHANNELS_ALPHA = 0x2f;
    public static final int PIXEL_FORMAT_VALUE_48_BIT_5_CHANNELS_ALPHA = 0x30;
    public static final int PIXEL_FORMAT_VALUE_56_BIT_6_CHANNELS_ALPHA = 0x31;
    public static final int PIXEL_FORMAT_VALUE_64_BIT_7_CHANNELS_ALPHA = 0x32;
    public static final int PIXEL_FORMAT_VALUE_72_BIT_8_CHANNELS_ALPHA = 0x33;
    public static final int PIXEL_FORMAT_VALUE_64_BIT_3_CHANNELS_ALPHA = 0x34;
    public static final int PIXEL_FORMAT_VALUE_80_BIT_4_CHANNELS_ALPHA = 0x35;
    public static final int PIXEL_FORMAT_VALUE_96_BIT_5_CHANNELS_ALPHA = 0x36;
    public static final int PIXEL_FORMAT_VALUE_112_BIT_6_CHANNELS_ALPHA = 0x37;
    public static final int PIXEL_FORMAT_VALUE_128_BIT_7_CHANNELS_ALPHA = 0x38;
    public static final int PIXEL_FORMAT_VALUE_144_BIT_8_CHANNELS_ALPHA = 0x39;
    public static final int PIXEL_FORMAT_VALUE_64_BIT_RGBA_HALF = 0x3a;
    public static final int PIXEL_FORMAT_VALUE_48_BIT_RGB_HALF = 0x3b;
    public static final int PIXEL_FORMAT_VALUE_32_BIT_RGBE = 0x3d;
    public static final int PIXEL_FORMAT_VALUE_16_BIT_GRAY_HALF = 0x3e;
    public static final int PIXEL_FORMAT_VALUE_32_BIT_GRAY_FIXED_POINT = 0x3f;
    public static final TagInfoLong EXIF_TAG_TRANSFOMATION = new TagInfoLong(
            "Transfomation", 0xbc02, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final int TRANSFOMATION_VALUE_HORIZONTAL_NORMAL = 0;
    public static final int TRANSFOMATION_VALUE_MIRROR_VERTICAL = 1;
    public static final int TRANSFOMATION_VALUE_MIRROR_HORIZONTAL = 2;
    public static final int TRANSFOMATION_VALUE_ROTATE_180 = 3;
    public static final int TRANSFOMATION_VALUE_ROTATE_90_CW = 4;
    public static final int TRANSFOMATION_VALUE_MIRROR_HORIZONTAL_AND_ROTATE_90_CW = 5;
    public static final int TRANSFOMATION_VALUE_MIRROR_HORIZONTAL_AND_ROTATE_270_CW = 6;
    public static final int TRANSFOMATION_VALUE_ROTATE_270_CW = 7;
    public static final TagInfoLong EXIF_TAG_UNCOMPRESSED = new TagInfoLong(
            "Uncompressed", 0xbc03, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final int UNCOMPRESSED_VALUE_NO = 0;
    public static final int UNCOMPRESSED_VALUE_YES = 1;
    public static final TagInfoLong EXIF_TAG_IMAGE_TYPE = new TagInfoLong("Image Type",
            0xbc04, 1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoLong EXIF_TAG_IMAGE_WIDTH = new TagInfoLong(
            "Image Width", 0xbc80, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoLong EXIF_TAG_IMAGE_HEIGHT = new TagInfoLong(
            "Image Height", 0xbc81, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoFloat EXIF_TAG_WIDTH_RESOLUTION = new TagInfoFloat(
            "Width Resolution", 0xbc82, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoFloat EXIF_TAG_HEIGHT_RESOLUTION = new TagInfoFloat(
            "Height Resolution", 0xbc83, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    // FIXME: might be an offset?
    public static final TagInfoLong EXIF_TAG_IMAGE_OFFSET = new TagInfoLong(
            "Image Offset", 0xbcc0, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoLong EXIF_TAG_IMAGE_BYTE_COUNT = new TagInfoLong(
            "Image Byte Count", 0xbcc1, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    // FIXME: might be an offset?
    public static final TagInfoLong EXIF_TAG_ALPHA_OFFSET = new TagInfoLong(
            "Alpha Offset", 0xbcc2, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoLong EXIF_TAG_ALPHA_BYTE_COUNT = new TagInfoLong(
            "Alpha Byte Count", 0xbcc3, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoByte EXIF_TAG_IMAGE_DATA_DISCARD = new TagInfoByte(
            "Image Data Discard", 0xbcc4, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final int IMAGE_DATA_DISCARD_VALUE_FULL_RESOLUTION = 0;
    public static final int IMAGE_DATA_DISCARD_VALUE_FLEXBITS_DISCARDED = 1;
    public static final int IMAGE_DATA_DISCARD_VALUE_HIGH_PASS_FREQUENCY_DATA_DISCARDED = 2;
    public static final int IMAGE_DATA_DISCARD_VALUE_HIGHPASS_AND_LOW_PASS_FREQUENCY_DATA_DISCARDED = 3;
    public static final TagInfoByte EXIF_TAG_ALPHA_DATA_DISCARD = new TagInfoByte(
            "Alpha Data Discard", 0xbcc5, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final int ALPHA_DATA_DISCARD_VALUE_FULL_RESOLUTION = 0;
    public static final int ALPHA_DATA_DISCARD_VALUE_FLEXBITS_DISCARDED = 1;
    public static final int ALPHA_DATA_DISCARD_VALUE_HIGH_PASS_FREQUENCY_DATA_DISCARDED = 2;
    public static final int ALPHA_DATA_DISCARD_VALUE_HIGHPASS_AND_LOW_PASS_FREQUENCY_DATA_DISCARDED = 3;
    public static final TagInfoAscii EXIF_TAG_OCE_SCANJOB_DESC = new TagInfoAscii(
            "Oce Scanjob Desc", 0xc427, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoAscii EXIF_TAG_OCE_APPLICATION_SELECTOR = new TagInfoAscii(
            "Oce Application Selector", 0xc428,
            -1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoAscii EXIF_TAG_OCE_IDNUMBER = new TagInfoAscii(
            "Oce IDNumber", 0xc429, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoAscii EXIF_TAG_OCE_IMAGE_LOGIC = new TagInfoAscii(
            "Oce Image Logic", 0xc42a, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoUnknown EXIF_TAG_ANNOTATIONS = new TagInfoUnknown(
            "Annotations", 0xc44f, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoUndefined EXIF_TAG_PRINT_IM = new TagInfoUndefined("Print IM",
            0xc4a5, 1, TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final TagInfoByte EXIF_TAG_DNG_VERSION = new TagInfoByte(
            "DNG Version", 0xc612, 4, TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final TagInfoByte EXIF_TAG_DNG_BACKWARD_VERSION = new TagInfoByte(
            "DNG Backward Version", 0xc613, 4,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final TagInfoAscii EXIF_TAG_UNIQUE_CAMERA_MODEL = new TagInfoAscii(
            "Unique Camera Model", 0xc614, 1,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final TagInfoAscii EXIF_TAG_LOCALIZED_CAMERA_MODEL = new TagInfoAscii(
            "Localized Camera Model", 0xc615, 1,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final TagInfoByte EXIF_TAG_CFAPLANE_COLOR = new TagInfoByte(
            "CFAPlane Color", 0xc616, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoShort EXIF_TAG_CFALAYOUT = new TagInfoShort("CFALayout",
            0xc617, 1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final int CFALAYOUT_VALUE_RECTANGULAR = 1;
    public static final int CFALAYOUT_VALUE_EVEN_COLUMNS_OFFSET_DOWN_1_2_ROW = 2;
    public static final int CFALAYOUT_VALUE_EVEN_COLUMNS_OFFSET_UP_1_2_ROW = 3;
    public static final int CFALAYOUT_VALUE_EVEN_ROWS_OFFSET_RIGHT_1_2_COLUMN = 4;
    public static final int CFALAYOUT_VALUE_EVEN_ROWS_OFFSET_LEFT_1_2_COLUMN = 5;
    public static final TagInfoShort EXIF_TAG_LINEARIZATION_TABLE = new TagInfoShort(
            "Linearization Table", 0xc618, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoShort EXIF_TAG_BLACK_LEVEL_REPEAT_DIM = new TagInfoShort(
            "Black Level Repeat Dim", 0xc619,
            2, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoShortOrLongOrRational EXIF_TAG_BLACK_LEVEL = new TagInfoShortOrLongOrRational(
            "Black Level", 0xc61a, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoSRational EXIF_TAG_BLACK_LEVEL_DELTA_H = new TagInfoSRational(
            "Black Level Delta H", 0xc61b, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoSRational EXIF_TAG_BLACK_LEVEL_DELTA_V = new TagInfoSRational(
            "Black Level Delta V", 0xc61c, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoShortOrLong EXIF_TAG_WHITE_LEVEL = new TagInfoShortOrLong(
            "White Level", 0xc61d, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoRational EXIF_TAG_DEFAULT_SCALE = new TagInfoRational(
            "Default Scale", 0xc61e, 2,
            TiffDirectoryType.EXIF_DIRECTORY_SUB_IFD);
    public static final TagInfoShortOrLongOrRational EXIF_TAG_DEFAULT_CROP_ORIGIN = new TagInfoShortOrLongOrRational(
            "Default Crop Origin", 0xc61f, 2,
            TiffDirectoryType.EXIF_DIRECTORY_SUB_IFD);
    public static final TagInfoShortOrLongOrRational EXIF_TAG_DEFAULT_CROP_SIZE = new TagInfoShortOrLongOrRational(
            "Default Crop Size", 0xc620, 2,
            TiffDirectoryType.EXIF_DIRECTORY_SUB_IFD);
    public static final TagInfoSRational EXIF_TAG_COLOR_MATRIX_1 = new TagInfoSRational(
            "Color Matrix 1", 0xc621, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoSRational EXIF_TAG_COLOR_MATRIX_2 = new TagInfoSRational(
            "Color Matrix 2", 0xc622, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoSRational EXIF_TAG_CAMERA_CALIBRATION_1 = new TagInfoSRational(
            "Camera Calibration 1", 0xc623, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoSRational EXIF_TAG_CAMERA_CALIBRATION_2 = new TagInfoSRational(
            "Camera Calibration 2", 0xc624, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoSRational EXIF_TAG_REDUCTION_MATRIX_1 = new TagInfoSRational(
            "Reduction Matrix 1", 0xc625, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoSRational EXIF_TAG_REDUCTION_MATRIX_2 = new TagInfoSRational(
            "Reduction Matrix 2", 0xc626, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoRational EXIF_TAG_ANALOG_BALANCE = new TagInfoRational(
            "Analog Balance", 0xc627, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoShortOrRational EXIF_TAG_AS_SHOT_NEUTRAL = new TagInfoShortOrRational(
            "As Shot Neutral", 0xc628, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoRational EXIF_TAG_AS_SHOT_WHITE_XY = new TagInfoRational(
            "As Shot White XY", 0xc629, 2,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final TagInfoSRational EXIF_TAG_BASELINE_EXPOSURE = new TagInfoSRational(
            "Baseline Exposure", 0xc62a, 1,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final TagInfoRational EXIF_TAG_BASELINE_NOISE = new TagInfoRational(
            "Baseline Noise", 0xc62b, 1,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final TagInfoRational EXIF_TAG_BASELINE_SHARPNESS = new TagInfoRational(
            "Baseline Sharpness", 0xc62c, 1,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final TagInfoLong EXIF_TAG_BAYER_GREEN_SPLIT = new TagInfoLong(
            "Bayer Green Split", 0xc62d, 1,
            TiffDirectoryType.EXIF_DIRECTORY_SUB_IFD);
    public static final TagInfoRational EXIF_TAG_LINEAR_RESPONSE_LIMIT = new TagInfoRational(
            "Linear Response Limit", 0xc62e, 1,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final TagInfoAscii EXIF_TAG_CAMERA_SERIAL_NUMBER = new TagInfoAscii(
            "Camera Serial Number", 0xc62f, 1,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final TagInfoRational EXIF_TAG_DNG_LENS_INFO = new TagInfoRational(
            "DNG Lens Info", 0xc630, 4,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final TagInfoRational EXIF_TAG_CHROMA_BLUR_RADIUS = new TagInfoRational(
            "Chroma Blur Radius", 0xc631, 1,
            TiffDirectoryType.EXIF_DIRECTORY_SUB_IFD);
    public static final TagInfoRational EXIF_TAG_ANTI_ALIAS_STRENGTH = new TagInfoRational(
            "Anti Alias Strength", 0xc632, 1,
            TiffDirectoryType.EXIF_DIRECTORY_SUB_IFD);
    public static final TagInfoRational EXIF_TAG_SHADOW_SCALE = new TagInfoRational(
            "Shadow Scale", 0xc633, 1, TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    // poly tag public static final TagInfo2 EXIF_TAG_SR2PRIVATE = new TagInfo2( "SR2Private", 0xc634, , 1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoByte EXIF_TAG_DNG_ADOBE_DATA = new TagInfoByte(
            "DNG Adobe Data", 0xc634, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoByte EXIF_TAG_DNG_PENTAX_DATA = new TagInfoByte(
            "DNG Pentax Data", 0xc634, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoByte EXIF_TAG_DNG_PRIVATE_DATA = new TagInfoByte(
            "DNG Private Data", 0xc634, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoShort EXIF_TAG_MAKER_NOTE_SAFETY = new TagInfoShort(
            "Maker Note Safety", 0xc635, 1,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final int MAKER_NOTE_SAFETY_VALUE_UNSAFE = 0;
    public static final int MAKER_NOTE_SAFETY_VALUE_SAFE = 1;
    public static final TagInfoShort EXIF_TAG_CALIBRATION_ILLUMINANT_1 = new TagInfoShort(
            "Calibration Illuminant 1", 0xc65a, 1,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final int CALIBRATION_ILLUMINANT_1_VALUE_DAYLIGHT = 1;
    public static final int CALIBRATION_ILLUMINANT_1_VALUE_FLUORESCENT = 2;
    public static final int CALIBRATION_ILLUMINANT_1_VALUE_TUNGSTEN = 3;
    public static final int CALIBRATION_ILLUMINANT_1_VALUE_FLASH = 4;
    public static final int CALIBRATION_ILLUMINANT_1_VALUE_FINE_WEATHER = 9;
    public static final int CALIBRATION_ILLUMINANT_1_VALUE_CLOUDY = 10;
    public static final int CALIBRATION_ILLUMINANT_1_VALUE_SHADE = 11;
    public static final int CALIBRATION_ILLUMINANT_1_VALUE_DAYLIGHT_FLUORESCENT = 12;
    public static final int CALIBRATION_ILLUMINANT_1_VALUE_DAY_WHITE_FLUORESCENT = 13;
    public static final int CALIBRATION_ILLUMINANT_1_VALUE_COOL_WHITE_FLUORESCENT = 14;
    public static final int CALIBRATION_ILLUMINANT_1_VALUE_WHITE_FLUORESCENT = 15;
    public static final int CALIBRATION_ILLUMINANT_1_VALUE_STANDARD_LIGHT_A = 17;
    public static final int CALIBRATION_ILLUMINANT_1_VALUE_STANDARD_LIGHT_B = 18;
    public static final int CALIBRATION_ILLUMINANT_1_VALUE_STANDARD_LIGHT_C = 19;
    public static final int CALIBRATION_ILLUMINANT_1_VALUE_D55 = 20;
    public static final int CALIBRATION_ILLUMINANT_1_VALUE_D65 = 21;
    public static final int CALIBRATION_ILLUMINANT_1_VALUE_D75 = 22;
    public static final int CALIBRATION_ILLUMINANT_1_VALUE_D50 = 23;
    public static final int CALIBRATION_ILLUMINANT_1_VALUE_ISO_STUDIO_TUNGSTEN = 24;
    public static final int CALIBRATION_ILLUMINANT_1_VALUE_OTHER = 255;
    public static final TagInfoShort EXIF_TAG_CALIBRATION_ILLUMINANT_2 = new TagInfoShort(
            "Calibration Illuminant 2", 0xc65b, 1,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final int CALIBRATION_ILLUMINANT_2_VALUE_DAYLIGHT = 1;
    public static final int CALIBRATION_ILLUMINANT_2_VALUE_FLUORESCENT = 2;
    public static final int CALIBRATION_ILLUMINANT_2_VALUE_TUNGSTEN = 3;
    public static final int CALIBRATION_ILLUMINANT_2_VALUE_FLASH = 4;
    public static final int CALIBRATION_ILLUMINANT_2_VALUE_FINE_WEATHER = 9;
    public static final int CALIBRATION_ILLUMINANT_2_VALUE_CLOUDY = 10;
    public static final int CALIBRATION_ILLUMINANT_2_VALUE_SHADE = 11;
    public static final int CALIBRATION_ILLUMINANT_2_VALUE_DAYLIGHT_FLUORESCENT = 12;
    public static final int CALIBRATION_ILLUMINANT_2_VALUE_DAY_WHITE_FLUORESCENT = 13;
    public static final int CALIBRATION_ILLUMINANT_2_VALUE_COOL_WHITE_FLUORESCENT = 14;
    public static final int CALIBRATION_ILLUMINANT_2_VALUE_WHITE_FLUORESCENT = 15;
    public static final int CALIBRATION_ILLUMINANT_2_VALUE_STANDARD_LIGHT_A = 17;
    public static final int CALIBRATION_ILLUMINANT_2_VALUE_STANDARD_LIGHT_B = 18;
    public static final int CALIBRATION_ILLUMINANT_2_VALUE_STANDARD_LIGHT_C = 19;
    public static final int CALIBRATION_ILLUMINANT_2_VALUE_D55 = 20;
    public static final int CALIBRATION_ILLUMINANT_2_VALUE_D65 = 21;
    public static final int CALIBRATION_ILLUMINANT_2_VALUE_D75 = 22;
    public static final int CALIBRATION_ILLUMINANT_2_VALUE_D50 = 23;
    public static final int CALIBRATION_ILLUMINANT_2_VALUE_ISO_STUDIO_TUNGSTEN = 24;
    public static final int CALIBRATION_ILLUMINANT_2_VALUE_OTHER = 255;
    public static final TagInfoRational EXIF_TAG_BEST_QUALITY_SCALE = new TagInfoRational(
            "Best Quality Scale", 0xc65c, 1,
            TiffDirectoryType.EXIF_DIRECTORY_SUB_IFD);
    public static final TagInfoByte EXIF_TAG_RAW_DATA_UNIQUE_ID = new TagInfoByte(
            "Raw Data Unique ID", 0xc65d, 16,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final TagInfoByte EXIF_TAG_ALIAS_LAYER_METADATA = new TagInfoByte(
            "Alias Layer Metadata", 0xc660, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoAscii EXIF_TAG_ORIGINAL_RAW_FILE_NAME = new TagInfoAscii(
            "Original Raw File Name", 0xc68b, 1,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final TagInfoUndefined EXIF_TAG_ORIGINAL_RAW_FILE_DATA = new TagInfoUndefined(
            "Original Raw File Data", 0xc68c, 1,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final TagInfoLong EXIF_TAG_ACTIVE_AREA = new TagInfoLong(
            "Active Area", 0xc68d, 4, TiffDirectoryType.EXIF_DIRECTORY_SUB_IFD);
    public static final TagInfoLong EXIF_TAG_MASKED_AREAS = new TagInfoLong(
            "Masked Areas", 0xc68e, 4, TiffDirectoryType.EXIF_DIRECTORY_SUB_IFD);
    public static final TagInfoByte EXIF_TAG_AS_SHOT_ICCPROFILE = new TagInfoByte(
            "As Shot ICCProfile", 0xc68f, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoSRational EXIF_TAG_AS_SHOT_PRE_PROFILE_MATRIX = new TagInfoSRational(
            "As Shot Pre Profile Matrix", 0xc690,
            -1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoUndefined EXIF_TAG_CURRENT_ICCPROFILE = new TagInfoUndefined(
            "Current ICCProfile", 0xc691, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoSRational EXIF_TAG_CURRENT_PRE_PROFILE_MATRIX = new TagInfoSRational(
            "Current Pre Profile Matrix", 0xc692,
            -1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoSLong EXIF_TAG_OFFSET_SCHEMA = new TagInfoSLong(
            "Offset Schema", 0xea1d, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoAscii EXIF_TAG_OWNER_NAME = new TagInfoAscii("Owner Name",
            0xfde8, 1, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoAscii EXIF_TAG_SERIAL_NUMBER = new TagInfoAscii(
            "Serial Number", 0xfde9, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoAscii EXIF_TAG_LENS = new TagInfoAscii("Lens", 0xfdea,
            1, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoAscii EXIF_TAG_RAW_FILE = new TagInfoAscii("Raw File",
            0xfe4c, 1, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoAscii EXIF_TAG_CONVERTER = new TagInfoAscii("Converter",
            0xfe4d, 1, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoAscii EXIF_TAG_WHITE_BALANCE_2 = new TagInfoAscii(
            "White Balance", 0xfe4e, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoAscii EXIF_TAG_EXPOSURE = new TagInfoAscii("Exposure",
            0xfe51, 1, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoAscii EXIF_TAG_SHADOWS = new TagInfoAscii("Shadows",
            0xfe52, 1, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoAscii EXIF_TAG_BRIGHTNESS = new TagInfoAscii("Brightness",
            0xfe53, 1, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoAscii EXIF_TAG_CONTRAST_2 = new TagInfoAscii("Contrast",
            0xfe54, 1, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoAscii EXIF_TAG_SATURATION_2 = new TagInfoAscii(
            "Saturation", 0xfe55, 1, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoAscii EXIF_TAG_SHARPNESS_2 = new TagInfoAscii("Sharpness",
            0xfe56, 1, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoAscii EXIF_TAG_SMOOTHNESS = new TagInfoAscii("Smoothness",
            0xfe57, 1, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoAscii EXIF_TAG_MOIRE_FILTER = new TagInfoAscii(
            "Moire Filter", 0xfe58, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);

    public static final List<TagInfo> ALL_EXIF_TAGS =
            Collections.unmodifiableList(Arrays.asList(
                    EXIF_TAG_INTEROP_INDEX, EXIF_TAG_INTEROP_VERSION,
                    EXIF_TAG_PROCESSING_SOFTWARE, EXIF_TAG_SUBFILE_TYPE,
                    EXIF_TAG_OLD_SUBFILE_TYPE, EXIF_TAG_IMAGE_WIDTH_IFD0,
                    EXIF_TAG_IMAGE_HEIGHT_IFD0, EXIF_TAG_BITS_PER_SAMPLE,
                    EXIF_TAG_COMPRESSION, EXIF_TAG_PHOTOMETRIC_INTERPRETATION,
                    EXIF_TAG_THRESHOLDING, EXIF_TAG_CELL_WIDTH, EXIF_TAG_CELL_LENGTH,
                    EXIF_TAG_FILL_ORDER, EXIF_TAG_DOCUMENT_NAME,
                    EXIF_TAG_IMAGE_DESCRIPTION, EXIF_TAG_MAKE, EXIF_TAG_MODEL,
                    EXIF_TAG_PREVIEW_IMAGE_START_IFD0,
                    EXIF_TAG_PREVIEW_IMAGE_START_SUB_IFD1,
                    EXIF_TAG_JPG_FROM_RAW_START_SUB_IFD2, EXIF_TAG_ORIENTATION,
                    EXIF_TAG_SAMPLES_PER_PIXEL, EXIF_TAG_ROWS_PER_STRIP,
                    EXIF_TAG_PREVIEW_IMAGE_LENGTH_IFD0,
                    EXIF_TAG_PREVIEW_IMAGE_LENGTH_SUB_IFD1,
                    EXIF_TAG_JPG_FROM_RAW_LENGTH_SUB_IFD2, EXIF_TAG_MIN_SAMPLE_VALUE,
                    EXIF_TAG_MAX_SAMPLE_VALUE, EXIF_TAG_XRESOLUTION,
                    EXIF_TAG_YRESOLUTION, EXIF_TAG_PLANAR_CONFIGURATION,
                    EXIF_TAG_PAGE_NAME, EXIF_TAG_XPOSITION, EXIF_TAG_YPOSITION,
                    EXIF_TAG_FREE_OFFSETS, EXIF_TAG_FREE_BYTE_COUNTS,
                    EXIF_TAG_GRAY_RESPONSE_UNIT, EXIF_TAG_GRAY_RESPONSE_CURVE,
                    EXIF_TAG_T4OPTIONS, EXIF_TAG_T6OPTIONS, EXIF_TAG_RESOLUTION_UNIT,
                    EXIF_TAG_PAGE_NUMBER, EXIF_TAG_COLOR_RESPONSE_UNIT,
                    EXIF_TAG_TRANSFER_FUNCTION, EXIF_TAG_SOFTWARE,
                    EXIF_TAG_MODIFY_DATE, EXIF_TAG_ARTIST, EXIF_TAG_HOST_COMPUTER,
                    EXIF_TAG_PREDICTOR, EXIF_TAG_WHITE_POINT,
                    EXIF_TAG_PRIMARY_CHROMATICITIES, EXIF_TAG_COLOR_MAP,
                    EXIF_TAG_HALFTONE_HINTS, EXIF_TAG_TILE_WIDTH, EXIF_TAG_TILE_LENGTH,
                    EXIF_TAG_TILE_OFFSETS, EXIF_TAG_TILE_BYTE_COUNTS,
                    EXIF_TAG_BAD_FAX_LINES, EXIF_TAG_CLEAN_FAX_DATA,
                    EXIF_TAG_CONSECUTIVE_BAD_FAX_LINES, EXIF_TAG_SUB_IFD,
                    EXIF_TAG_INK_SET, EXIF_TAG_INK_NAMES, EXIF_TAG_NUMBEROF_INKS,
                    EXIF_TAG_DOT_RANGE, EXIF_TAG_TARGET_PRINTER,
                    EXIF_TAG_EXTRA_SAMPLES, EXIF_TAG_SAMPLE_FORMAT,
                    EXIF_TAG_SMIN_SAMPLE_VALUE, EXIF_TAG_SMAX_SAMPLE_VALUE,
                    EXIF_TAG_TRANSFER_RANGE, EXIF_TAG_CLIP_PATH,
                    EXIF_TAG_XCLIP_PATH_UNITS, EXIF_TAG_YCLIP_PATH_UNITS,
                    EXIF_TAG_INDEXED, EXIF_TAG_JPEGTABLES, EXIF_TAG_OPIPROXY,
                    EXIF_TAG_GLOBAL_PARAMETERS_IFD, EXIF_TAG_PROFILE_TYPE,
                    EXIF_TAG_FAX_PROFILE, EXIF_TAG_CODING_METHODS,
                    EXIF_TAG_VERSION_YEAR, EXIF_TAG_MODE_NUMBER, EXIF_TAG_DECODE,
                    EXIF_TAG_DEFAULT_IMAGE_COLOR, EXIF_TAG_JPEGPROC,
                    EXIF_TAG_PREVIEW_IMAGE_START_MAKER_NOTES,
                    EXIF_TAG_JPG_FROM_RAW_START_SUB_IFD,
                    EXIF_TAG_JPG_FROM_RAW_START_IFD2, EXIF_TAG_OTHER_IMAGE_START,
                    EXIF_TAG_PREVIEW_IMAGE_LENGTH_MAKER_NOTES,
                    EXIF_TAG_JPG_FROM_RAW_LENGTH_SUB_IFD,
                    EXIF_TAG_JPG_FROM_RAW_LENGTH_IFD2, EXIF_TAG_OTHER_IMAGE_LENGTH,
                    EXIF_TAG_JPEGRESTART_INTERVAL, EXIF_TAG_JPEGLOSSLESS_PREDICTORS,
                    EXIF_TAG_JPEGPOINT_TRANSFORMS, EXIF_TAG_JPEGQTABLES,
                    EXIF_TAG_JPEGDCTABLES, EXIF_TAG_JPEGACTABLES,
                    EXIF_TAG_YCBCR_COEFFICIENTS, EXIF_TAG_YCBCR_SUB_SAMPLING,
                    EXIF_TAG_YCBCR_POSITIONING, EXIF_TAG_REFERENCE_BLACK_WHITE,
                    EXIF_TAG_STRIP_ROW_COUNTS, EXIF_TAG_APPLICATION_NOTES,
                    EXIF_TAG_RELATED_IMAGE_FILE_FORMAT, EXIF_TAG_RELATED_IMAGE_WIDTH,
                    EXIF_TAG_RELATED_IMAGE_LENGTH, EXIF_TAG_RATING,
                    EXIF_TAG_RATING_PERCENT, EXIF_TAG_IMAGE_ID,
                    EXIF_TAG_WANG_ANNOTATION, EXIF_TAG_MATTEING, EXIF_TAG_DATA_TYPE,
                    EXIF_TAG_IMAGE_DEPTH, EXIF_TAG_TILE_DEPTH, EXIF_TAG_MODEL_2,
                    EXIF_TAG_CFAREPEAT_PATTERN_DIM, EXIF_TAG_CFAPATTERN_2,
                    EXIF_TAG_BATTERY_LEVEL, EXIF_TAG_COPYRIGHT, EXIF_TAG_EXPOSURE_TIME,
                    EXIF_TAG_FNUMBER, EXIF_TAG_MDFILE_TAG, EXIF_TAG_MDSCALE_PIXEL,
                    EXIF_TAG_MDCOLOR_TABLE, EXIF_TAG_MDLAB_NAME,
                    EXIF_TAG_MDSAMPLE_INFO, EXIF_TAG_MDPREP_DATE, EXIF_TAG_MDPREP_TIME,
                    EXIF_TAG_MDFILE_UNITS, EXIF_TAG_PIXEL_SCALE, EXIF_TAG_IPTC_NAA,
                    EXIF_TAG_INTERGRAPH_PACKET_DATA,
                    EXIF_TAG_INTERGRAPH_FLAG_REGISTERS, EXIF_TAG_INTERGRAPH_MATRIX,
                    EXIF_TAG_MODEL_TIE_POINT, EXIF_TAG_SITE, EXIF_TAG_COLOR_SEQUENCE,
                    EXIF_TAG_IT8HEADER, EXIF_TAG_RASTER_PADDING,
                    EXIF_TAG_BITS_PER_RUN_LENGTH,
                    EXIF_TAG_BITS_PER_EXTENDED_RUN_LENGTH, EXIF_TAG_COLOR_TABLE,
                    EXIF_TAG_IMAGE_COLOR_INDICATOR,
                    EXIF_TAG_BACKGROUND_COLOR_INDICATOR, EXIF_TAG_IMAGE_COLOR_VALUE,
                    EXIF_TAG_BACKGROUND_COLOR_VALUE, EXIF_TAG_PIXEL_INTENSITY_RANGE,
                    EXIF_TAG_TRANSPARENCY_INDICATOR, EXIF_TAG_COLOR_CHARACTERIZATION,
                    EXIF_TAG_HCUSAGE, EXIF_TAG_SEMINFO, EXIF_TAG_AFCP_IPTC,
                    EXIF_TAG_MODEL_TRANSFORM, EXIF_TAG_LEAF_DATA,
                    EXIF_TAG_PHOTOSHOP_SETTINGS, EXIF_TAG_EXIF_OFFSET,
                    EXIF_TAG_ICC_PROFILE, EXIF_TAG_IMAGE_LAYER,
                    EXIF_TAG_GEO_TIFF_DIRECTORY, EXIF_TAG_GEO_TIFF_DOUBLE_PARAMS,
                    EXIF_TAG_GEO_TIFF_ASCII_PARAMS, EXIF_TAG_EXPOSURE_PROGRAM,
                    EXIF_TAG_SPECTRAL_SENSITIVITY, EXIF_TAG_GPSINFO, EXIF_TAG_ISO,
                    EXIF_TAG_OPTO__ELECTRIC_CONV_FACTOR, EXIF_TAG_INTERLACE,
                    EXIF_TAG_TIME_ZONE_OFFSET, EXIF_TAG_SELF_TIMER_MODE,
                    EXIF_TAG_FAX_RECV_PARAMS, EXIF_TAG_FAX_SUB_ADDRESS,
                    EXIF_TAG_FAX_RECV_TIME, EXIF_TAG_LEAF_SUB_IFD,
                    EXIF_TAG_EXIF_VERSION, EXIF_TAG_DATE_TIME_ORIGINAL,
                    EXIF_TAG_CREATE_DATE, EXIF_TAG_COMPONENTS_CONFIGURATION,
                    EXIF_TAG_COMPRESSED_BITS_PER_PIXEL, EXIF_TAG_SHUTTER_SPEED_VALUE,
                    EXIF_TAG_APERTURE_VALUE, EXIF_TAG_BRIGHTNESS_VALUE,
                    EXIF_TAG_EXPOSURE_COMPENSATION, EXIF_TAG_MAX_APERTURE_VALUE,
                    EXIF_TAG_SUBJECT_DISTANCE, EXIF_TAG_METERING_MODE,
                    EXIF_TAG_LIGHT_SOURCE, EXIF_TAG_FLASH, EXIF_TAG_FOCAL_LENGTH,
                    EXIF_TAG_FLASH_ENERGY, EXIF_TAG_SPATIAL_FREQUENCY_RESPONSE_1,
                    EXIF_TAG_NOISE_1, EXIF_TAG_FOCAL_PLANE_XRESOLUTION,
                    EXIF_TAG_FOCAL_PLANE_YRESOLUTION,
                    EXIF_TAG_FOCAL_PLANE_RESOLUTION_UNIT,
                    EXIF_TAG_IMAGE_NUMBER_EXIF_IFD,
                    EXIF_TAG_SECURITY_CLASSIFICATION_EXIF_IFD,
                    EXIF_TAG_IMAGE_HISTORY_EXIF_IFD, EXIF_TAG_SUBJECT_LOCATION_1,
                    EXIF_TAG_EXPOSURE_INDEX, EXIF_TAG_TIFF_EPSTANDARD_ID_1,
                    EXIF_TAG_SENSING_METHOD, EXIF_TAG_STO_NITS, EXIF_TAG_SUB_SEC_TIME,
                    EXIF_TAG_SUB_SEC_TIME_ORIGINAL, EXIF_TAG_SUB_SEC_TIME_DIGITIZED,
                    EXIF_TAG_IMAGE_SOURCE_DATA, EXIF_TAG_XPTITLE, EXIF_TAG_XPCOMMENT,
                    EXIF_TAG_XPAUTHOR, EXIF_TAG_XPKEYWORDS, EXIF_TAG_XPSUBJECT,
                    EXIF_TAG_FLASHPIX_VERSION, EXIF_TAG_COLOR_SPACE,
                    EXIF_TAG_EXIF_IMAGE_WIDTH, EXIF_TAG_EXIF_IMAGE_LENGTH,
                    EXIF_TAG_RELATED_SOUND_FILE, EXIF_TAG_INTEROP_OFFSET,
                    EXIF_TAG_FLASH_ENERGY_EXIF_IFD,
                    EXIF_TAG_SPATIAL_FREQUENCY_RESPONSE_2, EXIF_TAG_NOISE_2,
                    EXIF_TAG_FOCAL_PLANE_XRESOLUTION_EXIF_IFD,
                    EXIF_TAG_FOCAL_PLANE_YRESOLUTION_EXIF_IFD,
                    EXIF_TAG_FOCAL_PLANE_RESOLUTION_UNIT_EXIF_IFD,
                    EXIF_TAG_IMAGE_NUMBER, EXIF_TAG_SECURITY_CLASSIFICATION,
                    EXIF_TAG_IMAGE_HISTORY, EXIF_TAG_SUBJECT_LOCATION_2,
                    EXIF_TAG_EXPOSURE_INDEX_EXIF_IFD, EXIF_TAG_TIFF_EPSTANDARD_ID_2,
                    EXIF_TAG_SENSING_METHOD_EXIF_IFD, EXIF_TAG_FILE_SOURCE,
                    EXIF_TAG_SCENE_TYPE, EXIF_TAG_CFAPATTERN, EXIF_TAG_CUSTOM_RENDERED,
                    EXIF_TAG_EXPOSURE_MODE, EXIF_TAG_WHITE_BALANCE_1,
                    EXIF_TAG_DIGITAL_ZOOM_RATIO, EXIF_TAG_FOCAL_LENGTH_IN_35MM_FORMAT,
                    EXIF_TAG_SCENE_CAPTURE_TYPE, EXIF_TAG_GAIN_CONTROL,
                    EXIF_TAG_CONTRAST_1, EXIF_TAG_SATURATION_1, EXIF_TAG_SHARPNESS_1,
                    EXIF_TAG_DEVICE_SETTING_DESCRIPTION,
                    EXIF_TAG_SUBJECT_DISTANCE_RANGE, EXIF_TAG_IMAGE_UNIQUE_ID,
                    EXIF_TAG_GDALMETADATA, EXIF_TAG_GDALNO_DATA, EXIF_TAG_GAMMA,
                    EXIF_TAG_PIXEL_FORMAT, EXIF_TAG_TRANSFOMATION,
                    EXIF_TAG_UNCOMPRESSED, EXIF_TAG_IMAGE_TYPE, EXIF_TAG_IMAGE_WIDTH,
                    EXIF_TAG_IMAGE_HEIGHT, EXIF_TAG_WIDTH_RESOLUTION,
                    EXIF_TAG_HEIGHT_RESOLUTION, EXIF_TAG_IMAGE_OFFSET,
                    EXIF_TAG_IMAGE_BYTE_COUNT, EXIF_TAG_ALPHA_OFFSET,
                    EXIF_TAG_ALPHA_BYTE_COUNT, EXIF_TAG_IMAGE_DATA_DISCARD,
                    EXIF_TAG_ALPHA_DATA_DISCARD, EXIF_TAG_OCE_SCANJOB_DESC,
                    EXIF_TAG_OCE_APPLICATION_SELECTOR, EXIF_TAG_OCE_IDNUMBER,
                    EXIF_TAG_OCE_IMAGE_LOGIC, EXIF_TAG_ANNOTATIONS, EXIF_TAG_PRINT_IM,
                    EXIF_TAG_DNG_VERSION, EXIF_TAG_DNG_BACKWARD_VERSION,
                    EXIF_TAG_UNIQUE_CAMERA_MODEL, EXIF_TAG_LOCALIZED_CAMERA_MODEL,
                    EXIF_TAG_CFAPLANE_COLOR, EXIF_TAG_CFALAYOUT,
                    EXIF_TAG_LINEARIZATION_TABLE, EXIF_TAG_BLACK_LEVEL_REPEAT_DIM,
                    EXIF_TAG_BLACK_LEVEL, EXIF_TAG_BLACK_LEVEL_DELTA_H,
                    EXIF_TAG_BLACK_LEVEL_DELTA_V, EXIF_TAG_WHITE_LEVEL,
                    EXIF_TAG_DEFAULT_SCALE, EXIF_TAG_DEFAULT_CROP_ORIGIN,
                    EXIF_TAG_DEFAULT_CROP_SIZE, EXIF_TAG_COLOR_MATRIX_1,
                    EXIF_TAG_COLOR_MATRIX_2, EXIF_TAG_CAMERA_CALIBRATION_1,
                    EXIF_TAG_CAMERA_CALIBRATION_2, EXIF_TAG_REDUCTION_MATRIX_1,
                    EXIF_TAG_REDUCTION_MATRIX_2, EXIF_TAG_ANALOG_BALANCE,
                    EXIF_TAG_AS_SHOT_NEUTRAL, EXIF_TAG_AS_SHOT_WHITE_XY,
                    EXIF_TAG_BASELINE_EXPOSURE, EXIF_TAG_BASELINE_NOISE,
                    EXIF_TAG_BASELINE_SHARPNESS, EXIF_TAG_BAYER_GREEN_SPLIT,
                    EXIF_TAG_LINEAR_RESPONSE_LIMIT, EXIF_TAG_CAMERA_SERIAL_NUMBER,
                    EXIF_TAG_DNG_LENS_INFO, EXIF_TAG_CHROMA_BLUR_RADIUS,
                    EXIF_TAG_ANTI_ALIAS_STRENGTH, EXIF_TAG_SHADOW_SCALE,
                    EXIF_TAG_DNG_ADOBE_DATA, EXIF_TAG_DNG_PENTAX_DATA,
                    EXIF_TAG_DNG_PRIVATE_DATA, EXIF_TAG_MAKER_NOTE_SAFETY,
                    EXIF_TAG_CALIBRATION_ILLUMINANT_1,
                    EXIF_TAG_CALIBRATION_ILLUMINANT_2, EXIF_TAG_BEST_QUALITY_SCALE,
                    EXIF_TAG_RAW_DATA_UNIQUE_ID, EXIF_TAG_ALIAS_LAYER_METADATA,
                    EXIF_TAG_ORIGINAL_RAW_FILE_NAME, EXIF_TAG_ORIGINAL_RAW_FILE_DATA,
                    EXIF_TAG_ACTIVE_AREA, EXIF_TAG_MASKED_AREAS,
                    EXIF_TAG_AS_SHOT_ICCPROFILE, EXIF_TAG_AS_SHOT_PRE_PROFILE_MATRIX,
                    EXIF_TAG_CURRENT_ICCPROFILE, EXIF_TAG_CURRENT_PRE_PROFILE_MATRIX,
                    EXIF_TAG_OFFSET_SCHEMA, EXIF_TAG_OWNER_NAME,
                    EXIF_TAG_SERIAL_NUMBER, EXIF_TAG_LENS, EXIF_TAG_RAW_FILE,
                    EXIF_TAG_CONVERTER, EXIF_TAG_WHITE_BALANCE_2, EXIF_TAG_EXPOSURE,
                    EXIF_TAG_SHADOWS, EXIF_TAG_BRIGHTNESS, EXIF_TAG_CONTRAST_2,
                    EXIF_TAG_SATURATION_2, EXIF_TAG_SHARPNESS_2, EXIF_TAG_SMOOTHNESS,
                    EXIF_TAG_MOIRE_FILTER,
        
                    EXIF_TAG_USER_COMMENT, //
        
                    EXIF_TAG_MAKER_NOTE));
}
